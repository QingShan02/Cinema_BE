package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CTTopping;
import com.example.demo.mapper.ToppingMapper;
import com.example.demo.model.Topping;
import com.example.demo.service.ToppingService;

@Service
public class ToppingServiceImpl implements ToppingService {
@Autowired
ToppingMapper mapper;
@Autowired
CTTopping mapperCT;
@Override
public List<Topping> getAllTP() {
	// TODO Auto-generated method stub
	return mapper.getAllTP();
}
@Override
public int insertCTTP(int idVe, String maTopping, int soLuongMua) {
	// TODO Auto-generated method stub
	
	return mapperCT.insertTP(idVe, maTopping, soLuongMua);
}



}
