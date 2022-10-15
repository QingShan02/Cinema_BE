package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PhimMapper;
import com.example.demo.model.Phim;
import com.example.demo.service.PhimService;

@Service
public class PhimServiceImpl implements PhimService{
@Autowired
PhimMapper mapper;
	@Override
	public List<Phim> getAllPhim() {
		// TODO Auto-generated method stub
		return mapper.getAllPhim();
	}
	@Override
	public List<Phim> getMaPhim(String maPhim) {
		// TODO Auto-generated method stub
		return mapper.getMaPhim(maPhim);
	}

}
