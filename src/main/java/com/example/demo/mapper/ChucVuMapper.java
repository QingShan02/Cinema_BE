package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.ChucVu;

@Mapper
public interface ChucVuMapper {
	List<ChucVu> getAllCV();
}
