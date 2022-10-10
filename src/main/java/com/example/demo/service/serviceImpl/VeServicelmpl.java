package com.example.demo.service.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.mapper.VeMapper;
import com.example.demo.model.Ve;
import com.example.demo.service.VeService;

@Service
public class VeServicelmpl implements VeService{
	@Autowired
	VeMapper mapper;
		@Override
		public List<Ve> getAllVe() {
			// TODO Auto-generated method stub
			return mapper.getAllVe();
		}
}
