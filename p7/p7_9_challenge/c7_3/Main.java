package p7.p7_9_challenge.c7_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("田中太郎", 41);
        Department department = new Department("総務部", employee);

        try (FileOutputStream fos = new FileOutputStream("p7/p7_9_challenge/c7_3/company.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(department);
            // oos.flush(); tryリソース文を利用する場合flushは不要

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Employee implements Serializable {
    private static final long serialVersionUID = 2255479256720244258L;
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Department implements Serializable {
    private static final long serialVersionUID = 5318984701607464686L;
    String name;
    Employee leader;

    public Department(String name, Employee leader) {
        this.name = name;
        this.leader = leader;
    }

}