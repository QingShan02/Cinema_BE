package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.ChiNhanhMapper;
import com.example.demo.mapper.NgayChieuMapper;
import com.example.demo.model.ChiNhanh;
import com.example.demo.service.ChiNhanhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiNhanhServiceImpl implements ChiNhanhService {
    @Autowired
    ChiNhanhMapper mapper;
//    NgayChieuMapper mapperNC;
    @Override
    public List<ChiNhanh> getAllChiNhanh() {

        return mapper.getAllChiNhanh();
    }
}
