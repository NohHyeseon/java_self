package filestream;

import java.io.*;

public class DataOutputExample {
    public static void main(String[] args) {
        //파일 생성
        File file = new File("C:\\Intel\\Profiles\\output.txt");
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try{
            fos = new FileOutputStream(file);
            dos = new DataOutputStream(fos);

            String name ="젤리";
            int age = 7;
            double kg = 3.3;

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeDouble(3.3);
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(dos!=null) dos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    }



