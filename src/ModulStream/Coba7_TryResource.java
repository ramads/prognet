package ModulStream;

import java.io.*;

public class Coba7_TryResource {
    public static void main(String[] args) {
        String inFileStr = "src/ModulStream/data/test-in.jpeg";
        String outFileStr = "src/ModulStream/data/test-out.jpeg";

        long startTime, elapsedTime; // untuk melihat waktu pemrosesan

        // Mencetak besar file
        File fileIn = new File(inFileStr);
        System.out.println("File size is " + fileIn.length() + " bytes");

        try (
            FileInputStream in = new FileInputStream(inFileStr);
            FileOutputStream out = new FileOutputStream(outFileStr)
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
