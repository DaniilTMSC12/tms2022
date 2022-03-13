package com.tms.task5;


import java.io.File;
import java.io.IOException;


public class Task5 {
    private static final String FILE_NAME = "Lesson14/src/main/java/com/tms/task5/car.json";

    public static void main(String[] args) throws IOException {
//        Car car = new Car("Toyota", 230, 35000);
        File file = new File(FILE_NAME);
//        ObjJsonInteract.writeObjToJson(file, car);
        Car carFromJson = ObjJsonInteract.readObjFormJson(file, Car.class);
        System.out.println(carFromJson);
    }
}
