import com.tms.report.Employee;
import com.tms.report.EmployeeReport;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String tms = "TeachMeSkills";
        //Task1
        System.out.println(tms.substring(0, 5));

        //Task2
        System.out.println(tms.replace('c', 'T'));

        //Task3
        String[] strings = {"Программист", "Машина", "Казак", "Дед", "Вода", "Заказ"};
        for (String string : strings) {
            if (string.equalsIgnoreCase(StringUtils.reverse(string))) {
                System.out.println(string);
            }
        }

        //Task4
        TextFormatter textFormatter = new TextFormatter();
        String text = "Привет. Меня зовут Даниил. Учусь в школе TeachMeSkills. Я пока не сделал окончательный заказ.";
        textFormatter.printSentence(text);

        //Task5
        String str1 = "daniil";
        String str2 = "auto";
        String str3 = "navigate";
        System.out.println(str1.substring(str1.length() / 2 - 1, str1.length() / 2 + 1));
        System.out.println(str2.substring(str2.length() / 2 - 1, str2.length() / 2 + 1));
        System.out.println(str3.substring(str3.length() / 2 - 1, str3.length() / 2 + 1));

        //Task6
        Employee daniil = new Employee("Д.С. Луцкевич", 2200.125);
        Employee elena = new Employee("Е.В. Иванова", 1500.2);
        Employee pavel = new Employee("П.И. Толстой", 2000);
        Employee[] employees = {daniil, elena, pavel};
        EmployeeReport employeeReport = new EmployeeReport();
        employeeReport.generateReport(employees);

        //Task7
        String example = "Один two three четыре five шесть. В итоге должно быть три слова.";
        String[] allWords = example.split(" ");
        int countOfEnglishWords = 0;
        for (String word : allWords) {
            if (word.matches("^[a-zA-Z]+$")) {
                countOfEnglishWords++;
            }
        }
        System.out.println("Кол-во английских слов равно " + countOfEnglishWords);


    }
}
