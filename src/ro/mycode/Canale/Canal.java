package ro.mycode.Canale;

import ro.mycode.Abonat.Abonat;

import java.util.ArrayList;

public interface Canal {

    void afisareAbonati();
    void addAbonat (Abonat a);
    void removeAbonat(Abonat a);
    void notificare();
    void upload(String text);
    String getNume();
    String getTitluVideo();
    int getNumarAbonati();
    ArrayList<Abonat> getAbonati();

}
