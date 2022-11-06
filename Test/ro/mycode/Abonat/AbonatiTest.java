package ro.mycode.Abonat;

import org.junit.jupiter.api.Test;
import ro.mycode.Canale.Canal;
import ro.mycode.Canale.Canal1;

import static org.junit.jupiter.api.Assertions.*;

class AbonatiTest {

    @Test
    void afisare() {
        Abonati abonat = new Abonati("Mihai97","pocpoc",null,"");
        Abonati abonat2 = new Abonati("MariusMarius","copac",null,"");

        Canal canal = new Canal1("Canal");
        abonat.abonareCanal(canal);

        abonat.afisare();
    }

    @Test
    void update() {
        Abonati abonat = new Abonati("Mihai97","pocpoc",null,"");
        Abonati abonat2 = new Abonati("MariusMarius","copac",null,"");

        Canal canal = new Canal1("Canal");
        abonat.abonareCanal(canal);
        canal.upload("PacPac");

        abonat.update();
        System.out.println();
        abonat.afisare();
    }

    @Test
    void abonareCanal() {
        Abonati abonat = new Abonati("Mihai97","pocpoc",null,"");

        Canal canal = new Canal1("Canal");
        abonat.abonareCanal(canal);

        abonat.afisare();
    }

    @Test
    void dezabonareCanal() {
        Abonati abonat = new Abonati("Mihai97","pocpoc",null,"");

        Canal canal = new Canal1("Canal");
        abonat.abonareCanal(canal);

        abonat.afisare();

        abonat.dezabonareCanal(canal);

        assertEquals(null,abonat.getCanal());
    }
}