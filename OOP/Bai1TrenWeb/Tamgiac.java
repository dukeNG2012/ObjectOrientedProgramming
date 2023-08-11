public class Tamgiac extends Shape {
    private int chieucao;
    private int day;
    
    public void SetCacThongSo(int chieucao, int canhday)
    {
        this.chieucao = chieucao;
        this.day = canhday;
    }
    public int GetChieuCao()
    {
        return this.chieucao;

    }
    public int GetCanhDay()
    {
        return this.day;
    }
    @Override
    public double Area() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'Area'");
        return this.chieucao * this.day * 0.5;
    }

    @Override
    public double ChuVi() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'ChuVi'");
        return this.day * 3;
    }
    
}
