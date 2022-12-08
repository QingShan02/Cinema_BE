package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.KhachHangMapper;
import com.example.demo.model.KhachHang;
import com.example.demo.model.NguoiDung;
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
	public KhachHang findKH(String email, String matkhau) {
		// TODO Auto-generated method stub
		System.out.println(">>"+email+","+matkhau);
		return mapper.findKH(email,matkhau);
	}

	@Override
	public int insertFBKH(String tenkh, String email, String idfb, String hinhfb) {
		// TODO Auto-generated method stub
		
		return mapper.insertFBKH(tenkh, email, idfb, hinhfb);
	}


	@Override
	public int insertKHWEB(String tenKH, String email, String soDT, String matKhau) {
		return mapper.insertKHWEB(tenKH, email, soDT, matKhau);
	}

	@Override
	public int insertKH(KhachHang kh) {
		if(kh!=null) {
			mapper.insertKH(kh);
			return 1;
		}
		return 0;
	}
	
	@Override
	public int updateKH(KhachHang kh) {
		// TODO Auto-generated method stub
		if(kh!=null) {
			mapper.updateKH(kh);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteKH(int maKH) {
		// TODO Auto-generated method stub
		if(maKH!=0) {
			mapper.deleteKH(maKH);
			return 1;
		}
		return 0;
	}
	@Override
	public KhachHang getOneKH(int maKH) {
		// TODO Auto-generated method stub
		return mapper.getOneKH(maKH);
	}

	@Override
	public KhachHang findFBKH(String email) {
		// TODO Auto-generated method stub
		return mapper.findFBKH(email);
	}
	@Override
	public int updateKH2(String hinhfb,int makh) {
		return mapper.updateKH2(hinhfb,makh);

	}
}
