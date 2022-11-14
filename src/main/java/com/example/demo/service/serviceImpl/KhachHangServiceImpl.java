package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.KhachHangMapper;
import com.example.demo.model.KhachHang;
import com.example.demo.service.KhachHangService;

@Service
public class KhachHangServiceImpl implements KhachHangService {
	@Autowired
	KhachHangMapper mapper;

	@Override
	public List<KhachHang> getAllKH() {
		// TODO Auto-generated method stub
		return mapper.getAllKH();
	}

	@Override
	public KhachHang findKH(String email, String matkhau) {
		// TODO Auto-generated method stub
		System.out.println(">>"+email+","+matkhau);
		return mapper.findKH(email,matkhau);
	}

	@Override
	public int insertFBKH(String tenkh, String email, String idfb, String hinh) {
		// TODO Auto-generated method stub
		
		return mapper.insertFBKH(tenkh, email, idfb, hinh);
	}
	
}
