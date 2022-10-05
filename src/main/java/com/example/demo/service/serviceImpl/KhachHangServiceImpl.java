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
	public KhachHang findKH(int MaKH) {
		// TODO Auto-generated method stub
		return mapper.findKH(MaKH);
	}

}
