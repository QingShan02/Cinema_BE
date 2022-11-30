package com.example.demo.service;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.model.Ghe;
public interface GheService {
	List<Ghe> getAllGhe();
	List<Ghe> findGhePhong(String MaPhong);
	List<Ghe> findGhePhim(int stt_xc);

}
