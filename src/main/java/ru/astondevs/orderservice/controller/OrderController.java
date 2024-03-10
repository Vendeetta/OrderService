package ru.astondevs.orderservice.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.astondevs.orderservice.domain.Order;
import ru.astondevs.orderservice.service.OrderService;

@Data
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    public Order createOrder() {
        return orderService.createOrder();
    }

    public Order updateStatus() {
        return orderService.updateOrderStatus();
    }
}

