package lesson7;

public class MonHoc {
    private String ma;
    private String ten;
    private int soTinChi;
    private int trangThai;

    public MonHoc() {
    }

    public MonHoc(String ma, String ten, int soTinChi, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.soTinChi = soTinChi;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
