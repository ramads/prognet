package Coba.P5;

import java.io.*;

/**
 * created on 9/22/23 09:08
 * by ramads
 */

public class CFileInputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fs = null;
        BufferedInputStream bs = null;

        fs = new FileInputStream("src/Coba/data.bin");
        bs = new BufferedInputStream(fs);

        int temp = 0;
        while ((temp = bs.read()) != -1) {
            System.out.print((char)temp);
        }

        fs.close();
    }
}
