package Coba.P5;

import java.io.*;

/**
 * created on 9/22/23 10:32
 * by ramads
 */

public class CDataOutStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fo = new FileInputStream("src/Coba/dis.txt");
        DataInputStream dos = new DataInputStream(fo);

        while (dos.available() > 0) {
            System.out.println(dos.readUTF());
            System.out.println(dos.readInt());
            System.out.println(dos.readDouble());
        }
    }
}
