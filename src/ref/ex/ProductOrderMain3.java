package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력하실 주문의 개수를 입력하세요 : ");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] product = new ProductOrder[n];

        for(int i = 0 ; i < product.length ; i++){
            System.out.println( (i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();

            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            System.out.println("입력하신 물품의 가격은 : " + price * quantity);

            product[i] = createOrder(productName , price , quantity);
        }

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
