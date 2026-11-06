import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAX = 100;
        String[] maSach = new String[MAX];
        String[] tenSach = new String[MAX];
        String[] tacGia = new String[MAX];
        int[] namXuatBan = new int[MAX];
        double[] donGia = new double[MAX];
        int[] soLuong = new int[MAX];
        int[] loaiSach = new int[MAX];

        int n = 0;
        int chon;

        do {
            System.out.println("\n========== QUẢN LÝ THƯ VIỆN ==========");
            System.out.println("1. Nhập n sách");
            System.out.println("2. Tính tổng số lượng và tổng giá trị sách");
            System.out.println("3. Tìm sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập số lượng sách cần thêm: ");
                    int soLuongThem = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < soLuongThem; i++) {
                        System.out.println("\nNhập sách thứ " + (n + 1) + ":");
                        System.out.print("Mã sách: ");
                        maSach[n] = sc.nextLine();

                        System.out.print("Tên sách: ");
                        tenSach[n] = sc.nextLine();

                        System.out.print("Tác giả: ");
                        tacGia[n] = sc.nextLine();

                        System.out.print("Năm xuất bản: ");
                        namXuatBan[n] = sc.nextInt();

                        System.out.print("Đơn giá: ");
                        donGia[n] = sc.nextDouble();

                        System.out.print("Số lượng: ");
                        soLuong[n] = sc.nextInt();

                        System.out.print("Loại sách (1: SGK | 2: Tham khảo | 3: Chuyên ngành | 4: Khác): ");
                        loaiSach[n] = sc.nextInt();
                        sc.nextLine();

                        n++;
                    }
                    break;

                case 2:
                    int tongSoLuong = 0;
                    double tongGiaTri = 0;

                    for (int i = 0; i < n; i++) {
                        tongSoLuong += soLuong[i];
                        tongGiaTri += soLuong[i] * donGia[i];
                    }

                    System.out.println("Tổng số lượng sách: " + tongSoLuong);
                    System.out.println("Tổng giá trị sách: " + tongGiaTri);
                    break;

                case 3:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maCanTim = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < n; i++) {
                        if (maSach[i].equalsIgnoreCase(maCanTim)) {
                            System.out.println("Mã sách: " + maSach[i]);
                            System.out.println("Tên sách: " + tenSach[i]);
                            System.out.println("Tác giả: " + tacGia[i]);
                            System.out.println("Năm xuất bản: " + namXuatBan[i]);
                            System.out.println("Đơn giá: " + donGia[i]);
                            System.out.println("Số lượng: " + soLuong[i]);
                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Không tìm thấy sách có mã: " + maCanTim);
                    }
                    break;

                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (chon != 0);

        sc.close();
    }
}