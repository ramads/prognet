package ModulStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Coba4_BufferedOutput {

    public static void main (String [] args){
        String fileLocation = "src/ModulStream/data/xyz.dat";
        int someData[] = {733, 110, 105, 32, 97, 100, 97, 108, 97, 104, 32, 102, 105, 108, 101, 32, 116, 101, 115, 116, 32, 112, 101, 114, 116, 97, 109, 97};

        FileOutputStream myFile = null;
        BufferedOutputStream buff = null;


        try {
            myFile = new FileOutputStream(fileLocation); //membuat stream FileOutputStream
            buff = new BufferedOutputStream(myFile);

            for (int i = 0; i < someData.length; i++){
                myFile.write(someData[i]);
            }
        }
        catch (IOException e) {
            System.out.println("Tidak bisa menulis pada file" + e.toString());
        } finally {
            if (myFile !=null){
                try{
                    buff.flush();
                    buff.close();
                    myFile.close();
                }catch (Exception e1){
                    e1.printStackTrace();
                }

            }
        }
    }

}

