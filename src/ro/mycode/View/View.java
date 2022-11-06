package ro.mycode.View;

import ro.mycode.Abonat.Abonat;
import ro.mycode.Abonat.Abonati;
import ro.mycode.Canale.Canal;
import ro.mycode.Canale.Canal1;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private Canal canal;
    private Scanner scanner;

    public View (Canal canal){
        this.canal = canal;
        scanner = new Scanner(System.in);
    }

    public void menu(){
        System.out.println("Apasa 1 pentru a afisa abonatii");
        System.out.println("Apasa 2 pentru a afisa numarul de abonati");
        System.out.println("Apasa 3 pentru a uploada un video");

    }

    public void run() {
        boolean run = true;
        menu();
        while (run){
            int buton = Integer.parseInt(scanner.nextLine());
            switch (buton) {
                case 1:
                    canal.afisareAbonati();
                    break;
                case 2:
                    System.out.println(canal.getNumarAbonati() + " abonati");
                    break;
                case 3:
                    upload();
                    break;
            }
        }
    }

    public void upload() {
        System.out.println("Numele video-ului: ");
        String nume = scanner.nextLine();
        canal.upload(nume);
        System.out.println("Ai adaugat un video cu succesc!!");
        System.out.println();
        menu();
    }
}
