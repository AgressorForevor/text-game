package com.banana.textgame;

import java.util.Scanner;

public class Main {

    /*
     * :с
     */

    public static void main(String[] args) {
        // вызывает метод start()
        new Main().start();
    }

    /*
     * Метод с логикой игры.
     */
    private void start() {
        onStart();
        for (int i = 1; i <= 5; ++i) {
            onNewDay(i);
        }
        onFinish();
    }

    /*
     * Метод вызывается один раз при старте игры.
     */
    void onStart() {
        System.out.println ("привет");
        Scanner клавиатура = new Scanner (System.in);
        System.out.println("Как тебя зовут?");
       String имя = клавиатура.nextLine();
        System.out.println("Привет," + имя);

        System.out.println ("Сколько тебе лет?");
       int возраст = клавиатура.nextInt();
        System.out.println ("Возраст:" + возраст);


    }
    int ОбщийЗаработок = 0;
    /*
     * Метод вызывается каждый игровый день.
     * Единственный параметр: dayNumber - номер текущего игрового дня.
     */
    void onNewDay(int dayNumber) {
    System.out.println ("бУДНИ..." + dayNumber);
    Scanner клавиатура = new Scanner (System.in);
    System.out.println("Введите код: ");
    String код = клавиатура.nextLine();
    код = код.trim();
    int заработок = код.length();
        ОбщийЗаработок = ОбщийЗаработок + заработок;
    System.out.println("За день вы заработали:" + заработок +"$. ");




    }

    /*
     * Метод вызывается по завершению игры.
     */
    void onFinish() {
        System.out.println ("пОКИ");
    }

}
