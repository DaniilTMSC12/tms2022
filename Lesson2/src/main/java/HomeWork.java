public class HomeWork {
    public static void main(String[] args) {
        //вывод на консоль
        printLiterals();
        //Некоторые тесты для проверки задач.
        System.out.println(sum(Integer.MAX_VALUE, 200));
        System.out.println(sum(300, 200));
        System.out.println(max(370, 349));
        System.out.println(calculateHypotenuse(12, 16));
    }

    private static void printLiterals() {
//        вывести на консоль литералы следующих видов:
//        логический
        boolean logic = true;
        System.out.println("Тру ор фолc? " + logic);
//        строковый
        String text = "Это строковый \"литерал\"";
        System.out.println(text);
//        символьный
        char letterA = '\141';
        char letterN = '%';
        System.out.println("Символьные литералы " + letterA + " и " + letterN);

//        целочисленный 2-й
        int a2 = 0b1010;
        System.out.println("Целочисленный литерал:");
        System.out.println("2-й " + a2);
//        целочисленный 8-й
        int b8 = 054321;
        System.out.println("8-й " + b8);
//        целочисленный 10-й
        int c10 = 123;
        System.out.println("10-й " + c10);
//        целочисленный 16-й
        int d16 = 0x14554A12;
        System.out.println("16-й " + d16);
//        литерал типа float
        float fl = 0.12f;
        System.out.println("float - " + fl);
//        литерал типа double.
        double dbl = 35.25;
        System.out.println("double - " + dbl);
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        long c = a;
        long math = c + b;
        if (math > Integer.MAX_VALUE) {
            return -1;
        } else {
            return a + b;
        }
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }


    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);

    }
}