package ModulStream;

import java.io.*;

public class Coba2_FileCopyCharacter {
    public static void main(String[] args) {
        String fileInputLoc = "src/ModulStream/data/input.txt";
        String fileOutputLoc = "src/ModulStream/data/output.txt";

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            //membuat stream inputStream
            inputStream = new FileReader(fileInputLoc);
            //Membuat stream outputStream
            outputStream = new FileWriter(fileOutputLoc);

            int c;
            while ((c = inputStream.read()) != -1) {    //membaca tiap2 karakter dan menuliskannya
                outputStream.write(c);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.toString());
        } finally {
            try {
                if (inputStream != null) inputStream.close();		//menutup inputStream
                if (outputStream != null) outputStream.close();	//menutup outputStream
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

