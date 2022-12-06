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
@CrossOrigin("*")
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
	
	@GetMapping("/findFBKH")
	public ResponseEntity<KhachHang> findFBKH(@RequestParam("email") String email) throws SQLException{
		return ResponseEntity.ok(service.findFBKH(email));
	}
	
	@GetMapping("/insertFBKH")
	public ResponseEntity<Integer> insertFBKH(@RequestParam("tenkh") String tenkh,@RequestParam("email") String email,@RequestParam("idfb") String idfb,@RequestParam("hinhfb") String hinhfb) throws SQLException{
		System.out.println(tenkh);
		return ResponseEntity.ok(service.insertFBKH(tenkh, email, idfb, hinhfb));
	}

	@GetMapping("/insertKH")
	public ResponseEntity<Integer> insertKH(@RequestParam("tenKH") String tenKH,@RequestParam("email") String email,@RequestParam("soDT") String soDT,@RequestParam("diaChi") String diaChi,@RequestParam("matKhau") String matKhau) throws SQLException{
		System.out.println(tenKH);
		return ResponseEntity.ok(service.insertKH(tenKH,email,soDT,diaChi,matKhau));
	}

	@GetMapping("/insertKHWEB")
	public ResponseEntity<Integer> insertKHWEB(@RequestParam("tenKH") String tenKH,@RequestParam("email") String email,@RequestParam("soDT") String soDT,@RequestParam("matKhau") String matKhau) throws SQLException{
		System.out.println(tenKH);
		return ResponseEntity.ok(service.insertKHWEB(tenKH,email,soDT,matKhau));
	}
	@PostMapping("/updateKH")
	public ResponseEntity<Integer> updateKH(@RequestParam("tenKH") String tenKH,@RequestParam("email") String email,@RequestParam("soDT") String soDT,@RequestParam("diaChi") String diaChi,@RequestParam("matKhau") String matKhau) throws SQLException{
		System.out.println(tenKH);
		return ResponseEntity.ok(service.updateKH(tenKH,email,soDT,diaChi,matKhau));
	}
	@GetMapping("/deleteKH")
	public ResponseEntity<Integer> deleteKH(@RequestParam("makh") int maKH) throws SQLException{
		System.out.println(maKH);
		return ResponseEntity.ok(service.deleteKH(maKH));
	}
@GetMapping("/getOneKH")
public ResponseEntity<KhachHang> getOneKH(@RequestParam("maKH") int maKH) throws SQLException{
	return ResponseEntity.ok(service.getOneKH(maKH));
}

}
