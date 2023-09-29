package Modul1Stream;

import java.io.*;

public class Coba8_TryBufferResource {
    public static void main(String[] args) {
        String inFileStr = "src/Modul1Stream/data/test-in.jpeg";
        String outFileStr = "src/Modul1Stream/data/test-out.jpeg";

        long startTime, elapsedTime; // untuk melihat waktu pemrosesan

        // Mencetak besar file
        File fileIn = new File(inFileStr);
        System.out.println("File size is " + fileIn.length() + " bytes");

        try (
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFileStr));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFileStr))
        ){
            startTime = System.nanoTime();
            int byteRead;

            // Membaca sebuah byte mentah, mengembalikan sebuah int dari 0 sampai 255.
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }

            elapsedTime = System.nanoTime() - startTime;
            System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
