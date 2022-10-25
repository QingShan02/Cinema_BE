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
import com.example.demo.service.ToppingService;

@RestController
@RequestMapping("/api/tp")
@CrossOrigin("*")
public class ApiTopping {
	@Autowired
	ToppingService service;

	@GetMapping("/getAllTP")
	public ResponseEntity<List<Topping>> getAllTP() throws SQLException {
		return ResponseEntity.ok(service.getAllTP());
	}
	@GetMapping("/insertCTTP")
	public ResponseEntity<List<Topping>> insertCTTP(@RequestParam("idVe")int idVe,@RequestParam("maTopping") String maTopping,@RequestParam("soLuongMua") int soLuongMua) throws SQLException {
		return ResponseEntity.ok(service.getAllTP());
	}
}
