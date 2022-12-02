package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SendEmail {
    private int idVe;
    private String tenKH;
    private String email;
    private String gioBatDau;
    private String tenPhim;
    private String hangGhe;
    private String nc;
    private float giaVe;
    private String tenTopping;
    private int soLuongMua;
}
