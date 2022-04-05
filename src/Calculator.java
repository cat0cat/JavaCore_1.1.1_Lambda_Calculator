import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    //переменные типа BinaryOperator для математических операций над двумя числами. Типизируем их как Integer:
    BinaryOperator<Integer> plus = (x, y) -> x + y; // 1+2=3
    BinaryOperator<Integer> minus = (x, y) -> x - y; //1-1=0
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> devide = (x, y) -> x / y; // 3/0
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;

    //переменные типа UnaryOperator для произведения математических операций над одним числом:
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    //переменная типа Predicate для определения положительное ли число:
    Predicate<Integer> isPositive = x -> x > 0;

    //переменную типа Consumer для вывода числа в консоль.
    // Используем для этого ссылку на статический метод println():
    Consumer<Integer> println = System.out::println;
}
