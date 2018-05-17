package logik;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public void showMenu() throws IOException {
        StringBuffer sb = new StringBuffer("Выберете задание:\n");
        sb.append("3. Написать метод вычисляющий выражение a * (b + (c / d)) \n " +
                "        и возвращающий результат,где a, b, c, d – входные параметры этого метода; \n");
        sb.append("4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит \n" +
                "        в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false; \n");
        sb.append("5. Написать метод, которому в качестве параметра передается целое число, \n" +
                "        метод должен напечатать в консоль положительное ли число передали, или отрицательное; \n" +
                "        Замечание: ноль считаем положительным числом. \n");
        sb.append("6. Написать метод, которому в качестве параметра передается целое число, \n" +
                "        метод должен вернуть true, если число отрицательное; \n");
        sb.append("7. Написать метод, которому в качестве параметра передается строка, \n" +
                "        обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»; \n");
        sb.append("8. Написать метод, который определяет является ли год високосным,\n" +
                "        и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный; \n");
        sb.append("9. Выход.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strMenuNubber = "";

        Task task = new Task();

        for (;;){
            System.out.println(sb);

            strMenuNubber = br.readLine();

            if (sayYes(strMenuNubber, "3")) {
                task.task3();
            }
            if (sayYes(strMenuNubber, "4")) {
            task.task4();
            }
            if (sayYes(strMenuNubber, "5")) {
                task.task5();
            }
            if (sayYes(strMenuNubber, "6")) {
            task.task6();
            }
            if (sayYes(strMenuNubber, "7")) {
            task.task7();
            }
            if (sayYes(strMenuNubber, "8")) {
                task.task8();
            }
            if (sayYes(strMenuNubber, "9")) {
                System.out.println("Работа завершена.");
                break;
            }
             if (sayYes(strMenuNubber, "0")) {
                 System.out.println("Неправильно выбрано задание! \n" + " Повторите");
                break;
            }
        }
    }

    private boolean sayYes (String strA, String strB){
        return trimmer(strA).equals(trimmer(strB));
    }

    private String trimmer (String text) {
        if (!text.isEmpty()) {
            text.trim().toLowerCase();
            return text;
        }
        else {
            System.out.println("Значение отсутствует");
        }

        return "0";
    }

}
