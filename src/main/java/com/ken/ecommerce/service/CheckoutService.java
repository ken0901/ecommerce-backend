package com.ken.ecommerce.service;

import com.ken.ecommerce.dto.Purchase;
import com.ken.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
