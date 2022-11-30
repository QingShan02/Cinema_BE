package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.GheMapper;
import com.example.demo.service.GheService;
import com.example.demo.model.*;
@Service
public class GheServiceImpl<Ghe> implements GheService{
@Autowired	
	GheMapper mapper;

@Override
public List<com.example.demo.model.Ghe> getAllGhe() {
	// TODO Auto-generated method stub
	return mapper.getAllGhe();
}

@Override
public List<com.example.demo.model.Ghe> findGhePhong(String MaPhong) {
	// TODO Auto-generated method stub
	return mapper.findGhePhong(MaPhong);
}

@Override
public List<com.example.demo.model.Ghe> findGhePhim(int stt_xc) {
	// TODO Auto-generated method stub
	return mapper.findGhePhim(stt_xc);
}


}
