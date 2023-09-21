package ModulStream;

import java.io.*;

// Menulis pesan pada sebuah file, kemudian membacanya kembali
// FileReader/FileWriter menggunakan encoding charset default.
public class Coba9_BufferedReaderWriter {
    public static void main(String[] args) {
        String strFilename = "src/ModulStream/data/out.txt";
        String message = "Hello, world!\r\nHello, world again!\r\n"; // 2 lines of texts

        // Mencetak default charset
        System.out.println(java.nio.charset.Charset.defaultCharset());

        try (BufferedWriter out = new BufferedWriter(new FileWriter(strFilename))) {
            out.write(message);
            out.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (BufferedReader in = new BufferedReader(new FileReader(strFilename))) {
            String inLine;
            while ((inLine = in.readLine()) != null) {
                System.out.println(inLine);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

