package JavaOOP_2.Person;

public class Information {
    public static void main(String[] args) {
        Person person1 = new Person("Lan Phụng", 26, "Nữ", "Cần Thơ", "0123456789");

        System.out.println("Tên: " + person1.name);
        System.out.println("Tuổi: " + person1.age);
        System.out.println("Giới tính: " + person1.gender);
        System.out.println("Địa chỉ: " + person1.address);
        System.out.println("SĐT: " + person1.phone);

        //Dùng haàm get
//        System.out.println("Tên: " + person1.getName());
//        System.out.println("Tuổi: " + person1.getAge());
//        System.out.println("Giới tính: " + person1.getGender());
//        System.out.println("Địa chỉ: " + person1.getAddress());
//        System.out.println("SĐT: " + person1.getPhone());

    }
}
