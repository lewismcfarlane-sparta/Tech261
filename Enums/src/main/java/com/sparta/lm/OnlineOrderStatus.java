package com.sparta.lm;

public enum OnlineOrderStatus {
    ORDER_PLACED,
    ORDER_CONFIRMED,
    PROCESSING_ORDER,
    ORDER_SHIPPED,
    ORDER_OUT_FOR_DELIVERY,
    ORDER_DELIVERED,
    ORDER_RETURNED,
    ORDER_REFUNDED;

    public static void main(String[] args) {
        OnlineOrderStatus status = OnlineOrderStatus.ORDER_CONFIRMED
    }
}
