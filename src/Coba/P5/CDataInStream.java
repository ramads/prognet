package Coba.P5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * created on 9/22/23 10:32
 * by ramads
 */

public class CDataInStream {
    public static void main(String[] args) throws IOException  {
        FileOutputStream fo = new FileOutputStream("src/Coba/dis.txt");
        DataOutputStream dos = new DataOutputStream(fo);

        dos.writeUTF("F1D008008");
        dos.writeInt(18);
        dos.writeDouble(90.5);

        dos.close();


    }
}
