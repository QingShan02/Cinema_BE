package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {
	private String MaNV;
    private String HoTen;
    private int GioiTinh;
    private String MatKhau;
    private String NgaySinh;
    private String SoDT;
    private String MaCV;
    private String TenCV;
}
