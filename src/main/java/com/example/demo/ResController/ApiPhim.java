package com.example.demo.ResController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Phim;
import com.example.demo.service.PhimService;

@RestController
@RequestMapping("/api/phim")
@CrossOrigin(origins = "http://localhost:3000")
public class ApiPhim {
	@Autowired
	PhimService service;
	
	@GetMapping("/getAllPhim")
	public ResponseEntity<List<Phim>> getAllPhim() throws SQLException{
		return ResponseEntity.ok(service.getAllPhim());
	}
}
