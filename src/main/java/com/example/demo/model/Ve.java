package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ve {
    private int IdVe;
    private double TongGiaVe;
    private double ThueVAT;
    private int MaKH;
    private int MaCTGhe;
    private String MaNV;
}