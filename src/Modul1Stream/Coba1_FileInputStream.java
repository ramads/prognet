package Modul1Stream;

import java.io.*;

public class Coba1_FileInputStream {
    public static void main(String[] args) {
        // sesuaikan file path dengan lokasi masing-masing
        String fileLocation = "src/Modul1Stream/data/abc.dat";
        FileInputStream myFile = null;

        try {
            myFile = new FileInputStream(fileLocation); //membuat stream FileInputStream

            boolean eof = false; //variabel yang akan menentukan status akhir file
            while (!eof) {
                int byteValue = myFile.read(); //membaca file yang hasilnya akan dimasukkan ke byteValue
                System.out.print(byteValue + ", ");

                if (byteValue == -1){ //akhir dari file di
                    eof = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Tidak bisa membaca file" + e.toString());
        } finally {
            if (myFile != null){
                try {
                    myFile.close(); //menutup file
                }
                catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}