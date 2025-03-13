package org.example;
import java.util.Scanner;

public class Main {

    // Антипаттерн: God Object
    // Этот класс делает слишком много и нарушает принцип единственной ответственности.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Антипаттерн: Hard Code
        // Использование Scanner без закрытия ресурса.

        System.out.println("Введите число для вычисления факториала:");
        int number = scanner.nextInt();

        // Антипаттерн: Magic Number
        // Использование числа 1 без объяснения его значения.
        int result = factorial(number, 1);

        System.out.println("Факториал числа " + number + " равен " + result);

        // Использование всех методов
        //unusedMethod();
        multiply(3, 4);
        ChildClass child = new ChildClass();
        child.doSomething();
        calculateSomething(5);
        FactorialCalculator calculator = new FactorialCalculator();
        System.out.println("Факториал через FactorialCalculator: " + calculator.calculate(number));
        AnotherFactorialCalculator anotherCalculator = new AnotherFactorialCalculator();
        System.out.println("Факториал через AnotherFactorialCalculator: " + anotherCalculator.compute(number));
        BaseBean baseBean = new BaseBean();
        baseBean.doSomething();
        SequentialClass sequential = new SequentialClass();
        sequential.firstMethod();
        sequential.secondMethod();
        spaghettiMethod();
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
        UtilityClass.doSomething();
        LazyClass lazyClass = new LazyClass();
        lazyClass.doSomething();
        IncompleteLibrary library = new IncompleteLibrary();
        library.doSomething();
        CallSuper callSuper = new CallSuper();
        callSuper.doSomething();
        BlobClass blobClass = new BlobClass();
        blobClass.doSomething();
        Poltergeist poltergeist = new Poltergeist();
        poltergeist.doSomething();
        AmbiguousView ambiguousView = new AmbiguousView();
        ambiguousView.doSomething();
        TemporaryField temporaryField = new TemporaryField();
        temporaryField.doSomething();
        SwitchStatement switchStatement = new SwitchStatement();
        switchStatement.doSomething();
    }

    // Антипаттерн: Long Method
    // Этот метод слишком длинный и выполняет слишком много задач.
    public static int factorial(int n, int acc) {
        // Антипаттерн: Deeply Nested Code
        // Слишком глубокая вложенность условий.
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        } else if (n == 0) {
            return acc;
        } else {
            // Антипаттерн: Recursive Overhead
            // Использование рекурсии там, где можно обойтись циклом.
            return factorial(n - 1, acc * n);
        }
    }

    // Антипаттерн: Dead Code
    // Этот метод никогда не используется.
    public static void unusedMethod() {
        System.out.println("Этот метод никогда не вызывается.");
    }

    // Антипаттерн: Speculative Generality
    // Этот метод создан "на всякий случай", но не используется.
    public static int multiply(int a, int b) {
        System.out.println("Умножение: " + a + " * " + b + " = " + (a * b));
        return a * b;
    }

    // Антипаттерн: Refused Bequest
    // Класс наследуется, но не использует методы родительского класса.
    public static class ChildClass extends Main {
        public void doSomething() {
            System.out.println("Этот метод не использует методы родительского класса.");
        }
    }

    // Антипаттерн: Shotgun Surgery
    // Изменение этого метода потребует изменения множества других частей кода.
    public static int calculateSomething(int x) {
        System.out.println("Вычисление: " + x + " * " + x + " = " + (x * x));
        return x * x;
    }

    // Антипаттерн: Alternative Classes with Different Interfaces
    // Два класса выполняют схожие задачи, но имеют разные интерфейсы.
    public static class FactorialCalculator {
        public int calculate(int n) {
            return factorial(n, 1);
        }
    }

    public static class AnotherFactorialCalculator {
        public int compute(int n) {
            return factorial(n, 1);
        }
    }

    // Антипаттерн: BaseBean
    // Класс, который используется как базовый для всех остальных классов.
    public static class BaseBean {
        public void doSomething() {
            System.out.println("Базовый метод.");
        }
    }

    // Антипаттерн: Constant Interface
    // Интерфейс, используемый только для хранения констант.
    public interface Constants {
        int ZERO = 0;
        int ONE = 1;
    }

    // Антипаттерн: Sequential Coupling
    // Методы должны вызываться в строгом порядке.
    public static class SequentialClass {
        public void firstMethod() {
            System.out.println("Первый метод.");
        }

        public void secondMethod() {
            System.out.println("Второй метод.");
        }
    }

    // Антипаттерн: Spaghetti Code
    // Код, который трудно понять и поддерживать.
    public static void spaghettiMethod() {
        int x = 5;
        if (x > 3) {
            x += 2;
        } else {
            x -= 2;
        }
        if (x % 2 == 0) {
            x *= 2;
        } else {
            x /= 2;
        }
        System.out.println("Результат: " + x);
    }

    // Антипаттерн: Singleton
    // Класс, который гарантирует создание только одного экземпляра.
    public static class Singleton {
        private static Singleton instance;

        private Singleton() {
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        public void doSomething() {
            System.out.println("Singleton метод.");
        }
    }

    // Антипаттерн: Utility Class
    // Класс, который содержит только статические методы.
    public static class UtilityClass {
        public static void doSomething() {
            System.out.println("Utility метод.");
        }
    }

    // Антипаттерн: Lazy Class
    // Класс, который не делает достаточно, чтобы оправдать свое существование.
    public static class LazyClass {
        public void doSomething() {
            System.out.println("Lazy метод.");
        }
    }

    // Антипаттерн: Incomplete Library Class
    // Класс, который не предоставляет всех необходимых методов.
    public static class IncompleteLibrary {
        public void doSomething() {
            System.out.println("Incomplete Library метод.");
        }
    }

    // Антипаттерн: Call Super
    // Класс, который должен вызывать метод родительского класса, но не делает этого.
    public static class CallSuper extends BaseBean {
        @Override
        public void doSomething() {
            System.out.println("Call Super метод.");
            // super.doSomething(); // Не вызываем метод родительского класса.
        }
    }

    // Антипаттерн: Blob Class
    // Класс, который содержит слишком много данных и методов.
    public static class BlobClass {
        private int data1;
        private int data2;
        private int data3;

        public void doSomething() {
            System.out.println("Blob метод.");
        }
    }

    // Антипаттерн: Poltergeist
    // Класс, который существует только для вызова других классов.
    public static class Poltergeist {
        public void doSomething() {
            System.out.println("Poltergeist метод.");
            UtilityClass.doSomething();
        }
    }

    // Антипаттерн: Ambiguous View
    // Класс, который имеет неоднозначный интерфейс.
    public static class AmbiguousView {
        public void doSomething() {
            System.out.println("Ambiguous View метод.");
        }
    }

    // Антипаттерн: Temporary Field
    // Класс, который содержит временные поля, используемые только в одном методе.
    public static class TemporaryField {
        private int tempField;

        public void doSomething() {
            tempField = 42;
            System.out.println("Temporary Field метод: " + tempField);
        }
    }

    // Антипаттерн: Switch Statement
    // Класс, который использует оператор switch, который может быть заменен полиморфизмом.
    public static class SwitchStatement {
        public void doSomething() {
            int day = 3;
            switch (day) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                default:
                    System.out.println("Другой день");
            }
        }
    }
}

