public class OperatorsDemo {

    void add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }

    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        // Arithmetic promotion
        byte a = 10, b = 20;
        int result = a + b;
        System.out.println("Arithmetic promotion result: " + result);

        int x = 10, y = 3;

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        OperatorsDemo obj = new OperatorsDemo();

        obj.add(5, 7);

        int product = obj.multiply(4, 6);
        System.out.println("Multiplication: " + product);
    }
}


OUTPUT:
Arithmetic promotion result: 30
x + y = 13
x - y = 7
x * y = 30
x / y = 3
x % y = 1
Addition: 12
Multiplication: 24
