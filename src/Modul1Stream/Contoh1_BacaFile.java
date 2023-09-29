package Modul1Stream;

import java.io.*;

public class Contoh1_BacaFile {
    public static void main(String[] args) {
        String filePath = "src/Modul1Stream/data/data.txt";

        BufferedInputStream fileStream = null;

        try {
            fileStream = new BufferedInputStream(new FileInputStream(filePath));
            boolean eof = false;

            while (!eof) {
                int data = fileStream.read();
                System.out.print(data + ", ");

                if ( data == -1) {
                    eof = true;
                }
            }
        } catch (IOException e) {
            System.out.println("File tidak bisa terbaca: " + e.toString());
        } finally {
            try {
                if (fileStream != null)  fileStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
