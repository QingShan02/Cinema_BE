package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChiNhanh {
    private String MaCN;
    private String TenCN;
    private String DiaChi;
    private String SoDT;
    private boolean CheckGio;
}
