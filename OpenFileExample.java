import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

public class OpenFileExample {
    public static void main(String[] args) {
        File file = new File("file.txt"); // Replace with your file path
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);

            int content;
            while ((content = fis.read()) != -1) {
                // process the content
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
