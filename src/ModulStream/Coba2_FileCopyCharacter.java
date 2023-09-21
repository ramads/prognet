package ModulStream;

import java.io.*;

public class Coba2_FileCopyCharacter {
    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("src/ModulStream/data/input.txt"); //membuat stream inputStream
            outputStream = new FileWriter("src/ModulStream/data/output.txt"); //Membuat stream outputStream

            int c;
            while ((c = inputStream.read()) != -1) {    //membaca tiap2 karakter dan menuliskannya
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();		//menutup inputStream
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {  try {
                outputStream.close();	//menutup outputStream
            }
            catch (IOException e) {  e.printStackTrace();
            }
            }
        }
    }
}

