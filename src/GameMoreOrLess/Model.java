package GameMoreOrLess;

import java.util.ArrayList;
import java.util.List;

public class Model {
    int BASE_MAX_VALUE = 10;
    int BASE_MIN_VALUE = 0;

    private int maxValue = BASE_MAX_VALUE;
    private int minValue = BASE_MIN_VALUE;
    private int randomValue;
    private List<Integer> yourHistory = new ArrayList<Integer>();

    public void setRandomValue () {
        randomValue = (int) Math.ceil(Math.random()*(maxValue-minValue-1) + minValue);
    }

    public boolean checkValue(int userValue) {
        yourHistory.add(userValue);
        if (userValue == randomValue) {
            return true;
        } else if (userValue > randomValue) {
            maxValue = userValue - 1;
            return false;
        } else {
            minValue = userValue + 1;
            return false;
        }
    }

    public void setBaseValue (int maxValue, int minValue){
    this.maxValue = maxValue;
    this.minValue = minValue;
    }
    public int getRandomValue() {
        return randomValue;
    }
    public int getMaxValue() {
        return maxValue;
    }
    public int getMinValue() {
        return minValue;
    }
    public List<Integer> getYourHistory() {
        return yourHistory;
    }
}


