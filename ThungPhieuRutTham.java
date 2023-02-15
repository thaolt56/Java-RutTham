import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ThungPhieuRutTham {
	Set<String> thungPhieuRutTham = new HashSet<String>();

	public ThungPhieuRutTham() {
	}
	
	public boolean themMaDuThuong(String giaTri) {
		return this.thungPhieuRutTham.add(giaTri);
	}
	public boolean xoaPhieuDuThuong(String giaTri) {
		return this.thungPhieuRutTham.remove(giaTri);
	}
	public void inTatCaPhieu() {
		System.out.println(Arrays.toString(this.thungPhieuRutTham.toArray()));
	}
	
	public boolean tonTaiPhieu(String giaTri) {
		return this.thungPhieuRutTham.contains(giaTri);
	}
	public int soLuongPhieu() {
		return this.thungPhieuRutTham.size();
	}
	public String rutTham() {
		String giaTri = "";
		int sl = this.thungPhieuRutTham.size();
		Random rd = new Random();
		int vt;
		vt = rd.nextInt(sl);
	return giaTri = (String)this.thungPhieuRutTham.toArray()[vt];
	}
	//main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		ThungPhieuRutTham thungPhieu = new ThungPhieuRutTham();
		do {
			
			
			System.out.println("------MENU------");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa mã số dự thưởng.");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
			System.out.println("5. Số lượng phiếu dự thưởng.");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In ra tất cả các phiếu.");
			System.out.println("0. Thoát khỏi chương trình");
			System.out.println("---------------------------");
			System.out.println("Nhập phím cần chọn: "); luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1) {
				//them ma du thuong
				System.out.println("Nhập gía trị mã dự thưởng : ");
				String giaTri = sc.nextLine();
				thungPhieu.themMaDuThuong(giaTri);
			}else if(luaChon == 7) {
				thungPhieu.inTatCaPhieu();
			}else if(luaChon == 3) {
				System.out.println("Nhập gia trị mã cần xoá  ");
				String giaTri = sc.nextLine();
				thungPhieu.xoaPhieuDuThuong(giaTri);
			}else if(luaChon == 4) {
				System.out.println("Nhập mã để kiểm tra tồn tại  ");
				String giaTri = sc.nextLine();
				thungPhieu.tonTaiPhieu(giaTri);
			}else if(luaChon == 5) {
				System.out.println("Số lượng phiếu hiện có  :" + thungPhieu.soLuongPhieu());
			}else if(luaChon == 6) {
				System.out.println("Giá trị phiếu rút thăm đuọc : " + thungPhieu.rutTham());
			}
			
			
			
		} while (luaChon != 0);
		
	}
	
}
