package ModulStream;

import java.io.*;

public class Coba6_FileCopyBufferedStream {
    public static void main(String[] args) {
        String inFileStr = "src/ModulStream/data/test-in.jpeg";
        String outFileStr = "src/ModulStream/data/test-out.jpeg";

        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        long startTime, elapsedTime; // untuk melihat waktu pemrosesan

        // Mencetak besar file
        File fileIn = new File(inFileStr);
        System.out.println("File size is " + fileIn.length() + " bytes");
        try {
            in = new BufferedInputStream(new FileInputStream(inFileStr));
            out = new BufferedOutputStream(new FileOutputStream(outFileStr));

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

        } finally { // selalu tutup I/O streams
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
