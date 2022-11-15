package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.NgayChieuMapper;
import com.example.demo.model.NgayChieu;
import com.example.demo.service.NgayChieuService;

@Service
public class NgayChieuServiceImpl implements NgayChieuService{
@Autowired
NgayChieuMapper mapper;
	@Override
	public List<NgayChieu> getGioByPhim(String maphim, String ngay) {
		// TODO Auto-generated method stub
		return mapper.getGioByPhim(maphim, ngay);
	}

	@Override
	public int getID(String ngay, String gioBatDau) {
		return mapper.getID(ngay,gioBatDau);
	}

}
