package com.shop.orders;

public class Orders {
	
	public String orderId = "ORD2025";
    public String status = "Shipped";

    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: " + status);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
