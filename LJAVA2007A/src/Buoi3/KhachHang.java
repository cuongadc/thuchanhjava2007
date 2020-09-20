package Buoi3;

public class KhachHang extends ConNguoi{
    private Ve ve;
    private int slVe;

    public KhachHang(Ve ve, int slVe) {
        this.ve = ve;
        this.slVe = slVe;
    }

    public Ve getVe() {
        return ve;
    }

    public void setVe(Ve ve) {
        this.ve = ve;
    }

    public int getSlVe() {
        return slVe;
    }

    public void setSlVe(int slVe) {
        this.slVe = slVe;
    }
}
