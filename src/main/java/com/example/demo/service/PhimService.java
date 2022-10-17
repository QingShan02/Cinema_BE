package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Phim;

public interface PhimService {
	List<Phim> getAllPhim();
	Phim getMaPhim(String maPhim);
	List<Phim> getTheLoai(String maPhim);
//	List<Phim> getGioBatDau(String maPhim,String Ngay);

}
