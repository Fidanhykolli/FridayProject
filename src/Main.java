import java.util.Scanner;


class Multimediale {
    protected String titolo;
    protected int durata;


    public Multimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }


    public void play() {
        System.out.println("Riproduzione di " + titolo);
    }
}


