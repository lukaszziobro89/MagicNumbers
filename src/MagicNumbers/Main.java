package MagicNumbers;

import java.io.*;
import static MagicNumbers.app.MagicNumbers.*;

public class Main {
    public static void main(String[] args) {
            // load file as arg
        File file = new File(args[0]);

            // check the file
        checkTheFile(file);
    }
}
