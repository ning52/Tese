package IOTest;

import java.io.*;

public class ObjectInputOuputStreamTest {

    public static void main(String[] args) {
        ObjectInputOuputStreamTest oiost=new ObjectInputOuputStreamTest();
        oiost.ObjectOutputStream();
        oiost.ObjectInputStreamTest();
    }

    public void ObjectOutputStream() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:\\IO\\ObjectTest.txt"));
            oos.writeObject(new String("我在上海吃上海炸酱面"));
            oos.flush();
            oos.writeObject(new Person(false,89,"上海",78887));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public void ObjectInputStreamTest(){
        ObjectInputStream ois= null;
        try {
            ois = new ObjectInputStream(new FileInputStream("D:\\IO\\ObjectTest.txt"));
            Object obj=ois.readObject();
            String str=(String)obj;
            System.out.println(str);
            Person per=(Person) ois.readObject();
            System.out.println(per);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
            finally {
            if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
