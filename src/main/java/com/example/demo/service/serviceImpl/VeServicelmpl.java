package com.example.demo.service.serviceImpl;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
		@Override
		public int insertVe(double tongGiaVe, double thueVat, int maCTGhe, int maKH) {
			// TODO Auto-generated method stub
			int temp = 0;
			if(mapper.insertVe(tongGiaVe, thueVat, maCTGhe, maKH)==1) {
				temp = idVe();
			}
			return temp;
		}
		@Override
		public int idVe() {
			List<Integer> list = (List<Integer>) mapper.getAllVe().stream().map(s->s.getIdVe()).collect(Collectors.toList());
			Collections.sort(list, Collections.reverseOrder());  
			return list.get(0);
		}
}