/*
God Object: Класс AntiPatternsExample делает слишком много и нарушает принцип единственной ответственности.
Hard Code: Использование Scanner без закрытия ресурса.
Magic Number: Использование числа 1 без объяснения его значения.
Long Method: Метод factorial слишком длинный и выполняет слишком много задач.
Deeply Nested Code: Слишком глубокая вложенность условий в методе factorial.
Recursive Overhead: Использование рекурсии там, где можно обойтись циклом.
Dead Code: Метод unusedMethod никогда не используется.
Speculative Generality: Метод multiply создан "на всякий случай", но не используется.
Refused Bequest: Класс ChildClass наследуется, но не использует методы родительского класса.
Shotgun Surgery: Изменение метода calculateSomething потребует изменения множества других частей кода.
Alternative Classes with Different Interfaces: Два класса FactorialCalculator и AnotherFactorialCalculator выполняют схожие задачи, но имеют разные интерфейсы.
BaseBean: Класс BaseBean используется как базовый для всех остальных классов.
Constant Interface: Интерфейс Constants используется только для хранения констант.
Sequential Coupling: Методы класса SequentialClass должны вызываться в строгом порядке.
Spaghetti Code: Метод spaghettiMethod трудно понять и поддерживать.
Singleton: Класс Singleton гарантирует создание только одного экземпляра.
Utility Class: Класс UtilityClass содержит только статические методы.
Lazy Class: Класс LazyClass не делает достаточно, чтобы оправдать свое существование.
Incomplete Library Class: Класс IncompleteLibrary не предоставляет всех необходимых методов.
Call Super: Класс CallSuper должен вызывать метод родительского класса, но не делает этого.
Blob Class: Класс BlobClass содержит слишком много данных и методов.
Poltergeist: Класс Poltergeist существует только для вызова других классов.
Ambiguous View: Класс AmbiguousView имеет неоднозначный интерфейс.
Temporary Field: Класс TemporaryField содержит временные поля, используемые только в одном методе.
Switch Statement: Класс SwitchStatement использует оператор switch, который может быть заменен полиморфизмом.
*/
