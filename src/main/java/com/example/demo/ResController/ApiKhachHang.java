package com.example.demo.ResController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.KhachHang;
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

	@PostMapping("/insertKH")
	public ResponseEntity<Integer> insertKH(@RequestBody KhachHang kh) throws SQLException{
		return ResponseEntity.ok(service.insertKH(kh));
	}

	@PostMapping("/updateKH")
	public ResponseEntity<Integer> updateKH(@RequestBody KhachHang kh) throws SQLException{
		return ResponseEntity.ok(service.updateKH(kh));
	}
	@GetMapping("/deleteKH")
	public ResponseEntity<Integer> deleteKH(@RequestParam("makh") int maKH) throws SQLException{
		System.out.println(maKH);
		return ResponseEntity.ok(service.deleteKH(maKH));
	}

}
