package JavaOOP_1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("B123","Lan Phụng", 26, "Cần Thơ");
        NhanVien nhanVien2 = new NhanVien("B124","Ngọc Thảo", 30, "Cần Thơ");

        nhanVien1.showInfo();
        nhanVien2.showInfo();
    }
}
