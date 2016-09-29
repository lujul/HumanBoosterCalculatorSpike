package com.androidand.humanboostercalculatorspike.business;

/**
 * Created by Human Booster on 28/09/2016.
 */

public class   Palimdrome {
    public String mot;

    public String reve(String mot) {
        String motRetourne;
        StringBuffer motBuffer = new StringBuffer(mot);
        motRetourne = motBuffer.reverse().toString();
        return motRetourne;
    }

    public Boolean isPalimdrome(String mot) {
        Boolean result = true;
        int size = mot.length();
        for (int i = 0; i < size / 2; i++) {
            if (mot.charAt(i) != mot.charAt(size - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }
}
