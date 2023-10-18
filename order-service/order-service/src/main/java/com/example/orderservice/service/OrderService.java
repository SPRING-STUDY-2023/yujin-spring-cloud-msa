package com.example.orderservice.service;

import com.example.orderservice.dto.OrderDto;
import com.example.orderservice.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails); // 상품 주문
    OrderDto getOrderByOrderId(String orderId); // 주문 상세 조회
    Iterable<OrderEntity> getOrdersByUserId(String userId); // 회원 별 주문 조회
}