package com.kkp.sipenalek;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class PdfPrinter {
    public static void generateReportToPDF(JTable reportTable, String title, String outputPath) throws IOException {

        PDDocument document = new PDDocument();
        PDPage page = new PDPage(PDRectangle.A2);
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        float margin = 50;
        float yStart = page.getMediaBox().getHeight() - margin;
        float tableWidth = page.getMediaBox().getWidth() - 2 * margin;
        float yPosition = yStart;
        float bottomMargin = 70;

        int numRows = reportTable.getRowCount();
        int numColumns = reportTable.getColumnCount();
        float rowHeight = 20;
        float tableHeight = rowHeight * numRows;
        float cellMargin = 5;

        // Load the logo image
        InputStream logoStream = PdfPrinter.class.getResourceAsStream("/logo.png");
        ByteArrayOutputStream logoByteArray = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = logoStream.read(buffer)) != -1) {
            logoByteArray.write(buffer, 0, bytesRead);
        }
        logoByteArray.flush();
        PDImageXObject logoImage = PDImageXObject.createFromByteArray(document, logoByteArray.toByteArray(), "logo");

        // Draw the logo
        float logoWidth = 100; // Adjust the logo width as needed
        float logoHeight = 50; // Adjust the logo height as needed
        float logoX = margin;
        float logoY = page.getMediaBox().getHeight() - margin - logoHeight;  // Adjust the logo position as needed
        contentStream.drawImage(logoImage, logoX, logoY, logoWidth, logoHeight);

        // Draw company name, address, and phone number
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.setLeading(14);
        contentStream.beginText();
        contentStream.newLineAtOffset(logoX + logoWidth + 10, yPosition - 10);
        contentStream.showText("PT DIC Trading Indonesia");
        contentStream.newLine();
        contentStream.showText("Jl. Rawagelam III Kav. 8-9 Rawa Terate Cakung");
        contentStream.newLine();
        contentStream.showText("Jakarta Timur DKI Jakarta, RW.9, Jatinegara, Kec. Cakung");
        contentStream.newLine();
        contentStream.showText("Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13930, Indonesia");
        contentStream.newLine();
        contentStream.showText("No. Tel: +62 21 4613525");
        contentStream.endText();

        // Calculate title width and position
        float titleWidth = PDType1Font.HELVETICA_BOLD.getStringWidth(title) / 1000 * 16;
        float titleX = (page.getMediaBox().getWidth() - titleWidth) / 2;
        float titleY = logoY - 20 - 20;

        // Draw title
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 16);
        contentStream.setLeading(20);
        contentStream.beginText();
        contentStream.newLineAtOffset(titleX, titleY);
        contentStream.showText(title);
        contentStream.endText();

        // Adjust yPosition
        yPosition = titleY - 40; // Space for the title

        // Draw table headers
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.setLineWidth(1f);
        contentStream.moveTo(margin, yPosition);
        contentStream.lineTo(margin + tableWidth, yPosition);
        contentStream.stroke();

        contentStream.beginText();
        contentStream.newLineAtOffset(margin, yPosition - 15);
        for (int col = 0; col < numColumns; col++) {
            String header = reportTable.getColumnName(col);
            contentStream.showText(header);
            contentStream.newLineAtOffset(tableWidth / numColumns, 0);
        }
        contentStream.endText();

        yPosition -= rowHeight;

        // Draw table content
        contentStream.setFont(PDType1Font.HELVETICA, 12);
        for (int row = 0; row < numRows; row++) {
            if (row % 2 == 0) {
                contentStream.setNonStrokingColor(java.awt.Color.lightGray); // Set alternate row background color
                contentStream.setLineWidth(1f);
                contentStream.moveTo(margin, yPosition);
                contentStream.lineTo(margin + tableWidth, yPosition);
                contentStream.stroke();
            }

            yPosition -= rowHeight;
            contentStream.setNonStrokingColor(java.awt.Color.BLACK); // Set text color to black
            contentStream.setLineWidth(1f);
            contentStream.moveTo(margin, yPosition);
            contentStream.lineTo(margin + tableWidth, yPosition);
            contentStream.stroke();

            for (int col = 0; col < numColumns; col++) {
                Object cellValue = reportTable.getValueAt(row, col);
                contentStream.beginText();
                contentStream.newLineAtOffset(margin + (tableWidth / numColumns) * col + cellMargin,
                        yPosition + cellMargin);
                contentStream.showText(cellValue.toString());
                contentStream.endText();
            }
        }

        // Draw signature column
        float signatureX = margin + tableWidth - 80;
        float signatureY = yPosition - 60; // Mengatur jarak vertikal menjadi 120px

        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
        contentStream.beginText();
        contentStream.newLineAtOffset(signatureX, signatureY);
        contentStream.showText("Jakarta, " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
        contentStream.endText();

        float lineStartX = signatureX;
        float lineEndX = signatureX + 100;
        float lineY = signatureY - 80;

        contentStream.setLineWidth(1f);
        contentStream.moveTo(lineStartX, lineY);
        contentStream.lineTo(lineEndX, lineY);
        contentStream.stroke();

        // Draw signature name and position
        float textX = signatureX;
        float textY = lineY - 15; // Menurunkan posisi teks di bawah garis

        contentStream.setFont(PDType1Font.HELVETICA, 12);
        contentStream.beginText();
        contentStream.newLineAtOffset(textX, textY);
        contentStream.showText("Siswanto");
        contentStream.newLine();
        contentStream.showText("Kepala Divisi");
        contentStream.endText();
        contentStream.close();

        document.save(outputPath);
        document.close();
    }
}
