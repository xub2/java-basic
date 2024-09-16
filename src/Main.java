import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 배열의 크기
        int M = sc.nextInt(); // 숫자가 더해지는 횟수
        int K = sc.nextInt(); // k번 초과하여 더할 수 없음

        int[] arr = new int[N];
        for (int array : arr) {
            arr[array] = sc.nextInt();
        }


        Arrays.sort(arr); // 배열의 원소를 오름차 순으로 정렬
        int first = arr[N-1];
        int second = arr[N-2];

        int count = (M / (K + 1)) * K;
        count += M % (K+1);

        int result = 0;
        result += count * first;
        result += (M - count) * second;

        System.out.println(result);


    }
}
