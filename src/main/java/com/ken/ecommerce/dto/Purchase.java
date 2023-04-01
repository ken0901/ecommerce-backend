package com.ken.ecommerce.dto;

import com.ken.ecommerce.entity.Address;
import com.ken.ecommerce.entity.Customer;
import com.ken.ecommerce.entity.Order;
import com.ken.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
