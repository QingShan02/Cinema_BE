package com.example.demo.ResController;

import java.io.Console;
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
import com.example.demo.model.*;
import com.example.demo.service.NgayChieuService;

@RequestMapping("/api/ngay")
@RestController
@CrossOrigin(origins = "*")

public class ApiNgayChieu {
	@Autowired
	NgayChieuService service;
//	@GetMapping("/getGioBatDau")
//	public ResponseEntity<List<NgayChieu>> getGioBatDau(@RequestParam("maPhim") String maPhim, @RequestParam("ngay") String ngay) throws SQLException{
//		System.out.print(""+ngay);
//		return ResponseEntity.ok(service.getGioByPhim(maPhim, ngay));
//	}
	@GetMapping("/getID")
	public ResponseEntity<Integer> getID(@RequestParam("ngay") String ngay, @RequestParam("gioBatDau") String gioBatDau) throws SQLException{
		int temp = 0;
		NgayChieu nc = service.getNgayChieu(ngay, gioBatDau);
		if(nc==null){
			service.insertNgayChieu(ngay, gioBatDau);
			temp = service.getMaxStt();
		}else{
			temp = nc.getStt();
		}

		return ResponseEntity.ok(temp);
	}

	@GetMapping("/getGioBatDau")
	public ResponseEntity<List<NgayChieu>> getGioBatDau(@RequestParam("maCN") String maCN, @RequestParam("maPhim") String maPhim) throws SQLException{
		return ResponseEntity.ok(service.getGioBatDau(maCN,maPhim));
	}
	@GetMapping("/getNgay")
    public ResponseEntity<List<NgayChieu>> getNgay() throws SQLException{
        return ResponseEntity.ok(service.getNgay());
    }
	@GetMapping("/getgiobatdau1ngay")
	public ResponseEntity<List<NgayChieu>> getgiobatdau1ngay(@RequestParam("maCN") String maCN,@RequestParam("ngay") String ngay) throws SQLException{
		return ResponseEntity.ok(service.getgiobatdau1ngay(maCN,ngay));
	}
}
