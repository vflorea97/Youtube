package ro.mycode.Abonat;

import ro.mycode.Canale.Canal;

public class Abonati implements Abonat {

    private String userName;
    private String password;
    private Canal canal;
    private String notificare;

    public Abonati(String userName, String password, Canal canal, String notificare) {
        this.userName = userName;
        this.password = password;
        this.canal = canal;
        this.notificare = notificare;
    }

    @Override
    public String toString() {
        String text = "";
        text += "Username: " + this.userName + "\n";
        text += "Canal: " + this.canal.getNume() + "\n";
        text += "Notificare: " + this.notificare + "\n";
        return text;
    }
    @Override
    public void afisare() {
        System.out.println(this);
    }

    @Override
    public void update() {
        System.out.println(this.canal.getNume() + " a posta un nou clip: " + this.canal.getTitluVideo());
        this.notificare= this.canal.getTitluVideo();

    }

    @Override
    public void abonareCanal(Canal c) {
        this.canal = c;

    }

    @Override
    public void dezabonareCanal(Canal c) {
        this.canal = null;

    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }
}
