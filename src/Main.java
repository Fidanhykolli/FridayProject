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
}class RegistrazioneAudio extends Multimediale {
    private int volume;


    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }


    public void alzaVolume() {
        volume++;
        System.out.println("Volume aumentato a " + volume);
    }


    public void abbassaVolume() {
        volume--;
        System.out.println("Volume diminuito a " + volume);
    }
}


class Video extends Multimediale {
    private int volume;
    private int luminosita;


    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }


    public void alzaVolume() {
        volume++;
        System.out.println("Volume aumentato a " + volume);
    }


    public void abbassaVolume() {
        volume--;
        System.out.println("Volume diminuito a " + volume);
    }


    public void aumentaLuminosita() {
        luminosita++;
        System.out.println("Luminosita aumentata a " + luminosita);
    }


    public void diminuisciLuminosita() {
        luminosita--;
        System.out.println("Luminosita diminuita a " + luminosita);
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci il titolo:");
        String titolo = scanner.nextLine();
        System.out.println("Inserisci la durata:");
        int durata = scanner.nextInt();


        Multimediale multimediale;


        System.out.println("Seleziona il tipo di multimediale (1 - Registrazione Audio, 2 - Video):");
        int scelta = scanner.nextInt();


        if (scelta == 1) {
            System.out.println("Inserisci il volume:");
            int volume = scanner.nextInt();
            multimediale = new RegistrazioneAudio(titolo, durata, volume);
        } else {
            System.out.println("Inserisci il volume adatto a te:");
            int volume = scanner.nextInt();
            System.out.println("Inserisci la luminosita che preferisci:");
            int luminosita = scanner.nextInt();
            multimediale = new Video(titolo, durata, volume, luminosita);
        }


        multimediale.play();


        if (multimediale instanceof RegistrazioneAudio) {
            RegistrazioneAudio audio = (RegistrazioneAudio) multimediale;
            System.out.println("Premi 1 per alzare il volume oppure premi 2 per abbassare il volume:");
            int azione = scanner.nextInt();
            if (azione == 1) {
                audio.alzaVolume();
            } else if (azione == 2) {
                audio.abbassaVolume();
            }
        } else if (multimediale instanceof Video) {
            Video video = (Video) multimediale;
            System.out.println("Premi 1 se vuoi alzare il volume, premi 2 se vuoi abbassare il volume, premi 3 se vuoi aumentare la luminosita, premi 4 se vuoi diminuire la luminosita:");

            int azione = scanner.nextInt();
            if (azione == 1) {
                video.alzaVolume();
            } else if (azione == 2) {
                video.abbassaVolume();
            } else if (azione == 3) {
                video.aumentaLuminosita();
            } else if (azione == 4) {
                video.diminuisciLuminosita();
            }
        }
        scanner.close();
    }
}


