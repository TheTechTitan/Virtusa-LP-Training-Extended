package lk.titanium.shoppingcloud.orderservice.service;

import lk.titanium.shoppingcloud.model.order.Order;
import lk.titanium.shoppingcloud.orderservice.model.DetailResponse;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface OrderService {

    Order save(Order customer);
    Order findById(int id);
    List<Order> findAll();
    DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException;
}
