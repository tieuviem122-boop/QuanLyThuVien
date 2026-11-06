import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== NHẬP THÔNG TIN SÁCH ===");
        
        System.out.print("1. Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("2. Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("3. Nhập tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("4. Nhập năm xuất bản: ");
        int namXuatBan = sc.nextInt();

        System.out.print("5. Nhập đơn giá: ");
        double donGia = sc.nextDouble();

        System.out.print("6. Nhập số lượng: ");
        int soLuong = sc.nextInt();

        System.out.println("7. Chọn loại sách (1: Sách giáo khoa | 2: Sách tham khảo | 3: Sách chuyên ngành | 4: Sách khác): ");
        System.out.print("   Nhập lựa chọn của bạn (1-4): ");
        int chonLoai = sc.nextInt();

        System.out.println("\n=== KIỂM TRA VÀ PHÂN LOẠI SÁCH (TUẦN 4) ===");

        int namHienTai = 2026;
        if (donGia > 0 && soLuong >= 0 && namXuatBan > 0 && namXuatBan <= namHienTai) {
            System.out.println("-> Kiểm tra (Bài 1): Thông tin sách HỢP LỆ.");

            double thanhTien = donGia * soLuong;
            double phiVanChuyen = thanhTien * 0.05;
            double tongTienNhap = thanhTien + phiVanChuyen;

            System.out.println("\n--- THÔNG TIN SÁCH & GIÁ TRỊ NHẬP KHO (TUẦN 3) ---");
            System.out.println("Mã sách        : " + maSach);
            System.out.println("Tên sách       : " + tenSach);
            System.out.println("Tác giả        : " + tacGia);
            System.out.println("Năm xuất bản   : " + namXuatBan);
            System.out.println("Đơn giá        : " + donGia);
            System.out.println("Số lượng       : " + soLuong);
            System.out.println("Thành tiền     : " + thanhTien);
            System.out.println("Phí vận chuyển : " + phiVanChuyen);
            System.out.println("Tổng tiền nhập : " + tongTienNhap);

            System.out.print("\n-> Phân loại giá (Bài 2): ");
            if (donGia < 50000) {
                System.out.println("Sách giá thấp");
            } else if (donGia <= 100000) {
                System.out.println("Sách giá trung bình");
            } else if (donGia <= 200000) {
                System.out.println("Sách giá cao");
            } else {
                System.out.println("Sách giá đặc biệt");
            }

            System.out.print("-> Phân loại tồn kho (Bài 3): ");
            if (soLuong == 0) {
                System.out.println("Hết sách");
            } else if (soLuong >= 1 && soLuong <= 5) {
                System.out.println("Sắp hết");
            } else if (soLuong >= 6 && soLuong <= 20) {
                System.out.println("Còn ít");
            } else {
                System.out.println("Còn nhiều");
            }

            System.out.print("-> Loại sách (Bài 4): ");
            switch (chonLoai) {
                case 1:
                    System.out.println("Sách giáo khoa");
                    break;
                case 2:
                    System.out.println("Sách tham khảo");
                    break;
                case 3:
                    System.out.println("Sách chuyên ngành");
                    break;
                case 4:
                    System.out.println("Sách khác");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ (Sách khác)");
                    break;
            }

        } else {
            System.out.println("-> Kiểm tra (Bài 1): Thông tin sách KHÔNG HỢP LỆ!");
            if (donGia <= 0) {
                System.out.println("   + Lỗi: Đơn giá phải lớn hơn 0.");
            }
            if (soLuong < 0) {
                System.out.println("   + Lỗi: Số lượng phải lớn hơn hoặc bằng 0.");
            }
            if (namXuatBan <= 0 || namXuatBan > namHienTai) {
                System.out.println("   + Lỗi: Năm xuất bản không hợp lệ (phải từ 1 đến " + namHienTai + ").");
            }
        }

        sc.close();
    }
}