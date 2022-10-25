package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CTTopping {
	int insertTP(@Param("idVe")int idVe,@Param("maTopping") String maTopping,@Param("soLuongMua") int soLuongMua);
}
