package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderTopping {
    private String MaTopping;
    private int SoLuongMua;
    private int IdVe;
    private String tenTopping;
    private float giaTopping;
}
