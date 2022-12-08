package com.example.demo.service;

import java.util.List;

import com.example.demo.model.KhachHang;
import com.example.demo.model.NguoiDung;

public interface KhachHangService {
	List<KhachHang> getAllKH();
	KhachHang findKH(String email, String matkhau);
	KhachHang findFBKH(String email);
	//KhachHang insertKH()
	int insertFBKH(String tenkh, String email, String idfb, String hinhfb);

	int insertKH(KhachHang kh);

	int insertKHWEB(String tenKH, String email, String soDT, String matKhau);
	int updateKH(KhachHang kh);
	int deleteKH(int maKH);
	KhachHang getOneKH(int maKH);	
	int updateKH2(String hinhfb, int maKH);

}
