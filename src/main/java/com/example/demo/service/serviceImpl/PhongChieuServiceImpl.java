package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.PhongChieuMapper;
import com.example.demo.model.PhongChieu;
import com.example.demo.service.PhongChieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongChieuServiceImpl implements PhongChieuService {
    @Autowired
    PhongChieuMapper mapper;
    @Override
    public List<PhongChieu> getAllPhongChieu(String maCN) {
        return mapper.getAllPhongChieu(maCN);
    }
}
