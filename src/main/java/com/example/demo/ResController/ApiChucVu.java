package com.example.demo.ResController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.*;
import com.example.demo.service.ChucVuService;

@RestController
@RequestMapping("/api/cv")
public class ApiChucVu {
	@Autowired
	ChucVuService service;

	@GetMapping("/getAllCV")
	public ResponseEntity<List<ChucVu>> getAllCV() throws SQLException {
		return ResponseEntity.ok(service.getAllCV());
	}
}
