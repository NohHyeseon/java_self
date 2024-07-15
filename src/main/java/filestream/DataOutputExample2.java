package filestream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataOutputExample2 {
    public static void main(String[] args) {
        //읽기
        File file = new File("C:\\Intel\\Profiles\\output.txt");
        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(file);
            dis = new DataInputStream(fis);

            String name = dis.readUTF();
            int age = dis.readInt();
            double kg = dis.readDouble();

            System.out.println(name + "," + age + "살," + kg + "kg");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null) dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
