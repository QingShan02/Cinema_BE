package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.NhanVien;


public interface NhanVienService {
	List<NhanVien> getAllNV();
	NhanVien findNVByEmailAndPassword(String sdt, String password);
	int insertNV(NhanVien nv);
	int updateNV(NhanVien nv);
	int deleteNV(String maNV);
}
