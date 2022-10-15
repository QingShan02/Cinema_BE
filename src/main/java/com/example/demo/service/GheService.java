package com.example.demo.service;
import java.util.List;

import com.example.demo.model.Ghe;
public interface GheService {
	List<Ghe> getAllGhe();
	List<Ghe> findGhePhong(String MaPhong);
}
