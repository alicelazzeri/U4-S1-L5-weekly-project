import it.epicode.multiplayer.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // importazione dello scanner per ricevere input

        Scanner scanner = new Scanner(System.in);

        // inizializzazione dell'array di tipo ElementoMultimediale

        ElementoMultimediale[] multimedia = new ElementoMultimediale[5];

        for (int i = 0; i < multimedia.length; i++) {
            System.out.println("Inserisci il tipo di elemento (Immagine, Audio o Video): ");
            String tipoElemento = scanner.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            int durata = 0;
            int volume = 0;

            // Se il tipo specificato è un'immagine, non deve chiedere durata e volume
            // quindi se la stringa inserita è qualcosa che non è "immagine", può chiedere durata e volume

            if (!tipoElemento.equalsIgnoreCase("immagine")) {
                System.out.println("Inserisci la durata: ");
                durata = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Inserisci il volume: ");
                volume = scanner.nextInt();
                scanner.nextLine();
            }

            // Per video o immagine deve chiedere la luminosità

            int luminosita = 0;
            if (tipoElemento.equalsIgnoreCase("video") || tipoElemento.equalsIgnoreCase("immagine")) {
                System.out.println("Inserisci la luminosita: ");
                luminosita = scanner.nextInt();
                scanner.nextLine();
            }

            // a seconda dell'input ricevuto nel terminale dal comando di riga 14, questo viene convertito in minuscole e rimanda
            // al tipo di oggetto adeguato con le caratteristiche adeguate

            switch (tipoElemento.toLowerCase()) {
                case "immagine":
                    multimedia[i] = new Immagine(titolo, luminosita);
                    break;
                case "audio":
                    multimedia[i] = new RegistrazioneAudio(titolo, durata, volume);
                    break;
                case "video":
                    multimedia[i] = new Video(titolo, durata, volume, luminosita);
                    break;
                default:
                    System.out.println("Tipo di elemento non riconosciuto.");
                    break;
            }
        }

        // Inizializzazione della scelta dell'oggetto a valore negativo, così che non coinvolga i valori a partire da 0

        int scelta = -1;

        while (scelta != 0) {
            System.out.println("Inserisci un numero da 1 a 5 per eseguire un oggetto multimediale, oppure 0 per uscire:");
            scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta == 0) {
                System.out.println("Uscita dal programma.");
                break;
            }

            if (scelta < 1 || scelta > 5) {
                System.out.println("Scelta non valida. Riprova.");
                continue;
            }

            if (multimedia[scelta - 1] instanceof PuoEssereRiprodotto) {
                ((PuoEssereRiprodotto) multimedia[scelta - 1]).play();
            } else if (multimedia[scelta - 1] instanceof Immagine) {
                ((Immagine) multimedia[scelta - 1]).show();
            } else {
                System.out.println("Elemento non eseguibile.");
            }
        }

    }
}

