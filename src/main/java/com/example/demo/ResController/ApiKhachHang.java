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

	@GetMapping("/authen")
	public ResponseEntity<Integer> findKH(@RequestParam("maKH") int MaKH, HttpServletRequest s) throws SQLException {
		KhachHang kh = service.findKH(MaKH);
		System.out.println(s.getRequestURL());
		int check = 0;
		List<KhachHang> list = (List<KhachHang>) s.getSession().getAttribute("user_a");
		if (list == null) {
//			list.clear();
			list = new ArrayList<>();
			s.getSession().setAttribute("user_a", list);
			check = 1;
		}
		list.add(kh);
		System.out.println(s.getSession().getValue("user_a"));
//		s.getSession().setAttribute("user_a", list);

		System.out.println("authen:"+list.size());
		return ResponseEntity.ok(0);

	}
	@GetMapping("/checkKH")
	public ResponseEntity<List<KhachHang>> getKH(HttpServletRequest req,HttpServletResponse res) throws SQLException{
		List<KhachHang> list = (List<KhachHang>) req.getSession().getAttribute("user_a");
//		System.out.println(list.size());
		if(list==null) {
			list = new ArrayList<>();
			req.getSession().setAttribute("user_a", list);
		}
		System.out.println(list.size());
		return ResponseEntity.ok(list);
	}
}
