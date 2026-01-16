package com.example.enterprise.api.impl;

import com.example.enterprise.api.OrderApi;
import com.example.enterprise.models.OrderRequest;
import com.example.enterprise.models.OrderResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // hybrid of controller and response body
public class OrderApiController implements OrderApi {
    @Override
    public ResponseEntity<OrderResponse> createOrder(OrderRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<String> cancelOrder(String orderId) {
        return null;
    }

    @Override
    public ResponseEntity<OrderResponse> getOrderByOrderId(String orderId) {
        return null;
    }

    @Override
    public ResponseEntity<List<OrderResponse>> getOrderByUserid(String userId) {
        return null;
    }
}
