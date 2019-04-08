package operations;

import model.Excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Multiplication {

    private Excercise[] excercises;

    public Multiplication(Excercise[] excercises) {
        this.excercises = excercises;
    }

    public int[] answerGenerator(int answer){
        int[] answers = new int[5];
        if(answer > 20) {
            answers[0] = answer - 10;
            answers[1] = answer + 10;
            answers[2] = answer;
            answers[3] = answer + 3;
            answers[4] = answer - 2;
        }

        List answerList = new ArrayList<Integer>();
        for (int v : answers) {
            answerList.add(v);
        }
        Collections.shuffle(answerList);
        System.out.println(answerList.size() + " - размер");
        for (int i = 0; i < answerList.size(); i++) {
            System.out.println(answerList.get(i) + " " + i);
        }
        answer = answerList.toArray();
        return answers;
    }
    public void operate() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (Excercise ex : excercises) {
            int one = ex.getFirstNumb();
            int two = ex.getSecondNumb();
            int result = one * two;
            int desided = 0;
            do {
                System.out.print(one + " " + ex.getAction() + " " + two + " = " +result + " ");
                try {
                    desided = Integer.parseInt(reader.readLine());
                    if (desided == result) {
                        System.out.println("Верно!");
                    } else {
                        System.out.println("Неверно, еще раз!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Пока не решишь!");
                } catch (IOException ee) {
                    System.out.println("Какая-то лабуда");
                }
            } while (desided != result);
        }
    }


}
