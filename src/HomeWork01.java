public class HomeWork01 {
    public static void main(String[] args) {
        Two();
        System.out.println("a * (b + (c / d)) = " + Three(4.5f,2.8f,3.2f,4.6f));
        System.out.println(Four(6, 7));
        Five(-2);
        System.out.println(Six(-8));
        Seven("коллега");
        Eight(1990);
    }

    //2. Создать переменные всех пройденных типов данных и инициализировать их значения.
    static void Two() {
        System.out.println("Задание 2.");
        boolean b = true;
        byte bt = 2;
        short s = 100;
        int i = 555;
        long l = 12345L;
        double d = 123.456;
        float f = 3.14f;
        char c = 102;


        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа double = " + d);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа char = [" + c + "]");
    }
    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.

    static float Three(float a, float b, float c, float d) {
        System.out.println("\nЗадание 3.");
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    static boolean Four(int a, int b) {
        System.out.println("\nЗадание 4.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    // 5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    static void Five(int a) {
        System.out.println("\nЗадание 5.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    //6. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    static boolean Six(int a) {
        System.out.println("\nЗадание 6.");
        if (a < 0) return true;
        return false;
    }

    //7. Написать метод, которому в качестве параметра передается строка,
    // обозначающая имя. Метод должен вывести в консоль сообщение
    // «Привет, указанное_имя!».
    static void Seven(String name) {
        System.out.println("\nЗадание 7.");
        System.out.println("Привет, " + name + "!");
    }

    //8. * Написать метод, который определяет является ли год високосным, и выводит сообщение
    //в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
    //– високосный.
    static void Eight(int year) {
        System.out.println("\nЗадание 8.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}