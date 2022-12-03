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
	
//	@GetMapping("/getAllVe")
//	public ResponseEntity<List<Ve>> getAllVe(@RequestParam("maPhim")String tenPhim) throws SQLException{
//		return ResponseEntity.ok(service.getAllVe(tenPhim));
//	}
	@GetMapping("/insertVe")
	public ResponseEntity<Integer> insertVe(@RequestParam("giaVe") double tongGiaVe,@RequestParam("thueVat") double thueVat,@RequestParam("maCTGhe") int maCTGhe,@RequestParam("maKH") int maKH,@RequestParam("stt_xc") int stt_xc) throws SQLException{
		System.out.println(tongGiaVe);
		return ResponseEntity.ok(service.insertVe(tongGiaVe, thueVat, maCTGhe, maKH,stt_xc));
	}
	@GetMapping("/LichSuVe")
	public ResponseEntity<List<Ve>> getLichSuVe(@RequestParam("maKH") int maKH) throws SQLException{
		return ResponseEntity.ok(service.getLichSuVe(maKH));
	}
	@GetMapping("/getVe")
	public ResponseEntity<Ve> getVe(@RequestParam("idVe") int idVe) throws SQLException{
		return ResponseEntity.ok(service.getVe(idVe));
	}
	@GetMapping("/getSoLuongVe")
	public ResponseEntity<List<Ve>> getSoLuongVe(@RequestParam("maCN") String maCN) throws SQLException{
		return ResponseEntity.ok(service.CountVeByChiNhanh(maCN));
	}
	@GetMapping("/countVeByPhim")
	public ResponseEntity<List<Ve>> countVeByPhim(@RequestParam("maCN") String maCN) throws SQLException{
		return ResponseEntity.ok(service.CountVeByPhim(maCN));
	}
}
