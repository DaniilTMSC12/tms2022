import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
//1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
        int week = (int) (Math.random() * 8);
        switch (week) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            default -> System.out.println("Выходной");
        }

//2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
        int count = 1;
        for (int hours = 3; hours <= 24; hours += 3) {
            count *= 2;
            System.out.println("Через " + hours + " часа(ов) времени будет " + count + " амёб");
        }


//3) В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
        int number = 53245352;
        int countOfNumber = 0;
        if (number > 0) {
            for (int i = number; i != 0; i /= 10) {
                ++countOfNumber;
            }
            System.out.println(number + " - это положительное число, количество цифр = " + countOfNumber);
        } else if (number < 0) {
            for (int i = number; i != 0; i /= 10) {
                ++countOfNumber;
            }
            System.out.println(number + " - это отрицательное число, количество цифр = " + countOfNumber);
        } else {
            System.out.println("Ошибка! Число равно нулю! Количество цифр = 1");
        }

//4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
        int day = 28;
        int month = 11;
        if (day >= 21 && day <= 31 && month == 3 || day >= 1 && day <= 20 && month == 4) {
            System.out.println("Твой знак зодиака - Овен.");
        } else if (day >= 21 && day <= 30 && month == 4 || day >= 1 && day <= 21 && month == 5) {
            System.out.println("Твой знак зодиака - Телец.");
        } else if (day >= 22 && day <= 31 && month == 5 || day >= 1 && day <= 21 && month == 6) {
            System.out.println("Твой знак зодиака - Близнецы.");
        } else if (day >= 22 && day <= 30 && month == 6 || day >= 1 && day <= 22 && month == 7) {
            System.out.println("Твой знак зодиака - Рак.");
        } else if (day >= 23 && day <= 31 && month == 7 || day >= 1 && day <= 21 && month == 8) {
            System.out.println("Твой знак зодиака - Лев.");
        } else if (day >= 22 && day <= 30 && month == 8 || day >= 1 && day <= 23 && month == 9) {
            System.out.println("Твой знак зодиака - Дева.");
        } else if (day >= 24 && day <= 31 && month == 9 || day >= 1 && day <= 23 && month == 10) {
            System.out.println("Твой знак зодиака - Весы.");
        } else if (day >= 24 && day <= 30 && month == 10 || day >= 1 && day <= 23 && month == 11) {
            System.out.println("Твой знак зодиака - Скорпион.");
        } else if (day >= 23 && day <= 31 && month == 11 || day >= 1 && day <= 22 && month == 12) {
            System.out.println("Твой знак зодиака - Стрелец.");
        } else if (day >= 23 && day <= 30 && month == 12 || day >= 1 && day <= 20 && month == 1) {
            System.out.println("Твой знак зодиака - Козерог.");
        } else if (day >= 21 && day <= 31 && month == 1 || day >= 1 && day <= 19 && month == 2) {
            System.out.println("Твой знак зодиака - Водолей.");
        } else if (day >= 20 && day <= 29 && month == 2 || day >= 1 && day <= 20 && month == 3) {
            System.out.println("Твой знак зодиака - Телец.");
        } else {
            System.out.println("Ошибка! Проверьте правильность введенной даты!");
        }

        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println("Количество нечетных чисел в массиве равно " + calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(101);
        countDevs(104);
        countDevs(218);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        System.out.println("Введите длину массива:");
        Scanner numIn = new Scanner(System.in);
        if (numIn.hasNextInt()) { // проверка на инт
            int num = numIn.nextInt();
            if (num > 0) { // проверка на положительность
                int[] mas = new int[num];
                for (int i = 0; i < mas.length; i++) {
                    mas[i] = (int) (Math.random() * 9999);
                }
                System.out.println(Arrays.toString(mas));
            } else {
                System.out.println("Ошибка! Введите целое положительное число!");
                printArray();
            }
        } else {
            System.out.println("Ошибка! Введите целое положительное число!");
            printArray();

        }
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number == 0) {
            return 10;
        }
        return number > 0 && number != 0 ? ++number : number - 2;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int elem = 0;
        for (int i : ints) {
            if (i % 2 != 0) {
                elem++;
            }

        }
        return elem;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        if (count % 10 == 1) {
            System.out.println(count + " программист");
        } else if (count % 10 >= 2 && count % 10 <= 4) {
            System.out.println(count + " программиста");
        } else {
            System.out.println(count + " программистов");
        }
    }


    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        // тут пишем логику
    }
}