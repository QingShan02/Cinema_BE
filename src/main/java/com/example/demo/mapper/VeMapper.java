package com.example.demo.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.*;
import java.util.*;
@Mapper
public interface VeMapper {
List<Ve> getAllVe();
int insertVe(@Param("tongGiaVe") double tongGiaVe,@Param("thueVat") double thueVat,@Param("maCTGhe") int maCTGhe,@Param("maKH") int maKH);
List<Ve> getLichSuVe(@Param("maKH") int maKH);
}
