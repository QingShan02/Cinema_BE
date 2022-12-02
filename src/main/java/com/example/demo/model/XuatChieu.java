package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class XuatChieu {
    private int Stt;
    private String Ngay;
    private String MaPhong;
    private String MaPhim;
    private double GiaXuatChieu;
    private String MaCN;
    private String TenCN;
    private String TenPhong;
    private String TenPhim;
    private String NgayChieu;
    private String GioBatDau;
    private String Hinh;
    private String ThoiLuong;
    private int Stt_xc;

}