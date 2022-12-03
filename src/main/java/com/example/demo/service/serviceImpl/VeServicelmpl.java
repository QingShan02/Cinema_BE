package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.mapper.VeMapper;
import com.example.demo.model.Ve;
import com.example.demo.service.VeService;

@Service
public class VeServicelmpl implements VeService {
    @Autowired
    VeMapper mapper;

    @Override
    public List<Ve> getAllVe() {
        // TODO Auto-generated method stub
        return mapper.getAllVe();
    }

    @Override
    public int insertVe(double tongGiaVe, double thueVat, int maCTGhe, int maKH, int stt_xc) {
        // TODO Auto-generated method stub
        int temp = 0;
        if (mapper.insertVe(tongGiaVe, thueVat, maCTGhe, maKH, stt_xc) == 1) {
            temp = idVe();
        }
        return temp;
    }

    @Override
    public List<Ve> getLichSuVe(int maKH) {
        // TODO Auto-generated method stub
        return (List<Ve>) mapper.getLichSuVe(maKH);
    }

    @Override
    public Ve getVe(int idVe) {
        return mapper.getVe(idVe);
    }

    @Override
    public List<Ve> CountVeByChiNhanh(String macn) {
        return mapper.CountVeByChiNhanh(macn);
    }

    @Override
    public List<Ve> CountVeByPhim(String macn) {
        return mapper.CountVeByPhim(macn);
    }

    @Override
    public int idVe() {
        List<Ve> list = getAllVe();
        System.out.println(list.size());
//			Collections.sort(list, Collections.reverseOrder());
        return list.get(list.size() - 1).getIdVe();
    }
}
