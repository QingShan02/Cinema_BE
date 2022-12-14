package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Phim;
import org.apache.ibatis.annotations.Param;

public interface PhimService {
	List<Phim> getAllPhim();
	List<Phim> getAllPhim2();
	Phim getMaPhim(String maPhim, String ngay);
	List<Phim> getTheLoai(String maPhim);
	List<Phim> getGioBatDau(String maPhim,String Ngay);
	int updateHinh(String hinh, String maPhim);
	int insertPhim(Phim phim);
	int updatePhim(Phim phim);
	int deletePhim(String maPhim);
}
