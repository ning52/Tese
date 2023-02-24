package IOTest;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersionUID=1999999978L;
    private boolean io;
    private int age;
    private String name;

    public int getLongtg() {
        return longtg;
    }

    public void setLongtg(int longtg) {
        this.longtg = longtg;
    }

    private  int longtg;

    public Person(boolean io, int age, String name, int longtg) {
        this.io = io;
        this.age = age;
        this.name = name;
        this.longtg = longtg;
    }

    @Override
    public String toString() {
        return "Person{" +
                "io=" + io +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", longtg=" + longtg +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIo() {
        return io;
    }

    public void setIo(boolean io) {
        this.io = io;
    }
}
