package com.shop.main;
import com.shop.products.Products;
import com.shop.orders.Orders;
import com.shop.users.Users;


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products p = new Products();
        Orders o = new Orders();
        Users u = new Users();

        u.showProfile();
        o.showOrder();
        p.display();

	}

}
