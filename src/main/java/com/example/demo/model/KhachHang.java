package com.example.demo.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KhachHang implements Serializable {
    private int MaKH;
    private String TenKH;
    private String MatKhau;
    private String Email;
    private String SoDT;
    private String DiaChi;
    private int GioiTinh;
    private String IdFB;
    private String HinhFB;
    
}
