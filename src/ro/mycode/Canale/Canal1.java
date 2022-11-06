package ro.mycode.Canale;

import ro.mycode.Abonat.Abonat;

import java.util.ArrayList;

public class Canal1 implements Canal{

    private ArrayList<Abonat> abonati = new ArrayList<>();
    private String nume;
    private String titluVideo;
    private int numarAbonati;

    public Canal1(String nume) {
        this.nume = nume;
    }

    @Override
    public void afisareAbonati(){
        for (int i = 0; i < abonati.size(); i++){
            abonati.get(i).afisare();
        }
    }

    @Override
    public void addAbonat(Abonat a) {
        this.abonati.add(a);
        numarAbonati++;

    }

    @Override
    public void removeAbonat(Abonat a) {
        int poz = abonati.indexOf(a);
        if (poz != -1){
            this.abonati.remove(poz);
        }
        numarAbonati--;

    }

    @Override
    public void notificare() {
        for (Abonat abonat: abonati){
            abonat.update();
        }

    }

    @Override
    public void upload(String text) {
        this.titluVideo = text;
        notificare();

    }

    @Override
    public ArrayList<Abonat> getAbonati() {
        return abonati;
    }

    public void setAbonati(ArrayList<Abonat> abonati) {
        this.abonati = abonati;
    }

    @Override
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String getTitluVideo() {
        return titluVideo;
    }

    @Override
    public int getNumarAbonati() {
        return numarAbonati;
    }

    public void setTitluVideo(String titluVideo) {
        this.titluVideo = titluVideo;
    }

}
