package com.example.demo.ResController;

import java.sql.SQLException;
import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.NhanVien;
import com.example.demo.service.NhanVienService;

@RestController
@RequestMapping("/api/nv")
@CrossOrigin(origins ="*")
public class ApiNV {
	@Autowired
	NhanVienService service;
	
	@GetMapping("/getAllNV")
	public ResponseEntity<List<NhanVien>> getAllNV() throws SQLException{
		return ResponseEntity.ok(service.getAllNV());
		
	}
	
	@GetMapping("/findNV")
	public ResponseEntity<NhanVien> getNV(@RequestParam("sdt") String sdt, @RequestParam("matKhau") String password) throws SQLException{
		return ResponseEntity.ok(service.findNVByEmailAndPassword(sdt, password));
	}
	@PostMapping("/insertNV")
	public ResponseEntity<Integer> insertNV(@RequestBody NhanVien nv) throws SQLException{
		return ResponseEntity.ok(service.insertNV(nv));
	}
	@PostMapping("/updateNV")
	public ResponseEntity<Integer> updateNV(@RequestBody NhanVien nv) throws SQLException{
		return ResponseEntity.ok(service.updateNV(nv));
	}
	@GetMapping("/deleteNV")
	public ResponseEntity<Integer> deleteNV(@RequestParam("maNV") String maNV) throws SQLException{
		System.out.println(maNV);
		return ResponseEntity.ok(service.deleteNV(maNV));
	}
	
}
