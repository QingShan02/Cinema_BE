package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Ve;
import org.apache.ibatis.annotations.Param;

public interface VeService {
	List<Ve> getAllVe();
	int insertVe(double tongGiaVe,double thueVat,int maCTGhe,int maKH, int stt_xc);
	int idVe();
	List<Ve> getLichSuVe(int maKH);
	Ve getVe( int idVe);
	List<Ve> CountVeByChiNhanh(String macn);
	List<Ve> CountVeByPhim(String macn);

}
