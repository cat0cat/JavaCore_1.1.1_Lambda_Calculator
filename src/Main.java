import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {

        //создаем экземпляр класса Calculator через вызов статической переменной instance:
        Calculator calc = Calculator.instance.get();

        //несколько математических операций над числами:
        int a = calc.plus.apply(1, 2); // 1+2=3
        int b = calc.minus.apply(1,1); //1-1=0
        int c = calc.devide.apply(a, b); // 3/0 - Ошибка являлась результатом деления на 0
        // Для решения этой проблемы можно переделать операцию деления:
        // в случае 0 в знаменателе, результатом деления станет 0
        //BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;

        //выводим в консоль результат:
        calc.println.accept(c);

    }
}
