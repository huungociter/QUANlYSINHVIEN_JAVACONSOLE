package TEST;

import java.io.IOException;
import java.util.Scanner;


public class MAIN {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		DANHSACHSINHVIEN DS = new DANHSACHSINHVIEN();
		DS.DocFile();
		int choice;
		do {
			System.out.println("----------MENU----------");
			System.out.println("1.Thêm Học Sinh Vào Danh Sách");
			System.out.println("2.Cập nhật Thông Tin Học Sinh");
			System.out.println("3.Xóa Học Sinh Khỏi Danh Sách");
			System.out.println("4.Xuất Danh Sách Học Sinh");
			System.out.println("5.Import Học Sinh Từ File CSV");
			System.out.println("6.Xuất Học Sinh Vào File CSV");
			System.out.println("7.Thoát chương trình");
			System.out.println("Mời Bạn Chọn : ");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				DS.ThemSV();
				DS.GhiFile();
				break;
			}
			case 2: {
				DS.CapNhat();
				DS.GhiFile();
				break;
			}
			case 3: {
				DS.XoaSV();
				DS.GhiFile();
				break;
			}
			case 4: {
				System.out.println("1.Mã học sinh tăng dần");
				System.out.println("2.Mã học sinh giảm dần");
				System.out.println("3.Điểm tăng dần");
				System.out.println("4.Điểm giảm dần");
				System.out.println("Chọn kiểu xuất danh sách : ");
				int a = sc.nextInt();
				if(a==1)
				{
					DS.SapXepMHSTang();
					DS.XuatDanhSach();
					break;
				}
				else if(a==2)
				{
					DS.SapXepMHSGiam();
					DS.XuatDanhSach();
					break;
				}
				else if(a==3) {
					DS.SapXepDiemTang();
					DS.XuatDanhSach();
					break;
				}
				else if(a==4) {
					DS.SapXepDiemGiam();
					DS.XuatDanhSach();
					break;
				}
				else {
					System.out.println("Bạn đã chọn sai.");
				}
				
			}
			case 5:
				DS.DocFileCSV();
				DS.GhiFile();
				break;
			case 6: {
				DS.GhiFileCSV();
				break;
			}
			case 7:
				return;
			default:
				System.out.println("Nhập sai mời nhập lại.");
				break;
			}
		} while (choice != 7);

	}
}
