package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.writeInt(100);
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());
        rf.writeDouble(100.0);
        System.out.println("파일 포인터 위치: "+rf.getFilePointer());
        rf.writeUTF("안농하세요");
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());

        rf.seek(0);
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println("파일 포인터 위치: " +rf.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);


        String fileName = "random.txt";
        try(RandomAccessFile rf2 = new RandomAccessFile(fileName, "rw")) {
            rf.writeInt(100);
            rf2.writeDouble(100.0);

        }
        File file = new File(fileName);
        if(file.exists()){
            System.out.println(fileName +"파일 있음");
        }else {
            System.out.println(fileName +"no");
        } //파일 생성 여부 확인
    }
}
