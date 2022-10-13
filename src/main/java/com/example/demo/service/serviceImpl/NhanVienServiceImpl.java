package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.NhanVienMapper;
import com.example.demo.model.NhanVien;
import com.example.demo.service.NhanVienService;
@Service
public class NhanVienServiceImpl implements NhanVienService {

	@Autowired
	NhanVienMapper mapper;
	
	@Override
	public List<NhanVien> getAllNV() {
		// TODO Auto-generated method stub
		return mapper.getAllNV();
	}

	@Override
	public NhanVien findNVByEmailAndPassword(String sdt, String password) {
		// TODO Auto-generated method stub
		
		
		
		return mapper.findNVByEmailAndPassword(sdt, password);
	}

	@Override
	public int insertNV(NhanVien nv) {
		if(nv!=null) {
			mapper.insertNV(nv);
			return 1;
		}
		return 0;
	}

	@Override
	public int updateNV(NhanVien nv) {
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
