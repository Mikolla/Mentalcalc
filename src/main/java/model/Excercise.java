package model;

import java.util.Arrays;

public class Excercise implements Comparable<Excercise>{
    int firstNumb;
    int secondNumb;
    long time;
    char action;
    boolean isDone;

    public Excercise(int firstNumb, int secondNumb) {
        this.firstNumb = firstNumb;
        this.secondNumb = secondNumb;
    }

    public Excercise(int firstNumb, int secondNumb, long time, char action, boolean isDone) {
        this.firstNumb = firstNumb;
        this.secondNumb = secondNumb;
        this.time = time;
        this.action = action;
        this.isDone = isDone;
    }

    public int getFirstNumb() {
        return firstNumb;
    }

    public void setFirstNumb(int firstNumb) {
        this.firstNumb = firstNumb;
    }

    public int getSecondNumb() {
        return secondNumb;
    }

    public void setSecondNumb(int secondNumb) {
        this.secondNumb = secondNumb;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public char getAction() {
        return action;
    }

    public void setAction(char action) {
        this.action = action;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "firstNumb = " + firstNumb + " secondNumb = " + secondNumb + " time = " + time + " action = " + action + " isDone = " + isDone;
    }


    public int compareTo(Excercise ex) {
        int exDonecompare;
        if (this.isDone == true && ex.isDone == false) {
            exDonecompare = -1;
        } else if (this.isDone == false && ex.isDone == true) {
            exDonecompare = 1;
        } else exDonecompare = 0;


        if (exDonecompare!= 0) {
            return exDonecompare;
        } else {
            int timeCompare;
            if (this.time > ex.getTime()) {
                return  -1;
            } else if (this.time < ex.getTime()) {
                return   1;
            } else
            return 0;
        }
    }




    public static void main(String[] args) {
        Excercise[] excercises = new Excercise[9];
        int i = 0;
        for (Excercise ex : excercises) {
              ex = new Excercise(i, 10 - i);
              ex.setTime(Math.round(5*i*Math.random()));
              ex.setDone(Math.random() > 0.5 ? true : false);
              excercises[i] = ex;
              i++;
        }

        Arrays.sort(excercises);

       for (Excercise ex : excercises) {
            System.out.println(ex);
        }

    }


}


