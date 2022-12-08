package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Phim;
import com.example.demo.model.Topping;

@Mapper
public interface ToppingMapper {
	List<Topping> getAllTP();
	
//	int insertTP(Topping topping);

	int insertTP(String maTopping, String tenTopping, double gia);
	int deleteTP(String maTopping);
	int updateTP(String maTopping, String tenTopping, double gia);
}
