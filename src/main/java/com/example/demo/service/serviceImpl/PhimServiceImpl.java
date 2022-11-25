package com.example.demo.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.NgayChieuMapper;
import com.example.demo.mapper.PhimMapper;
import com.example.demo.model.NgayChieu;
import com.example.demo.model.Phim;
import com.example.demo.service.PhimService;

@Service
public class PhimServiceImpl implements PhimService {
    @Autowired
    PhimMapper mapper;
    @Autowired
    NgayChieuMapper mapperNC;

    @Override
    public List<Phim> getAllPhim() {
        // TODO Auto-generated method stub
        return mapper.getAllPhim();
    }

    @Override
    public List<Phim> getAllPhim2() {
        // TODO Auto-generated method stub
        return mapper.getAllPhim2();
    }

    @Override
    public Phim getMaPhim(String maPhim, String ngay) {
        // TODO Auto-generated method stub
        List<String> list = new ArrayList<>();
        System.out.println(maPhim + "ne");
        getTheLoai(maPhim).forEach(s -> {
            list.add(s.getTentheloai());
        });
        Phim p = mapper.getMaPhim(maPhim);
        p.setListTheloai(list);
        List<String> list2 = new ArrayList<>();

//		list.clear();
        mapperNC.getGioByPhim(maPhim, ngay).forEach(s -> {
            list2.add(s.getGioBatDau());
        });
        p.setKhunggio(list2);
        return p;
    }

    @Override
    public List<Phim> getTheLoai(String maPhim) {
        // TODO Auto-generated method stub
        return mapper.getTheLoai(maPhim);
    }

    //	@Override
//	public List<Phim> getGioBatDau(String maPhim) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public List<Phim> getGioBatDau(String maPhim, String Ngay) {
//		// TODO Auto-generated method stub
//		return mapper.getGioBatDau(maPhim, Ngay);
//	}
    @Override
    public List<Phim> getGioBatDau(String maPhim, String Ngay) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public int insertPhim(Phim phim) {
        if (phim != null) {
            mapper.insertPhim(phim);
            return 1;
        }
        return 0;
    }

    @Override
    public int updatePhim(Phim phim) {
        if (phim != null) {
            mapper.updatePhim(phim);
            return 1;
        }
        return 0;
    }

    @Override
    public int deletePhim(String maPhim) {
        if (maPhim != "") {
            mapper.deletePhim(maPhim);
            return 1;
        }
        return 0;
    }


}
