class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class exercise {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.draw();  // 동적 바인딩에 의해 Circle 클래스의 draw() 메소드 호출
        shape2.draw();  // 동적 바인딩에 의해 Square 클래스의 draw() 메소드 호출
    }
}
