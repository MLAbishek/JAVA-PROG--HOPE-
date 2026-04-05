import java.io.File;
import java.io.FileReader;
import java.util.*;

import javax.tools.FileObject;

import java.io.FileWriter;
import java.io.IOException;

public class basic {
    public static void main(String[] args) {

        try {
            File oj = new File("test.txt");
            Scanner fw = new Scanner(oj);
            while (fw.hasNextLine()) {
                String data = fw.nextLine();
                System.out.println(data);
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
