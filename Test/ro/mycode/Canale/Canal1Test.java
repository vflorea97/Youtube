package ro.mycode.Canale;

import org.junit.jupiter.api.Test;
import ro.mycode.Abonat.Abonati;

import static org.junit.jupiter.api.Assertions.*;

class Canal1Test {

    @Test
    void afisareAbonati() {
        Abonati abonat = new Abonati("Mihai97","pocpoc",null,"");
        Abonati abonat2 = new Abonati("MariusMarius","copac",null,"");

        Canal canal = new Canal1("Canal");
        abonat.abonareCanal(canal);
        abonat2.abonareCanal(canal);

        canal.addAbonat(abonat);
        canal.addAbonat(abonat2);

        canal.afisareAbonati();
    }

    @Test
    void addAbonat() {
        Abonati abonat = new Abonati("Mihai97","pocpoc",null,"");
        Abonati abonat2 = new Abonati("MariusMarius","copac",null,"");

        Canal canal = new Canal1("Canal");
        canal.addAbonat(abonat);
        canal.addAbonat(abonat2);

        assertEquals(abonat,canal.getAbonati().get(0));
    }

    @Test
    void removeAbonat() {
        Abonati abonat = new Abonati("Mihai97","pocpoc",null,"");
        Abonati abonat2 = new Abonati("MariusMarius","copac",null,"");

        Canal canal = new Canal1("Canal");
        abonat.abonareCanal(canal);
        abonat2.abonareCanal(canal);
        canal.addAbonat(abonat);
        canal.addAbonat(abonat2);

        canal.removeAbonat(abonat);

        assertEquals(1,canal.getAbonati().size());
    }

    @Test
    void notificare() {
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
    void upload() {
        Abonati abonat = new Abonati("Mihai97","pocpoc",null,"");
        Abonati abonat2 = new Abonati("MariusMarius","copac",null,"");

        Canal canal = new Canal1("Canal");
        abonat.abonareCanal(canal);
        canal.upload("PacPac");

        System.out.println(canal.getTitluVideo());

    }
}