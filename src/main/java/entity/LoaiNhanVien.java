package entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "LoaiNhanVien")
public class LoaiNhanVien {
    @Id
    private String maLoaiVN;
    @Column(name = "tenLoaiNV")
    private String tenLoai;
    private Float heSoLuong;

    @OneToMany(mappedBy = "loaiNhanVien")
    private List<NhanVien> nhanViens;

    public LoaiNhanVien() {

    }


    public String getMaLoaiVN() {
        return maLoaiVN;
    }

    public void setMaLoaiVN(String maLoaiVN) {
        this.maLoaiVN = maLoaiVN;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public Float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maLoaiVN);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        LoaiNhanVien other = (LoaiNhanVien) obj;
        return Objects.equals(maLoaiVN, other.maLoaiVN);
    }

    public LoaiNhanVien(String maLoaiVN, String tenLoai, Float heSoLuong) {
        this.maLoaiVN = maLoaiVN;
        this.tenLoai = tenLoai;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "LoaiNhanVien [maLoaiVN=" + maLoaiVN + ", tenLoai=" + tenLoai + ", heSoLuong=" + heSoLuong + "]";
    }

}
