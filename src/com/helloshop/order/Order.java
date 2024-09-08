package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user , Product product){ //public 은 일단은 다른 패키지에서 사용할려면 붙여야한다 정도로 생각
        this.user = user; //인스턴스 자신을 가르킨다 즉 Order의 user
        this.product = product; //인스턴스 자신을 가르킨다 즉 Order의 product
    }
}
