package TEST;
import java.io.Serializable;
import java.util.Scanner;
public class SINHVIEN implements Serializable {
	private int MHS, Diem;
	private String TenHS, HinhAnh, DiaChi, GhiChu;


	public int getMHS() {
		return MHS;
	}

	public void setMHS(int mHS) {
		MHS = mHS;
	}

	public int getDiem() {
		return Diem;
	}

	public void setDiem(int diem) {
		Diem = diem;
	}

	public String getTenHS() {
		return TenHS;
	}

	public void setTenHS(String tenHS) {
		TenHS = tenHS;
	}

	public String getHinhAnh() {
		return HinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		HinhAnh = hinhAnh;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getGhiChu() {
		return GhiChu;
	}

	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}

	@Override
	public String toString() {
		return "Mã Sinh Viên : " + MHS + "\nTên Sinh Viên : " + TenHS + "\nĐiểm :" + Diem +  "\nHình Ảnh : " + HinhAnh + "\nĐịa Chỉ : "
				+ DiaChi + "\nGhi Chú : " + GhiChu +"\n";
	}
	


}
