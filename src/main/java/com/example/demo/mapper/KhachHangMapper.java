package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.*;
@Mapper
public interface KhachHangMapper {
	List<KhachHang> getAllKH();
	KhachHang findKH(@Param("email") String email, @Param("matkhau") String matkhau);
	KhachHang findFBKH(String email);
	int insertFBKH(@Param("tenkh") String tenkh, @Param("email") String email, @Param("idfb") String idfb, @Param("hinhfb") String hinh);
	int insertKHWEB(@Param("tenKH") String tenKH,@Param("email")String email,@Param("soDT")String soDT,@Param("matKhau")String matkhau);
	int insertKH(KhachHang kh);
	int updateKH(KhachHang kh);
	int deleteKH(int maKH);
	KhachHang getOneKH(@Param("maKH") int maKH);
	int updateKH2(@Param("hinhfb") String hinhfb,@Param("maKH") int maKH);
}
