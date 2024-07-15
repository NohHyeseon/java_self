package file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Intel\\Profiles");
        file.createNewFile();

        System.out.println("isFile(): " + file.isFile());
        System.out.println("isDirectory(): " + file.isDirectory());
        System.out.println("getName(): " + file.getName());
        System.out.println("getAbsolutePath(): " + file.getAbsolutePath());
        System.out.println("getPath(): " + file.getPath());
        System.out.println("canWrite(): " + file.canWrite());
        System.out.println("canRead(): " + file.canRead());
    }
}
