package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.*;
@Mapper
public interface NgayChieuMapper {
	List<NgayChieu> getGioByPhim(@Param("maPhim") String maPhim, @Param("Ngay") String ngay);
}
