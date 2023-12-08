public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        // Пример реализации уравнения: (10 - 2) * 3 / 5 + 4
        int result = div(times(dif(10, 2), 3), 5);
        result = add(result, 4);
        return result;
    }
}
