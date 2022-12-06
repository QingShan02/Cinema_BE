package com.example.demo.ResController;

import com.example.demo.model.XuatChieu;
import com.example.demo.service.XuatChieuService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/xuatchieu")
@CrossOrigin(origins = "*")
public class ApiXuatChieu {
    @Autowired
    XuatChieuService service;
    @GetMapping("/getLichChieu")
    public ResponseEntity<List<XuatChieu>> getLichChieu() throws SQLException{
        return ResponseEntity.ok(service.getLichChieu());
    }
    @GetMapping("/insertLichChieu")
     public ResponseEntity<Integer> insertLichChieu(@RequestParam("giaXuatChieu") String giaXuatChieu, @RequestParam("ngay") String ngay, @RequestParam("maPhong") String maPhong, @RequestParam("maPhim") String maPhim) throws SQLException{
        return ResponseEntity.ok(service.insertXuatChieu(giaXuatChieu, ngay, maPhong, maPhim));
    }
    @GetMapping("/XuatChieuTheoNgay")
    public ResponseEntity<List<XuatChieu>> XuatChieuTheoNgay(@RequestParam("ngay") String ngay, @RequestParam("macn") String macn,@RequestParam("gioBatDau") String gioBatDau) throws SQLException{
        return ResponseEntity.ok(service.XuatChieuTheoNgay(ngay,macn,gioBatDau));
    }
}
