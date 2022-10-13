package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.ChucVuMapper;
import com.example.demo.model.ChucVu;
import com.example.demo.service.ChucVuService;

@Service
public class ChucVuServiceImpl implements ChucVuService {
@Autowired
ChucVuMapper mapper;

@Override
public List<ChucVu> getAllCV() {
	// TODO Auto-generated method stub
	return mapper.getAllCV();
}

}
