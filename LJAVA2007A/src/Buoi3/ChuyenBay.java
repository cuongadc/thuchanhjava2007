package Buoi3;

import java.util.List;

public class ChuyenBay {
    private String tenChuyenBay;
    private int thoiGianBay;
    private List<KhachHang> danhSachKhachHang;

    public String getTenChuyenBay() {
        return tenChuyenBay;
    }

    public void TinhTongTien(){

    }

    public void inThongTinKhach(){

    }

    public void setTenChuyenBay(String tenChuyenBay) {
        this.tenChuyenBay = tenChuyenBay;
    }

    public int getThoiGianBay() {
        return thoiGianBay;
    }

    public void setThoiGianBay(int thoiGianBay) {
        this.thoiGianBay = thoiGianBay;
    }

    public List<KhachHang> getDanhSachKhachHang() {
        return danhSachKhachHang;
    }

    public void setDanhSachKhachHang(List<KhachHang> danhSachKhachHang) {
        this.danhSachKhachHang = danhSachKhachHang;
    }
}
