package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.NgayChieuMapper;
import com.example.demo.model.NgayChieu;
import com.example.demo.service.NgayChieuService;

@Service
public class NgayChieuServiceImpl implements NgayChieuService {
    @Autowired
    NgayChieuMapper mapper;

    @Override
    public List<NgayChieu> getGioByPhim(String maphim, String ngay) {
        // TODO Auto-generated method stub
        return mapper.getGioByPhim(maphim, ngay);
    }

    @Override
    public int insertNgayChieu(String ngay, String gioBatDau) {

        return mapper.insertNgayChieu(ngay, gioBatDau);
    }

    @Override
    public List<NgayChieu> getGioBatDau(String macn, String maphim) {

        return mapper.getGioBatDau(macn, maphim);
    }

    @Override
    public List<NgayChieu> getNgay() {
        return mapper.getNgay();
    }

    @Override
    public NgayChieu getNgayChieu(String ngay, String gioBatDau) {
        return mapper.getNgayChieu(ngay, gioBatDau);
    }

    @Override
    public int getMaxStt() {
        return mapper.getMaxStt();
    }
    @Override
    public List<NgayChieu> getgiobatdau1ngay(String macn,String ngay) {
        return mapper.getgiobatdau1ngay(macn,ngay);
    }
}
