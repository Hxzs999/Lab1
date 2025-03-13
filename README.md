# Lab1
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
