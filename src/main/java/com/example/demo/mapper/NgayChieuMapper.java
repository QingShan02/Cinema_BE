package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.*;
@Mapper
public interface NgayChieuMapper {
	List<NgayChieu> getGioByPhim(@Param("maPhim") String maPhim, @Param("Ngay") String ngay);
	int insertNgayChieu(@Param("ngay") String ngay, @Param("gioBatDau") String gioBatDau);

	List<NgayChieu> getGioBatDau(@Param("maCN") String maCN, @Param("maPhim") String maPhim);
	List<NgayChieu> getNgay();
	NgayChieu getNgayChieu(@Param("ngay") String ngay, @Param("gioBatDau") String gioBatDau);
	int getMaxStt();
	List<NgayChieu> getgiobatdau1ngay(@Param("maCN") String maCN,@Param("ngay")String ngay);

}
