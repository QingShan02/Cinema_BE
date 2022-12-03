package com.example.demo.ResController;

import com.example.demo.model.OrderTopping;
import com.example.demo.service.OrderToppingService;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/order")
@CrossOrigin("*")

public class ApiOrderTopping {
    @Autowired
    OrderToppingService service;

    @GetMapping("/getAll")
    public ResponseEntity<List<OrderTopping>> getAll() throws SQLException{
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/insert")
    public ResponseEntity<Integer> insert(@RequestParam("maTopping") String maTopping,@RequestParam("soLuongMua") int soLuongMua, @RequestParam("idVe") int idVe ) throws SQLException{
        return ResponseEntity.ok(service.insert(maTopping,soLuongMua,idVe));
    }
    @GetMapping("/getOrder")
    public ResponseEntity<List<OrderTopping>> getOrder(@RequestParam("idVe") int idVe) throws SQLException{
        return ResponseEntity.ok(service.getOrder(idVe));
    }
}
