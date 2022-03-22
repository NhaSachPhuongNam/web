package KhanhVySang.demo.Model.ThongTinMuaHang;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(ChiTietPhieuNhapHangModel.class)
@Table(name = "tblChiTietPhieuNhapHang")
public class ChiTietPhieuNhapHangModel implements Serializable{
    
    @Id()
    private int maPhieuNhapHang;
    @Id
    private int maSanPham;
    @Column(name = "gia", nullable = false)
    private float gia;
    @Column(name = "soLuong", nullable = false)
    private int soLuong;


    public ChiTietPhieuNhapHangModel() {}

    public ChiTietPhieuNhapHangModel(int maPhieuNhapHang, int maSanPham, int soLuong, float gia) {
        this.maPhieuNhapHang = maPhieuNhapHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public int getMaPhieuNhapHang() {
        return this.maPhieuNhapHang;
    }

    public void setMaPhieuNhapHang(int maPhieuNhapHang) {
        this.maPhieuNhapHang = maPhieuNhapHang;
    }

    public int getMaSanPham() {
        return this.maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return this.gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

}
