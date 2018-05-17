package logik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task {


    public void task3() throws IOException {
        System.out.println("Введите четыре числа:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a;
        double b;
        double c;
        double d;

        System.out.println("Введите a: ");
        a =  Double.parseDouble(br.readLine().trim());
        System.out.println("Введите b: ");
        b =  Double.parseDouble(br.readLine().trim());
        System.out.println("Введите c: ");
        c =  Double.parseDouble(br.readLine().trim());
        System.out.println("Введите d: ");
        d =  Double.parseDouble(br.readLine().trim());
        System.out.println("Результат равен: " + calculationTask3(a, b, c, d));
    }

    private double calculationTask3(double a, double b, double c, double d) {
        double resalt = 0;
        resalt = (a * (b + (c / d)));
        return resalt;
    }

    public void task4() throws IOException {
        System.out.println("Введите два числа:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a;
        double b;

        System.out.println("Введите a: ");
        a =  Double.parseDouble(br.readLine().trim());
        System.out.println("Введите b: ");
        b =  Double.parseDouble(br.readLine().trim());

        if (isInRange(a, b)) {
            System.out.println("Сумма чисел 'a' и 'b' лежит в диапазоне от 10 до 20 включительно");
        }
        else {
            System.out.println("Сумма чисел 'a' и 'b' НЕ лежит в диапазоне от 10 до 20 включительно");
        }
    }
    private boolean isInRange(double a, double b) {
        if (((a+b) >= 10) && ((a+b) <= 20) ){
            return true;
        }
        else {
            return false;
        }
    }
    public void task5() throws IOException {
        System.out.println("Введите целое число:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        a = Integer.parseInt(br.readLine().trim());

    }
    private void isPositiv(int a) {
        if ( a >= 0) {
            System.out.println("Число'a'= " + a + " положительное");
        }
        else {
            System.out.println("Число 'a'= " + a +" отрицательное");
        }
    }

    public void task6() throws IOException {
        System.out.println("Введите целое число:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        a = Integer.parseInt(br.readLine().trim());

        if (isNegativ(a)) {
            System.out.println("Число'a'= " + a + " отрицательное");
        }
        else {
            System.out.println("Число 'a'= " + a +" положительное");
        }
    }
    private boolean isNegativ(int a) {
        if ( a < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public void task7() throws IOException {
        System.out.println("Введите имя:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        showGreeting(br.readLine().trim());
    }
    private void showGreeting(String name) {
        System.out.println("Привет, " +  name + "!"); //возможно в задании подразумевалось делать через String.concat()
    }

    public void task8() throws IOException {
        System.out.println("Введите год:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        a = Integer.parseInt(br.readLine().trim());

        isLY(a);

    }

    private void isLY(int a) {
        if (((a % 4) == 0) && ((a % 100 != 0))) {
            System.out.println("Год " + a + " високосный");
        }
        else {
            if (a % 400 == 0) {
                System.out.println("Год " + a + " високосный");
            }
            else {
                System.out.println("Год " + a + " НЕ високосный");
            }
        }
    }

}
