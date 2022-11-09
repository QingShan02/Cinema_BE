package com.example.demo.mapper;

import com.example.demo.model.PhongChieu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PhongChieuMapper {
    List<PhongChieu> getAllPhongChieu(@Param("maCN") String maCN);
}
