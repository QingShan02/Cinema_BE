package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.NguoiDungMapper;
import com.example.demo.model.NguoiDung;
import com.example.demo.service.NhanVienService;
@Service
public class NguoiDungServiceImpl implements NhanVienService {

	@Autowired
	NguoiDungMapper mapper;
	
	@Override
	public List<NguoiDung> getAllNV() {
		// TODO Auto-generated method stub
		return mapper.getAllNV();
	}

	@Override
	public NguoiDung findNVByEmailAndPassword(String sdt, String password) {
		// TODO Auto-generated method stub
		
		
		
		return mapper.findNVByEmailAndPassword(sdt, password);
	}

	@Override
	public int insertNV(NguoiDung nv) {
		if(nv!=null) {
			mapper.insertNV(nv);
			return 1;
		}
		return 0;
	}

	@Override
	public int updateNV(NguoiDung nv) {
		// TODO Auto-generated method stub
		if(nv!=null) {
			mapper.updateNV(nv);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteNV(String maNV) {
		// TODO Auto-generated method stub
		if(maNV!="") {
			mapper.deleteNV(maNV);
			return 1;
		}
		return 0;
	}
	
}
