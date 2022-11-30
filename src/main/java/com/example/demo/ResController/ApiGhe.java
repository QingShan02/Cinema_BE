package com.example.demo.ResController;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ghe;
import com.example.demo.model.KhachHang;
import com.example.demo.service.GheService;

@RestController
@RequestMapping("/api/cn")
@CrossOrigin(origins = "*")
public class ApiGhe {
	@Autowired
	GheService service;
	
	@GetMapping("/getAllGhe")
	public ResponseEntity<List<Ghe>> getAllKH() throws SQLException {
		return ResponseEntity.ok(service.getAllGhe());
	}
	@GetMapping("/findGhePhong")
	public ResponseEntity<List<Ghe>> findGhePhong(@RequestParam("MaPhong") String MaPhong) throws SQLException{
		return ResponseEntity.ok(service.findGhePhong(MaPhong));
	}
	@GetMapping("/findGhePhim")
	public ResponseEntity<List<Ghe>> findGhePhim(@RequestParam("stt_xc")int stt_xc) throws SQLException{
		return ResponseEntity.ok(service.findGhePhim(stt_xc));
	}
}
