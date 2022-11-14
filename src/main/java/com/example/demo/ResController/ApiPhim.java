package com.example.demo.ResController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Phim;
import com.example.demo.service.PhimService;

@RestController
@RequestMapping("/api/phim")
@CrossOrigin(origins = "*")
public class ApiPhim {
	@Autowired
	PhimService service;
	
	@GetMapping("/getAllPhim")
	public ResponseEntity<List<Phim>> getAllPhim() throws SQLException{
		return ResponseEntity.ok(service.getAllPhim());
	}
	@GetMapping("/getAllPhim2")
	public ResponseEntity<List<Phim>> getAllPhim2() throws SQLException{
		return ResponseEntity.ok(service.getAllPhim2());
	}
	
	@GetMapping("/getMaPhim")
	public ResponseEntity<Phim> getMaPhim(@RequestParam("maPhim")String maPhim) throws SQLException{
		System.out.println(maPhim);
		System.out.println(service.getMaPhim(maPhim));
		return ResponseEntity.ok(service.getMaPhim(maPhim));
	}
	

//	@GetMapping("/getGioBatDau")
//	public ResponseEntity<List<Phim>> getGioBatDau(@RequestParam("maPhim")String maPhim,@RequestParam("ngayChieu")String Ngay) throws SQLException{
//		System.out.println(maPhim);
//		return ResponseEntity.ok(service.getGioBatDau(maPhim, Ngay));
//	}

}
