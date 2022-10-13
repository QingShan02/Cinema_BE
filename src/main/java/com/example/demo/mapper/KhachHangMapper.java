package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.*;
@Mapper
public interface KhachHangMapper {
	List<KhachHang> getAllKH();
	KhachHang findKH(@Param("email") String email, @Param("matkhau") String matkhau);
}
