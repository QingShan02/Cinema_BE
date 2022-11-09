package com.example.demo.service.serviceImpl;

import com.example.demo.mapper.XuatChieuMapper;
import com.example.demo.model.XuatChieu;
import com.example.demo.service.XuatChieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XuatChieuServiceImpl implements XuatChieuService {
    @Autowired
    XuatChieuMapper mapper;
    @Override
    public List<XuatChieu> getLichChieu() {
        return mapper.getLichChieu();
    }
}
