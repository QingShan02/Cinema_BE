package com.example.demo.service;

import java.util.List;

import com.example.demo.model.KhachHang;

public interface KhachHangService {
	List<KhachHang> getAllKH();
	KhachHang findKH(String email, String matkhau);
	KhachHang findFBKH(String email);
	//KhachHang insertKH()
	int insertFBKH(String tenkh, String email, String idfb, String hinhfb);

	int insertKH(String tenKH, String email, String soDT, String diaChi, String matKhau);
	int updateKH(String tenKH, String email, String soDT, String diaChi, String matKhau);
	int deleteKH(int  maKH);
	KhachHang getOneKH(int maKH);	
}
