package TEST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class DANHSACHSINHVIEN {
	private ArrayList<SINHVIEN> DanhSach;

	public DANHSACHSINHVIEN() {
		this.DanhSach = new ArrayList<SINHVIEN>();
	}

	public DANHSACHSINHVIEN(ArrayList<SINHVIEN> danhSach) {
		DanhSach = danhSach;
	}

	public ArrayList<SINHVIEN> getDanhSach() {
		return DanhSach;
	}

	public void setDanhSach(ArrayList<SINHVIEN> danhSach) {
		DanhSach = danhSach;
	}

	public int findindex(int MHS) {
		int i = 0;
		for (SINHVIEN sinhvien : DanhSach) {
			if (sinhvien.getMHS() == MHS) {
				return i;
			} else
				i++;
		}
		return -1;
	}

	public void ThemSV() {
		Scanner sc = new Scanner(System.in);
		SINHVIEN sv = new SINHVIEN();
		System.out.println("Nhập Họ Và Tên :");
		sv.setTenHS(sc.nextLine());
		System.out.println("Nhập Mã Số :");
		sv.setMHS(sc.nextInt());
		System.out.println("Nhập Điểm :");
		sv.setDiem(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập Hình Ảnh :");
		sv.setHinhAnh(sc.nextLine());
		System.out.println("Nhập Địa Chỉ :");
		sv.setDiaChi(sc.nextLine());
		System.out.println("Nhập Ghi Chú :");
		sv.setGhiChu(sc.nextLine());
		System.out.println("\n");
		this.DanhSach.add(sv);
	}

	public void XuatDanhSach() {
		int i = 1;
		for (SINHVIEN sinhvien : DanhSach) {
			System.out.println("SINH VIÊN " + i);
			System.out.println(sinhvien);
			i++;
		}
	}

	public void XoaSV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Mã Số Sinh Viên Muốn Xóa : ");
		int MS = sc.nextInt();
		if (findindex(MS) == -1) {
			System.out.println("Không tìm thấy sinh viên có mã số trong danh sách.");
			return;
		} else {
			this.DanhSach.remove(findindex(MS));
			System.out.println("Đã Xóa Sinh Viên");
			return;
		}

	}

	public void SapXepMHSTang() {
		Collections.sort(DanhSach, new Comparator<SINHVIEN>() {
			@Override
			public int compare(SINHVIEN sv1, SINHVIEN sv2) {
				if (sv1.getMHS() < sv2.getMHS()) {
					return -1;
				} else {
					if (sv1.getMHS() == sv2.getMHS()) {
						return 0;
					} else {
						return 1;
					}
				}
			}
		});
	}

	public void SapXepMHSGiam() {
		Collections.sort(DanhSach, new Comparator<SINHVIEN>() {
			@Override
			public int compare(SINHVIEN sv1, SINHVIEN sv2) {
				if (sv1.getMHS() < sv2.getMHS()) {
					return 1;
				} else {
					if (sv1.getMHS() == sv2.getMHS()) {
						return 0;
					} else {
						return -1;
					}
				}
			}
		});
	}

	public void SapXepDiemTang() {
		Collections.sort(DanhSach, new Comparator<SINHVIEN>() {
			@Override
			public int compare(SINHVIEN sv1, SINHVIEN sv2) {
				if (sv1.getDiem() < sv2.getDiem()) {
					return -1;
				} else {
					if (sv1.getDiem() == sv2.getDiem()) {
						return 0;
					} else {
						return 1;
					}
				}
			}
		});
	}

	public void SapXepDiemGiam() {
		Collections.sort(DanhSach, new Comparator<SINHVIEN>() {
			@Override
			public int compare(SINHVIEN sv1, SINHVIEN sv2) {
				if (sv1.getDiem() < sv2.getDiem()) {
					return 1;
				} else {
					if (sv1.getDiem() == sv2.getDiem()) {
						return 0;
					} else {
						return -1;
					}
				}
			}
		});
	}

	public void CapNhat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập Mã Số Sinh Viên Muốn cập nhật : ");
		int MS = sc.nextInt();
		sc = new Scanner(System.in);
		int i = findindex(MS);
		if (i == -1) {
			System.out.println("Không tìm thấy sinh viên có mã số trong danh sách.");
			return;
		}

		System.out.println("Chọn Thông tin muốn cập nhật :");
		System.out.println("1.Mã Số\n2.Tên\n3.Địa Chỉ\n4.Điểm\n5.Ghi chú\n6.Hình Ảnh");
		int choice = sc.nextInt();
		sc = new Scanner(System.in);
		if (choice == 1) {
			System.out.println("Nhập mã số mới :");
			DanhSach.get(i).setMHS(sc.nextInt());
			System.out.println("Đã cập nhật.");
			sc = new Scanner(System.in);
		}
		if (choice == 2) {
			System.out.println("Nhập tên mới :");
			DanhSach.get(i).setTenHS(sc.nextLine());
			System.out.println("Đã cập nhật.");
		}
		if (choice == 3) {
			System.out.println("Nhập Địa Chỉ mới :");
			DanhSach.get(i).setTenHS(sc.nextLine());
			System.out.println("Đã cập nhật.");
		}
		if (choice == 4) {
			System.out.println("Nhập Điểm mới :");
			DanhSach.get(i).setDiem(sc.nextInt());
			sc = new Scanner(System.in);
			System.out.println("Đã cập nhật.");
		}
		if (choice == 5) {
			System.out.println("Nhập Ghi chú mới :");
			DanhSach.get(i).setGhiChu(sc.nextLine());
			System.out.println("Đã cập nhật.");
		}
		if (choice == 6) {
			System.out.println("Nhập hình ảnh mới :");
			DanhSach.get(i).setHinhAnh(sc.nextLine());
			System.out.println("Đã cập nhật.");
		}
	}

	public void GhiFile() {
		try {
			FileOutputStream fos = new FileOutputStream("DANHSACHSINHVIEN.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.DanhSach);
			fos.close();
			oos.close();
		} catch (IOException ex) {
			System.out.println("Lỗi Ghi File :");
		}
	}

	public void DocFile() throws ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("DANHSACHSINHVIEN.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			this.DanhSach = (ArrayList<SINHVIEN>) ois.readObject();
			fis.close();
			ois.close();
		} catch (IOException ex) {
			System.out.println("Danh sách Học Sinh đang trống.");
		}
	}

	public void GhiFileCSV() {
		try {
			File file = new File("DANHSACHSINHVIEN.csv");
			FileWriter fw = new FileWriter(file);
			for (SINHVIEN sinhvien : DanhSach) {
				fw.write(sinhvien.getMHS()+","+sinhvien.getTenHS()+","+sinhvien.getDiem()+","+sinhvien.getDiaChi()+","+sinhvien.getHinhAnh()+","+sinhvien.getGhiChu()+"\n");
			}
			System.out.println("Đã Ghi Danh Sách Học Sinh Vào File CSV.");
			fw.close();
		} catch (IOException ex) {
			System.out.println("Không thể ghi file.");
		}
	}
	public void DocFileCSV() throws IOException {
		String line ="";
		try(BufferedReader br = new BufferedReader(new FileReader("DANHSACHSINHVIEN.csv"))){
		while((line = br.readLine()) != null && !line.isEmpty()) {
			SINHVIEN svm= new SINHVIEN();
			String field[] = line.split(",");
			svm.setMHS(Integer.parseInt(field[0]));
			svm.setTenHS(field[1]);
			svm.setDiem(Integer.parseInt(field[2]));
			svm.setDiaChi(field[3]);
			svm.setHinhAnh(field[4]);
			svm.setGhiChu(field[5]);
			System.out.println(svm);
			this.DanhSach.add(svm);
		}
		}
		catch(FileNotFoundException ex) {
			System.out.println("Không tìm thấy File");
		}
	}
}
