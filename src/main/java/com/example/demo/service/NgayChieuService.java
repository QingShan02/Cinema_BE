package com.example.demo.service;

import java.util.List;

import com.example.demo.model.NgayChieu;

public interface NgayChieuService {
	List<NgayChieu> getGioByPhim(String maphim, String ngay);

}
