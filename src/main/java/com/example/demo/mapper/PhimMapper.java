package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.*;
import java.util.*;
@Mapper
public interface PhimMapper {
	List<Phim> getAllPhim();
	List<Phim> getAllPhim2();
	Phim getMaPhim(@Param("maPhim") String maPhim);
	List<Phim> getTheLoai(@Param("maPhim")String maPhim);
//	List<Phim> getGioBatDau(@Param("maPhim")String maPhim,@Param("ngay") String Ngay);

	int insertPhim(Phim phim);
	int updatePhim(Phim phim);
	int deletePhim(String maPhim);
}
