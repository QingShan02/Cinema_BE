package com.example.demo.service;

import com.example.demo.model.XuatChieu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XuatChieuService {
    List<XuatChieu> getLichChieu();
    int insertXuatChieu(String giaXuatChieu, String ngay, String maPhong, String maPhim);
    List<XuatChieu> XuatChieuTheoNgay(String ngay, String macn,String gioBatDau);
}
