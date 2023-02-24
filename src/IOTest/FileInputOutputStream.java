package IOTest;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {


    @Test
    public void FileIuptStream(){      //使用字节输出流读取文件
        FileInputStream inputStream=null;
        FileOutputStream outputStream=null;
        try {
            File file=new File("D:\\IO\\JavaIO.jpeg");
            inputStream=new FileInputStream(file);
            outputStream=new FileOutputStream("D:\\IO\\JavaIO01.txt");
            byte[] bytes=new byte[5];
            int len;
            while((len=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
//                String byelength=new String(bytes,0,len);
//                System.out.println(byelength);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (inputStream!=null){
                try {
                    inputStream.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
