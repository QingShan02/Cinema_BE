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

import com.example.demo.model.Ve;
import com.example.demo.service.VeService;

@RestController
@RequestMapping("/api/ve")
@CrossOrigin(origins = "*")
public class ApiVe {
	@Autowired
	VeService service;
	
	@GetMapping("/getAllVe")
	public ResponseEntity<List<Ve>> getAllVe() throws SQLException{
		return ResponseEntity.ok(service.getAllVe());
	}
	@GetMapping("/insertVe")
	public ResponseEntity<Integer> insertVe(@RequestParam("tongGiaVe") double tongGiaVe,@RequestParam("thueVat") double thueVat,@RequestParam("maCTGhe") int maCTGhe,@RequestParam("maKH") int maKH) throws SQLException{
		System.out.println(tongGiaVe);
		return ResponseEntity.ok(service.insertVe(tongGiaVe, thueVat, maCTGhe, maKH));
	}
}
