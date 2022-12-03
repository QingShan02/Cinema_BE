package com.example.demo.service;

import com.example.demo.model.OrderTopping;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrderToppingService {
    int insert(String maTopping, int soLuongMua, int idVe);
    List<OrderTopping> getAll();
    List<OrderTopping> getOrder( int idVe);

}
