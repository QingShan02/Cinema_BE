package com.example.demo.mapper;

import com.example.demo.model.SendEmail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SendEmailMapper {
    List<SendEmail> getAll();
}
