package de.pdark.tutorial.hotfix.branch2_commit1;

public class UIAmount {

    public static long toUI(double amount) {
        double roundingFix = Math.signum(amount) >= 0 ? .5 : -.5;
        return (long)(amount*100 + roundingFix);
    }

}
