package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

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
   private int NamSX;
   private String Hinh;
   private String DaoDien;
   private String QuocGia;
   private String ThoiLuong;
   private String MoTa;
   private String Traller;
   private String tentheloai;
   private List<String> listTheloai;
   private List<String> khunggio;


}