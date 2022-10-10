package com.example.demo.mapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.model.*;
import java.util.*;
@Mapper
public interface VeMapper {
List<Ve> getAllVe();
}
