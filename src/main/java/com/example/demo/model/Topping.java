package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topping {
    private String MaTopping;
    private String TenTopping;
    private int SoLuongDangCo;
    private double Gia;
}