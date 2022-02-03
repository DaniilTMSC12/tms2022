public class Main {
    public static void main(String[] args) {
        User userFirst = new User();
        User userSecond = new User("Даниил", 18);
        userFirst.info("Даниил", "Луцкевич", "Мужской", 21);
        userFirst.nameSurname("Даниил", "Луцкевич");
        userFirst.plusAge(21);

    }
}
