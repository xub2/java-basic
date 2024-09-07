package oop1;

public class Rectangle {
    int width;
    int height;

    int calculateArea(){ // 넓이
        return width * height;
    }

    int calculatePerimeter(){ // 둘레 길이
        return 2 * (width + height);
    }

    boolean isSquare(){
        return this.width == this.height;
    }
}
