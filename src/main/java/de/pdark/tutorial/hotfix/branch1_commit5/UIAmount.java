package de.pdark.tutorial.hotfix.branch1_commit5;

public class UIAmount {

    public static long toUI(double amount) {
        double roundingFix = Math.signum(amount) >= 0 ? .5 : -.5;
        return (long)(amount*100 + roundingFix);
    }

}
