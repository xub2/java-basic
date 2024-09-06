package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder[] product = new ProductOrder[3];

        product[0] = createOrder("두부", 2000, 2);
        product[1] = createOrder("김치", 5000, 2);
        product[2] = createOrder("콜라", 1500, 2); // 객체를 생성하고 배열에 담는다

        printOrders(product); // product 변수에는 현재 크기가 3인 배열의 주소값이 들어 있다 예를 들어 x001이라고 하자

        int totalPrice = totalOrderAmount(product);
        System.out.println("총 결제 금액 : " + totalPrice);

    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();

        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders){ // 여기서 product 변수 안에 있는 주소 값을 orders에 대입 즉 x001이 파라미터로 사용되는중
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price +", 개수 : " + order.quantity );
        }
    }

    static int totalOrderAmount(ProductOrder[] orders){
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
