package initialise;

import model.Excercise;

public class Datainitialiser {
    public Excercise[] generator(int amount, char action) {
        Excercise[] excercises = new Excercise[amount];
        int i = 0;
        for (Excercise ex : excercises) {
            ex = new Excercise(i + 1, amount - i);
            ex.setTime(Math.round(5*i*Math.random()));
            ex.setAction(action);
            ex.setDone(Math.random() > 0.5 ? true : false);
            excercises[i] = ex;
            i++;
        }
        return excercises;
    }
}
