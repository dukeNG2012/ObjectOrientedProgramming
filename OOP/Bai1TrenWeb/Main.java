public class Main {
    public static void main(String[] args)
    {
        Tamgiac t = new Tamgiac();
        HinhChuNhat chunhat = new HinhChuNhat();
        t.SetCacThongSo(3, 4);
        chunhat.SetChieuDai(2);
        chunhat.SetChieuRong(3);
        System.out.println("Dien tich hinh tam giac va chu nhat lan luot la: " + t.Area() + "   "+ chunhat.Area());
    }
    
}
