package JavaOOP_2.Person;

public class Person {

    public String name;
    public int age;
    public String gender;

    protected String address;
    protected String phone;

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    // Dùng Hàm get
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    protected String getAddress() {
//        return address;
//    }
//
//    protected String getPhone() {
//        return phone;
//    }
}
