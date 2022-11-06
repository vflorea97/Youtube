package ro.mycode.Abonat;

import ro.mycode.Canale.Canal;

public interface Abonat {

    void afisare();
    void update();
    void abonareCanal(Canal c);
    void dezabonareCanal(Canal c);
}
