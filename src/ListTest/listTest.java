package ListTest;

public class listTest {

    public static void main(String[] args) {

        list l1=new list("张三",30);
        list l2=new list("李四",80);

        System.out.println(l1.toString());
        l2.age=99;
        System.out.println(l2.toString());
    }
}
class list{
    String name;
    int age;
    public list(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "list{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}