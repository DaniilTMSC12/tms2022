package com.tms.robot;

import com.tms.robot.hands.IHand;
import com.tms.robot.hands.SamsungHand;
import com.tms.robot.hands.SonyHand;
import com.tms.robot.hands.ToshibaHand;
import com.tms.robot.heads.IHead;
import com.tms.robot.heads.SamsungHead;
import com.tms.robot.heads.SonyHead;
import com.tms.robot.heads.ToshibaHead;
import com.tms.robot.legs.ILeg;
import com.tms.robot.legs.SamsungLeg;
import com.tms.robot.legs.SonyLeg;
import com.tms.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        System.out.println("Создание робота и презентация его работы №1");
        IHead samsungHead = new SamsungHead(15);
        ILeg toshibaLeg = new ToshibaLeg(13);
        IHand sonyHand = new SonyHand(23);
        IRobot robot1 = new Robot(samsungHead, sonyHand, toshibaLeg);
        robot1.action();
        System.out.println("-----------------");

        System.out.println("Создание робота и презентация его работы №2");
        IHead sonyHead = new SonyHead(25);
        ILeg samsungLeg = new SamsungLeg(55);
        IHand toshibaHand = new ToshibaHand(15);
        IRobot robot2 = new Robot(sonyHead, toshibaHand, samsungLeg);
        robot2.action();
        System.out.println("-----------------");

        System.out.println("Создание робота и презентация его работы №3");
        IHead toshibaHead = new ToshibaHead(8);
        ILeg sonyLeg = new SonyLeg(65);
        IHand samsungHand = new SamsungHand(43);
        IRobot robot3 = new Robot(toshibaHead, samsungHand, sonyLeg);
        robot3.action();
        System.out.println("-----------------");

        System.out.println("Расчёт наиболее дорого робота...");
        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Робот №1, его цена составляет " + robot1.getPrice() + " долларов.");
        } else if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Робот №2, его цена составляет " + robot2.getPrice() + " долларов.");
        } else {
            System.out.println("Робот №3, его цена составляет " + robot3.getPrice() + " долларов.");
        }


    }


}
