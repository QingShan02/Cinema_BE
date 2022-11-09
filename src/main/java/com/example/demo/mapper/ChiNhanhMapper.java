package com.example.demo.mapper;

import com.example.demo.model.ChiNhanh;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChiNhanhMapper {
    List<ChiNhanh> getAllChiNhanh();
}
