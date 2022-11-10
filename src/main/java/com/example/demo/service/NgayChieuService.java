package com.example.demo.service;

import java.util.List;

import com.example.demo.model.NgayChieu;
import org.apache.ibatis.annotations.Param;

public interface NgayChieuService {
	List<NgayChieu> getGioByPhim(String maphim, String ngay);
	int getID(String ngay,String gioBatDau);

}
