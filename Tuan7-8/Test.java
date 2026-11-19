import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        System.out.print("Nhập số lượng sách: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            Sach s = new Sach();
            System.out.println("\nNhập sách thứ " + (i + 1) + ":");
            System.out.print("Mã sách: ");
            s.maSach = sc.nextLine();
            System.out.print("Tiêu đề: ");
            s.tieuDe = sc.nextLine();
            System.out.print("Tác giả: ");
            s.tacGia = sc.nextLine();
            System.out.print("Năm xuất bản: ");
            s.namXuatBan = sc.nextInt();
            System.out.print("Số lượng: ");
            s.soLuong = sc.nextInt();
            sc.nextLine();

            danhSachSach.add(s);
        }

        System.out.println("\nDANH SÁCH SÁCH:");
        for (int i = 0; i < danhSachSach.size(); i++) {
            danhSachSach.get(i).hienThiThongTin();
        }

        sc.close();
    }
}