package com.example.demo.ResController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.*;
import com.example.demo.service.NgayChieuService;

@RequestMapping("/api/ngay")
@RestController
@CrossOrigin(origins = "*")

public class ApiNgayChieu {
	@Autowired
	NgayChieuService service;
	@GetMapping("/getGioBatDau")
	public ResponseEntity<List<NgayChieu>> getGioBatDau(@RequestParam("maPhim") String maPhim, @RequestParam("ngay") String ngay) throws SQLException{
		return ResponseEntity.ok(service.getGioByPhim(maPhim, ngay));
	}
	@GetMapping("/getID")
	public ResponseEntity<Integer> getID(@RequestParam("ngay") String ngay, @RequestParam("gioBatDau") String gioBatDau) throws SQLException{
		return ResponseEntity.ok(service.getID(ngay,gioBatDau));
	}
}
