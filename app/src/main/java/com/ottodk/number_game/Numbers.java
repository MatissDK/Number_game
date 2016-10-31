package com.ottodk.number_game;


public class Numbers {

    private double number;

    public void setNumber(double number) {
        this.number = number;
    }

    /**
     * @return true if number it has square
     */

    public boolean SquareNumber() {
        long closestRoot = (long) Math.sqrt(number);
        return number == closestRoot * closestRoot;
    }


    /**
     * formula x = (n+1)/2
     *
     *
     * @return
     */

    public boolean calculateTriangule() {
        int i;
        if (number == 0) {
            return false;
        } else {
            for (i = 0; i <= number; i++) {
                if (number * 2 == (i + 1) * i) {
                    return true;
                }
            }
        }
        return false;
    }

}
