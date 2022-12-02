package com.example.demo.ResController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.NguoiDung;
import com.example.demo.service.NhanVienService;

@RestController
@RequestMapping("/api/nd")
@CrossOrigin(origins ="*")
public class ApiND {
	@Autowired
	NhanVienService service;
	
	@GetMapping("/getAllND")
	public ResponseEntity<List<NguoiDung>> getAllNV() throws SQLException{
		return ResponseEntity.ok(service.getAllNV());
		
	}
	
	@GetMapping("/findND")
	public ResponseEntity<NguoiDung> getNV(@RequestParam("sdt") String sdt, @RequestParam("matKhau") String password) throws SQLException{
		return ResponseEntity.ok(service.findNVByEmailAndPassword(sdt, password));
	}
	@PostMapping("/insertND")
	public ResponseEntity<Integer> insertNV(@RequestBody NguoiDung nv) throws SQLException{
		return ResponseEntity.ok(service.insertNV(nv));
	}
	@PostMapping("/updateND")
	public ResponseEntity<Integer> updateNV(@RequestBody NguoiDung nv) throws SQLException{
		return ResponseEntity.ok(service.updateNV(nv));
	}
	@GetMapping("/deleteND")
	public ResponseEntity<Integer> deleteNV(@RequestParam("maNguoiDung") String maNV) throws SQLException{
		System.out.println(maNV);
		return ResponseEntity.ok(service.deleteNV(maNV));
	}
	
}
