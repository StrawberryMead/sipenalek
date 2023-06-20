package com.kkp.sipenalek;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class PdfOpener {
    public static void openPDF(String filePath) {
        try {
            File file = new File(filePath);
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                } else {
                    System.out.println("Tidak dapat membuka PDF");
                }
            } else {
                System.out.println("PDF tidak ditemukan");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}