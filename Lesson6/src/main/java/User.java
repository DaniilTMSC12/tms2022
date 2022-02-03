public class User {
    private String name;
    private String surname;
    private int age;
    private String sex;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public User(String name, String surname, int age) {
        this(name, age);
        this.surname = surname;
    }

    public User(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public String nameSurname(String name, String surname) {
        this.name = name;
        this.surname = surname;
        return (name + " " + surname);
    }


    public int plusAge(int age) {
        this.age = age;
        return ++age;
    }

    @Deprecated
    public void info(String name, String surname, String sex, int age) {
        System.out.println("Пользователя зовут " + name + " " + surname + ". Пол: " + sex + ". Возраст: " + age);

    }


}
