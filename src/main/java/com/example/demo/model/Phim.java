package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Phim {
   private String MaPhim;
   private String TenPhim;
   private String DienVien;
   private String NamSX;
   private String Hinh;
   private String DaoDien;
   private String QuocGia;
   private String ThoiLuong;
   private String MoTa;
   private String Traller;
}