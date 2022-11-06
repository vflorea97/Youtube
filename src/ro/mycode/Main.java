package ro.mycode;

import ro.mycode.Abonat.Abonat;
import ro.mycode.Abonat.Abonati;
import ro.mycode.Canale.Canal1;
import ro.mycode.View.View;

public class Main {

    public static void main(String[] args) {
        Abonati abonat = new Abonati("Mihai97","pocpoc",null,"");
        Abonati abonat2 = new Abonati("MariusMarius","copac",null,"");

        Canal1 canal1 = new Canal1("RacingCars");
        canal1.addAbonat(abonat);
        canal1.addAbonat(abonat2);

        abonat.abonareCanal(canal1);
        abonat2.abonareCanal(canal1);


        View view = new View(canal1);
        view.run();
    }
}
