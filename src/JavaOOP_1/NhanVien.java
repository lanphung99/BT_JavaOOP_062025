package JavaOOP_1;

public class NhanVien {

    public String msnv;
    public String name;
    public int age;
    public String address;

    public NhanVien(String msnv, String name, int age, String address) {
        this.msnv = msnv;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void showInfo() {
        System.out.println("Mã số nhân viên: " + msnv);
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
    }

}
