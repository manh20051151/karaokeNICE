package entity;

import jakarta.persistence.*;
import jdk.jfr.Experimental;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Phong")
public class Phong {
    @Id
    private String maPhong;
    private String tenPhong;
    private String viTri;
    private String trangThaiPhong;
    @ManyToOne
    @JoinColumn(name = "maLoaiPhong")
    private LoaiPhong loaiPhong;
    private int sucChua;

    @OneToMany(mappedBy = "phong")
    private List<ChiTietHoaDon_Phong> chiTietHoaDon_phongs;

    @OneToMany(mappedBy = "phong")
    private  List<ChiTietHoaDon_DichVu> chiTietHoaDon_dichVus;

    @OneToMany(mappedBy = "phong")
    private List<PhieuDatPhong> phieuDatPhongs;


    public Phong() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getTrangThaiPhong() {
        return trangThaiPhong;
    }

    public void setTrangThaiPhong(String trangThaiPhong) {
        this.trangThaiPhong = trangThaiPhong;
    }

    public LoaiPhong getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(LoaiPhong loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maPhong);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Phong other = (Phong) obj;
        return Objects.equals(maPhong, other.maPhong);
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public Phong(String maPhong, String tenPhong, String viTri, String trangThaiPhong, LoaiPhong loaiPhong,
                 int sucChua) {
        super();
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.viTri = viTri;
        this.trangThaiPhong = trangThaiPhong;
        this.loaiPhong = loaiPhong;
        this.sucChua = sucChua;
    }

}
