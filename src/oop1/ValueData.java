package oop1;

public class ValueData {
    int value;

    void add(){
        value++;
        System.out.println("숫자 증가 value = " + value);
    }

    void min(){
        value--;
        System.out.println("숫자 감소 value = " + value);
    }
}
