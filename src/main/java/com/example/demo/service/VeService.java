package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Ve;

public interface VeService {
	List<Ve> getAllVe();
	int insertVe(double tongGiaVe,double thueVat,int maCTGhe,String maNV);
}
