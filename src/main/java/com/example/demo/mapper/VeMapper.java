package com.example.demo.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.*;
import java.util.*;
@Mapper
public interface VeMapper {
List<Ve> getAllVe(@Param("maPhim")String tenPhim); 
}
