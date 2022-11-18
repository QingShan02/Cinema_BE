package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.model.*;
@Mapper
public interface NguoiDungMapper {
	List<NguoiDung> getAllNV();
	NguoiDung findNVByEmailAndPassword(String sdt, String password);
	int insertNV(NguoiDung nv);
	int updateNV(NguoiDung nv);
	int deleteNV(String maNV);
}
