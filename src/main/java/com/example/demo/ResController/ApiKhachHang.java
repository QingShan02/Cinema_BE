package com.example.demo.ResController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.KhachHang;
import com.example.demo.model.NhanVien;
import com.example.demo.service.KhachHangService;

@RestController
@RequestMapping("/api/kh")
@CrossOrigin(origins = "*")
public class ApiKhachHang {
	@Autowired
	KhachHangService service;

	@GetMapping("/getAllKH")
	public ResponseEntity<List<KhachHang>> getAllKH() throws SQLException {
		return ResponseEntity.ok(service.getAllKH());
	}

	@GetMapping("/findKH")
	public ResponseEntity<KhachHang> findKH(@RequestParam("email") String email, @RequestParam("matKhau") String matKhau) throws SQLException{
		System.out.println(email+","+matKhau);
		return ResponseEntity.ok(service.findKH(email,matKhau));
	}
	
	@GetMapping("/insertKH")
	public ResponseEntity<Integer> insertFBKH(@RequestParam("tenkh") String tenkh,@RequestParam("email") String email,@RequestParam("idfb") String idfb,@RequestParam("hinh") String hinh) throws SQLException{
		System.out.println(tenkh);
		return ResponseEntity.ok(service.insertFBKH(tenkh, email, idfb, hinh));
	}
}
