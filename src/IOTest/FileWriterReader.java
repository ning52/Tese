package IOTest;

import java.io.*;

public class FileWriterReader {

    public static void main(String[] args) {
        FileWriterReader fwr=new FileWriterReader();
//        fwr.ReaderTese();             //引用字符输出流
//        fwr.WriterTest();             //引用字符输入流
        fwr.ReaderWriterTest();       //引用输入输出来复制文件


    }

    public void ReaderTese() {       //Reader字符输出流
        FileReader fileReader=null;
        try{
            File file = new File("D:\\IO\\JavaIO.txt");
            fileReader = new FileReader(file);
            char[] charTest=new char[5];
            int charlength;
            while ((charlength=fileReader.read(charTest))!=-1) {
                String chatend=new String(charTest,0,charlength);
                System.out.print(chatend);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fileReader!=null){
                try{
                    fileReader.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void WriterTest(){            //Writer字符输入流
        FileWriter fileWriter= null;
        try {
            File file = new File("D:\\IO\\JavaIO1.txt");
            fileWriter = new FileWriter(file);
            fileWriter.write("ashh");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            if (fileWriter!=null){
                try{
                    fileWriter.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void ReaderWriterTest(){  //利用字符输入输出复制一份文件

        FileReader ReaderTest=null;
        FileWriter WriterTest=null;
        try{
            File FileReader=new File("D:\\IO\\JavaIO1.txt");
            File FileWrter=new File("D:\\IO\\JavaIO01.txt");
            ReaderTest=new FileReader(FileReader);
            WriterTest=new FileWriter(FileWrter);
            char[] chars=new char[5];
            int IntReader;
            while ((IntReader=ReaderTest.read(chars))!=-1){
                WriterTest.write(chars,0,IntReader);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if (ReaderTest!=null){
            }if (WriterTest!=null){
                try{
                    WriterTest.close();
                    ReaderTest.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
