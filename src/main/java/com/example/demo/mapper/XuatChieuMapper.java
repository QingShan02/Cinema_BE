package com.example.demo.mapper;

import com.example.demo.model.XuatChieu;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface XuatChieuMapper {
    List<XuatChieu> getLichChieu();
}
