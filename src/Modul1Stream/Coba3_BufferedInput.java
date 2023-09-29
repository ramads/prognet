package Modul1Stream;

import java.io.*;

public class Coba3_BufferedInput {

    public static void main(String[] args) {

        FileInputStream myFile = null;
        BufferedInputStream buff = null;

        try {
            //membuat stream myFile yang merujuk pada suatu file
            myFile = new FileInputStream("src/Modul1Stream/data/abc.dat");
            buff = new BufferedInputStream(myFile);	//memasukkan stream myFile ke buffered stream buff
            boolean eof = false;
            while (!eof) {
                int byteValue = buff.read(); //membaca isi buff dan disimpan ke byteValue
                System.out.print(byteValue + ", ");
                if (byteValue == -1){
                    eof = true;
                }
            }

        } catch (IOException e){
            System.out.println("Tidak bisa membaca file" + e.toString());
        }
        finally {
            if (myFile !=null){
                try {
                    buff.close();	//menutup stream
                    myFile.close();	//menutup stream
                }	catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        }
    }
}

