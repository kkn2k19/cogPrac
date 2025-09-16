// method that throws IOException

import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt"); // risky
        fr.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found : " + e.getMessage());
        }
    }
}

// e:\Karan_codes\Java\cogPrac\Exception_Handling>cd
// "e:\Karan_codes\Java\cogPrac\Exception_Handling\" && javac ThrowsDemo.java &&
// java ThrowsDemo && del ThrowsDemo.class
// File not found : test.txt (The system cannot find the file specified)