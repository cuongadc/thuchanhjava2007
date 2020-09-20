package Buoi2;

public class DienThoai {
    public String manHinh;
    public String heDieuHanh;
    public boolean cameraSau;
    public boolean cameraTruoc;
    public boolean hasTheNho;
    public boolean has2Sim;
    public String pin;
    public String ram;

    public DienThoai(String manHinh, String heDieuHanh, boolean cameraSau, boolean cameraTruoc, boolean hasTheNho, boolean has2Sim, String ram, String pin){
        this.manHinh = manHinh;
        this.heDieuHanh = heDieuHanh;
        this.cameraSau = cameraSau;
        this.cameraTruoc = cameraTruoc;
        this.hasTheNho = hasTheNho;
        this.has2Sim = has2Sim;
        this.ram = ram;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "DienThoai{" +
                "manHinh='" + manHinh + '\'' +
                ", heDieuHanh='" + heDieuHanh + '\'' +
                ", cameraSau=" + cameraSau +
                ", cameraTruoc=" + cameraTruoc +
                ", hasTheNho=" + hasTheNho +
                ", has2Sim=" + has2Sim +
                ", pin='" + pin + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
