package com.example.demo.ResController;

import com.example.demo.model.XuatChieu;
import com.example.demo.service.XuatChieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/xuatchieu")
public class ApiXuatChieu {
    @Autowired
    XuatChieuService service;
    @GetMapping("/getLichChieu")
    public ResponseEntity<List<XuatChieu>> getLichChieu() throws SQLException{
        return ResponseEntity.ok(service.getLichChieu());
    }
}
