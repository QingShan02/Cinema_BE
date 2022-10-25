package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Topping;

@Mapper
public interface ToppingMapper {
	List<Topping> getAllTP();
}
