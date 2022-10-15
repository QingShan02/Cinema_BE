package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Phim;

public interface PhimService {
	List<Phim> getAllPhim();
	List<Phim> getMaPhim(String maPhim);
}
