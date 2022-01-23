import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HomeWork2 {


    public static void main(String[] args) {

        //Тесты
        System.out.println("Среднее значение массива равно " + average(null));
        System.out.println("Максимальное значение массива равно " + max(null));

        //Задачи:
        //1) Используя тип данных char и операцию инкремента вывести на консоль все буквы английского алфавита

        for (char abc = 'a'; abc <= 'z'; abc++) {
            System.out.println(abc);
        }

        //2)Проверка четности числа
        //Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
        // чётным или нет. Ввод числа осуществлять с помощью класса Scanner.
        // Если пользователь введёт не целое число, то сообщать ему об ошибке.


        System.out.println("Введите ваше целое число: ");
        Scanner numIn = new Scanner(System.in);
        if (numIn.hasNextInt()) {
            int number = numIn.nextInt();
            if (number % 2 == 0) {
                System.out.println("Число " + number + " является четным");
            } else {
                System.out.println("Число " + number + " является нечетным");
            }

        } else {
            System.out.println("Ошибка! Вы ввели неверный формат числа");

        }
        //3) Меньшее по модулю число
        //Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых
        // пользователем вещественных чисел с консоли.
        System.out.println("Введите ваши 3 вещественных числа: ");
        Scanner numIn2 = new Scanner(System.in);
        // System.out.println(a + " " + b + " " + c);
        if (numIn2.hasNextDouble()) {
            double a = numIn2.nextDouble();
            double b = numIn2.nextDouble();
            double c = numIn2.nextDouble();
            if (Math.abs(a) <= Math.abs(b) && Math.abs(a) <= Math.abs(c)) {
                System.out.println("Наименьшее вещественное число по модулю равно " + a);
            } else if (Math.abs(b) <= Math.abs(a) && Math.abs(b) <= Math.abs(c)) {
                System.out.println("Наименьшее вещественное число по модулю равно " + b);
            } else {
                System.out.println("Наименьшее вещественное число по модулю равно " + c);
            }

        } else {
            System.out.println("Ошибка! Проверьте ваши числа!");
        }

//4) На некотором предприятии инженер Петров создал устройство, на табло которого показывается количество секунд,
        // оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
        // когда времени 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0»
        // (т.е. рабочий день закончился).
        //Программист Иванов заметил, как страдают офисные сотрудницы — им неудобно оценивать остаток рабочего дня в секундах.
        // Иванов вызвался помочь сотрудницам и написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том,
        // сколько полных часов осталось до конца рабочего дня. Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
        //Итак, в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800],
        // далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна
        // выводиться фраза о количестве полных часов, содержащихся в n секундах.

        int n = (int) (Math.random() * 28801);
        if (n >= 25201) {
            System.out.println("До конца рабочего дня осталось " + n + " секунд");
            System.out.println("До конца рабочего дня осталось 8 часов");
        } else if (n >= 21601) {
            System.out.println("До конца рабочего дня осталось " + n + " секунд");
            System.out.println("До конца рабочего дня осталось 7 часов");
        } else if (n >= 18001) {
            System.out.println("До конца рабочего дня осталось " + n + " секунд");
            System.out.println("До конца рабочего дня осталось 6 часов");
        } else if (n >= 14400) {
            System.out.println("До конца рабочего дня осталось " + n + " секунд");
            System.out.println("До конца рабочего дня осталось 5 часов");
        } else if (n >= 10801) {
            System.out.println("До конца рабочего дня осталось " + n + " секунд");
            System.out.println("До конца рабочего дня осталось 4 часа");
        } else if (n >= 7201) {
            System.out.println("До конца рабочего дня осталось " + n + " секунд");
            System.out.println("До конца рабочего дня осталось 3 часа");
        } else if (n >= 3601) {
            System.out.println("До конца рабочего дня осталось " + n + " секунд");
            System.out.println("До конца рабочего дня осталось 2 часа");
        } else {
            System.out.println("До конца рабочего дня осталось " + n + " секунд");
            System.out.println("До конца рабочего дня осталось менее 1 часа");

        }
        //5) Необходимо написать программу, которая будет выводить на консоль таблицу приведения типов!
//              byte	short	char	int 	long	float	double	boolean
//    byte
//    short
//    char
//    int
//    long
//    float
//    double
//    boolean
//
//    На пересечении напишите следующие фразы:
//    ня (неявное) – если преобразование происходит автоматически,
//    я (явное) – если нужно использовать явное преобразование,
//    х – если преобразование невозможно,
//    т  - если преобразование тождественно.
//    Внимание! используйте System.out.printLn
        System.out.println("      byte  short  char  int  long  float  double  boolean");
        System.out.println("byte    т     ня     я    ня    ня    ня      ня      х");
        System.out.println("short   x      т     я    ня    ня    ня      ня      х");
        System.out.println("char    я      я     т    ня    ня    ня      ня      х");
        System.out.println("int     я      я     я     т    ня    ня      ня      х");
        System.out.println("long    я      я     я     я     т    ня      ня      х");
        System.out.println("float   я      я     я     я     я     т      ня      х");
        System.out.println("double  я      я     я     я     я     я       т      х");
        System.out.println("boolean x      x     x     x     x     x       x      т");


    }


    /**
     * 6) Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */

    public static double average(int[] array) {
        int[] mas = {1, 1, 1, 1, 2};
        double avg = (double) Arrays.stream(mas).sum() / mas.length;
        return avg;


    }

    /**
     * 7) Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        int[] ar = {1, 2, 10, 3};
        IntStream z = Arrays.stream(ar);
        OptionalInt max = z.max();
        int maxArray = max.getAsInt();
        return maxArray;
    }
}