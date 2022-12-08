package com.example.demo.model;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ve {
    private int IdVe;
    private double GiaVe;
    private double ThueVat;
    private int MaKH;
    private int MaCTGhe;
    private String MaNV;
    private String MaPhim;
    private String TenPhim;
    private int Soluong;
    private String ngay;
    private float tong;
    private String tenkh;
    private String giobatdau;
    private String tencn;
    private String diachi;
    private String tenghe;
    private String tenloai;
    private String sodt;
    private String giochieu;
    private String hinh;
    private String SoLuongVe;
    private int tongVe;
    private String maghe;
}