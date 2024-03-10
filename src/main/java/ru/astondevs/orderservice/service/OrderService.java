package ru.astondevs.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.astondevs.orderservice.domain.Order;
import ru.astondevs.orderservice.repository.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    /**
     * Create new Order from request.
     *
     * @return new Order.
     */
    public Order createOrder() {
        return null;
    }

    /**
     * Update order status.
     *
     * @return order.
     */
    public Order updateOrderStatus() {
        return null;
    }
}
