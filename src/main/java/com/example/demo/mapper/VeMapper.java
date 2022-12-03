package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.*;

import java.util.*;

@Mapper
public interface VeMapper {
    List<Ve> getAllVe();

    int insertVe(@Param("giaVe") double tongGiaVe, @Param("thueVat") double thueVat, @Param("maCTGhe") int maCTGhe, @Param("maKH") int maKH, @Param("stt_xc") int stt_xc);

    List<Ve> getLichSuVe(@Param("maKH") int maKH);
    Ve getVe(@Param("idVe") int idVe);
    List<Ve> CountVeByChiNhanh(@Param("maCN") String macn);
    List<Ve> CountVeByPhim(@Param("maCN") String macn);
}
