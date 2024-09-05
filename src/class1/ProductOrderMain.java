package class1;

public class ProductOrderMain {
    public static void main(String[] args) {


        ProductOrder[] order = new ProductOrder[3];
        int total = 0;

        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;
        order[0] = tofu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        order[1] = kimchi;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;
        order[2] = coke;






        for(int i = 0; i < order.length ; i++){
            total += order[i].price * order[i].quantity;
            System.out.println("상품명 : " + order[i].productName + ", 가격 : " + order[i].price + ", 수량 : " + order[i].quantity);
        }

        System.out.println("총 결제 가격 : " + total);

    }
}
