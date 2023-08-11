public class HinhChuNhat extends Shape {
    private double ChieuDai;
    private double ChieuRong;

    public void SetChieuDai(double ChieuDai)
    {
        this.ChieuDai = ChieuDai;
    }
    public void SetChieuRong(double ChieuRong)
    {
        this.ChieuRong = ChieuRong;
    }
    public double GetChieuDai()
    {
        return this.ChieuDai;
    }
    public double GetChieuRong()
    {
        return this.ChieuRong;
    }
    @Override
    public double Area() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'Area'");
        return this.ChieuDai * this.ChieuRong;
    }

    @Override
    public double ChuVi() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'ChuVi'");
        return (this.ChieuDai + this.ChieuRong) * 2;
    }
    
}
