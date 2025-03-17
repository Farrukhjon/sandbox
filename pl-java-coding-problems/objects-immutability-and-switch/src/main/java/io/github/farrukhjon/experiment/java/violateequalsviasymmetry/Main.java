package io.github.farrukhjon.experiment.java.violateequalsviasymmetry;

public class Main {

    public static void main(String[] args) {

        // bad
        io.github.farrukhjon.experiment.java.violateequalsviasymmetry.bad.Vehicle vBad =
            new io.github.farrukhjon.experiment.java.violateequalsviasymmetry.bad.Vehicle("air", 1967);
        io.github.farrukhjon.experiment.java.violateequalsviasymmetry.bad.JumpJet jjBad =
            new io.github.farrukhjon.experiment.java.violateequalsviasymmetry.bad.JumpJet("air", 1967, "Harrier");

        System.out.println("jjBad equal vBad: " + jjBad.equals(vBad));
        System.out.println("vBad equal jjBad: " + vBad.equals(jjBad));

        System.out.println();

        // good
        io.github.farrukhjon.experiment.java.violateequalsviasymmetry.good.Vehicle vGood =
            new io.github.farrukhjon.experiment.java.violateequalsviasymmetry.good.Vehicle("air", 1967);
        io.github.farrukhjon.experiment.java.violateequalsviasymmetry.good.JumpJet jjGood =
            new io.github.farrukhjon.experiment.java.violateequalsviasymmetry.good.JumpJet("air", 1967, "Harrier");

        System.out.println("jjGood equal vGood: " + jjGood.equals(vGood));
        System.out.println("vGood equal jjGood: " + vGood.equals(jjGood));
    }

}
