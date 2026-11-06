import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> dsMaSach = new ArrayList<>();
        ArrayList<String> danhSachSach = new ArrayList<>();
        ArrayList<Integer> dsSoLuong = new ArrayList<>();
        ArrayList<Double> dsDonGia = new ArrayList<>();

        int chon;

        do {
            System.out.println("\n========== QUẢN LÝ THƯ VIỆN ==========");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Sửa sách");
            System.out.println("6. Tính tổng số lượng");
            System.out.println("7. Tính tổng giá trị");
            System.out.println("8. Thoát");
            System.out.println("9. Nhập mảng số lượng 5 cuốn sách (Bài 1)");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhập số lượng sách cần thêm: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhập sách thứ " + (danhSachSach.size() + 1) + ":");
                        System.out.print("Mã sách: ");
                        String ma = sc.nextLine();

                        System.out.print("Tên sách: ");
                        String ten = sc.nextLine();

                        System.out.print("Tác giả: ");
                        String tacGia = sc.nextLine();

                        System.out.print("Năm xuất bản: ");
                        int namXB = sc.nextInt();

                        System.out.print("Đơn giá: ");
                        double gia = sc.nextDouble();

                        System.out.print("Số lượng: ");
                        int sl = sc.nextInt();
                        sc.nextLine();

                        String thongTin = "Mã: " + ma + " | Tên: " + ten + " | Tác giả: " + tacGia + " | Năm XB: " + namXB + " | Giá: " + gia + " | SL: " + sl;

                        dsMaSach.add(ma);
                        danhSachSach.add(thongTin);
                        dsSoLuong.add(sl);
                        dsDonGia.add(gia);
                    }
                    break;

                case 2:
                    if (danhSachSach.size() == 0) {
                        System.out.println("Danh sách trống!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println((i + 1) + ". " + danhSachSach.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maTim)) {
                            System.out.println("Tìm thấy: " + danhSachSach.get(i));
                            timThay = true;
                            break;
                        }
                    }

                    if (!timThay) {
                        System.out.println("Không tìm thấy sách có mã: " + maTim);
                    }
                    break;

                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = sc.nextLine();
                    boolean daXoa = false;

                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maXoa)) {
                            dsMaSach.remove(i);
                            danhSachSach.remove(i);
                            dsSoLuong.remove(i);
                            dsDonGia.remove(i);
                            System.out.println("Đã xóa sách thành công!");
                            daXoa = true;
                            break;
                        }
                    }

                    if (!daXoa) {
                        System.out.println("Không tìm thấy mã sách để xóa!");
                    }
                    break;

                case 5:
                    System.out.print("Nhập mã sách cần sửa: ");
                    String maSua = sc.nextLine();
                    boolean daSua = false;

                    for (int i = 0; i < dsMaSach.size(); i++) {
                        if (dsMaSach.get(i).equalsIgnoreCase(maSua)) {
                            System.out.print("Nhập tên sách mới: ");
                            String tenMoi = sc.nextLine();

                            System.out.print("Nhập tác giả mới: ");
                            String tacGiaMoi = sc.nextLine();

                            System.out.print("Nhập năm xuất bản mới: ");
                            int namMoi = sc.nextInt();

                            System.out.print("Nhập đơn giá mới: ");
                            double giaMoi = sc.nextDouble();

                            System.out.print("Nhập số lượng mới: ");
                            int slMoi = sc.nextInt();
                            sc.nextLine();

                            String thongTinMoi = "Mã: " + maSua + " | Tên: " + tenMoi + " | Tác giả: " + tacGiaMoi + " | Năm XB: " + namMoi + " | Giá: " + giaMoi + " | SL: " + slMoi;

                            danhSachSach.set(i, thongTinMoi);
                            dsSoLuong.set(i, slMoi);
                            dsDonGia.set(i, giaMoi);

                            System.out.println("Đã cập nhật thông tin sách!");
                            daSua = true;
                            break;
                        }
                    }

                    if (!daSua) {
                        System.out.println("Không tìm thấy mã sách để sửa!");
                    }
                    break;

                case 6:
                    int tongSoLuong = 0;
                    for (int i = 0; i < dsSoLuong.size(); i++) {
                        tongSoLuong += dsSoLuong.get(i);
                    }
                    System.out.println("Tổng số lượng sách: " + tongSoLuong);
                    break;

                case 7:
                    double tongGiaTri = 0;
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        tongGiaTri += dsSoLuong.get(i) * dsDonGia.get(i);
                    }
                    System.out.println("Tổng giá trị sách: " + tongGiaTri);
                    break;

                case 8:
                    System.out.println("Đã thoát chương trình.");
                    break;

                case 9:
                    int[] soLuong = new int[5];
                    int tongMang = 0;
                    int max = 0;

                    for (int i = 0; i < 5; i++) {
                        System.out.print("Nhập số lượng cuốn sách thứ " + (i + 1) + ": ");
                        soLuong[i] = sc.nextInt();
                    }

                    System.out.print("Số lượng vừa nhập: ");
                    for (int i = 0; i < 5; i++) {
                        System.out.print(soLuong[i] + " ");
                        tongMang += soLuong[i];
                        if (i == 0 || soLuong[i] > max) {
                            max = soLuong[i];
                        }
                    }
                    System.out.println("\nTổng số lượng 5 cuốn sách: " + tongMang);
                    System.out.println("Số lượng lớn nhất: " + max);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        } while (chon != 8);

        sc.close();
    }
}