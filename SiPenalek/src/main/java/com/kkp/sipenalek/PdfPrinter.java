package com.kkp.sipenalek;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.io.IOException;

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

	    // Draw title
	    contentStream.setFont(PDType1Font.HELVETICA_BOLD, 16);
	    contentStream.setLeading(20);
	    contentStream.beginText();
	    contentStream.newLineAtOffset(margin, yStart);
	    contentStream.showText(title);
	    contentStream.endText();

	    // Adjust yPosition
	    yPosition -= 40; // Space for the title

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
	            contentStream.setNonStrokingColor(Color.lightGray); // Set alternate row background color
	            contentStream.setLineWidth(1f);
	            contentStream.moveTo(margin, yPosition);
	            contentStream.lineTo(margin + tableWidth, yPosition);
	            contentStream.stroke();
	        }

	        yPosition -= rowHeight;
	        contentStream.setNonStrokingColor(Color.BLACK); // Set text color to black
	        contentStream.setLineWidth(1f);
	        contentStream.moveTo(margin, yPosition);
	        contentStream.lineTo(margin + tableWidth, yPosition);
	        contentStream.stroke();

	        for (int col = 0; col < numColumns; col++) {
	            Object cellValue = reportTable.getValueAt(row, col);
	            contentStream.beginText();
	            contentStream.newLineAtOffset(margin + (tableWidth / numColumns) * col + cellMargin, yPosition + cellMargin);
	            contentStream.showText(cellValue.toString());
	            contentStream.endText();
	        }
	    }

	    contentStream.setLineWidth(1f);
	    contentStream.moveTo(margin, yPosition);
	    contentStream.lineTo(margin + tableWidth, yPosition);
	    contentStream.stroke();

	    contentStream.close();

	    document.save(outputPath);
	    document.close();
	}
}
