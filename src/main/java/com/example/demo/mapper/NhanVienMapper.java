package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.model.*;
@Mapper
public interface NhanVienMapper {
	List<NhanVien> getAllNV();
	NhanVien findNVByEmailAndPassword(String sdt, String password);
}
