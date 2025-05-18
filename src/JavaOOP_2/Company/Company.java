package JavaOOP_2.Company;

import JavaOOP_2.Person.Person;

public class Company {
    public static void main(String[] args) {
        Person person2 = new Person("Ngọc Thảo", 30, "Nữ", "Cần Thơ", "0147258963");

        System.out.println("Tên: " + person2.name);
        System.out.println("Tuổi: " + person2.age);
        System.out.println("Giới tính: " + person2.gender);

        //Dùng hàm get
//        System.out.println("Tên: " + person2.getName());
//        System.out.println("Tuổi: " + person2.getAge());
//        System.out.println("Giới tính: " + person2.getGender());
    }
}
