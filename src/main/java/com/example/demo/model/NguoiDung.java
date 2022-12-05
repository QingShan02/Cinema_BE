package com.example.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NguoiDung {
	private String MaNguoiDung;
    private String TenNguoiDung;
    private String MatKhau;
    private String SoDT;
    private String MaCN;
    private String TenCN;
    
}
