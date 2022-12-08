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
	@GetMapping("/insertTP")
	public ResponseEntity<Integer> insertTP(@RequestParam("maTopping") String maTopping, @RequestParam("tenTopping") String tenTopping, @RequestParam("gia") double gia) throws SQLException {
		return ResponseEntity.ok(service.insertTP(maTopping, tenTopping, gia));
	}
	@GetMapping("/deleteTP")
	public ResponseEntity<Integer> deleteTP(@RequestParam("maTopping") String maTopping) throws SQLException {
		return ResponseEntity.ok(service.deleteTP(maTopping));
	}
	@GetMapping("/updateTP")
	public ResponseEntity<Integer> updateTP(@RequestParam("maTopping") String maTopping, @RequestParam("tenTopping") String tenTopping, @RequestParam("gia") double gia) throws SQLException {
		return ResponseEntity.ok(service.updateTP(maTopping, tenTopping, gia));
	}
}
