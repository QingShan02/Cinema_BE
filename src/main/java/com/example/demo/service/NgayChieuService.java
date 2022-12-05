package com.example.demo.service;

import java.util.List;

import com.example.demo.model.NgayChieu;
import org.apache.ibatis.annotations.Param;

public interface NgayChieuService {
	List<NgayChieu> getGioByPhim(String maPhim, String ngay);
	int insertNgayChieu(String ngay,String gioBatDau);
	List<NgayChieu> getGioBatDau (String macn, String maphim);
	List<NgayChieu> getNgay();
	NgayChieu getNgayChieu( String ngay, String gioBatDau);
	int getMaxStt();
	List<NgayChieu> getgiobatdau1ngay(String macn,String ngay);
}
