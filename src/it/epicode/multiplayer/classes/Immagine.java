package it.epicode.multiplayer.classes;

import it.epicode.multiplayer.interfaces.PuoEssereRiprodotto;
import it.epicode.multiplayer.interfaces.RegolaLuminosita;

public class Immagine extends ElementoMultimediale implements RegolaLuminosita, PuoEssereRiprodotto {
    private int luminosita;
    public Immagine(String titolo, int luminosita) {
        // dalla classe astratta ElementoMultimediale per Immagine è necessario solo il titolo, non essendo prevista una durata per l'immagine
        super(titolo);
        this.luminosita = luminosita;
    }

    // Getter e setter per la variabile luminosità

    public int getLuminosita() {
        return luminosita;
    }

    // Verifica del valore positivo della luminosità

    public void setLuminosita(int luminosita) {
        if (luminosita > 0) {
            this.luminosita = luminosita;
        } else {
            System.out.println("La luminosità inserita non è valida. Inserisci un valore positivo");
        }
    }

    // Overriding dei metodi per gestire la modifica della luminosità implementati con l'interfaccia RegolaLuminosita, adattati al contesto specifico
    // di Video

    @Override
    public void alzaLuminosita() {
        luminosita++;
    }

    @Override
    public void abbassaLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }


    // Creazione di un metodo proprio di Immagine per stampare a schermo il titolo dell'immagine e in seguito
    // per la gestione della luminosità

    public void show() {
        System.out.println("Titolo dell'immagine: " + getTitolo());

        // Ripetizione della stringa concatenata per il valore della luminosità

        for (int i = 0; i < luminosita; i++) {
            String ripetizioneAsterischi = "*".repeat(luminosita); // asterischi ripetuti per il valore della luminosità
            System.out.println(getTitolo() + ripetizioneAsterischi);
        }

    }

    // dato che abbiamo a che fare in ogni caso con degli oggetti multimediali, viene importata anche l'interfaccia
    // PuoEssereRiprodotto e in questo caso viene differenziata rispetto alle occorrenze di RegistrazioneAudio e Video
    // modificandone le istruzioni con la funzione show(), propria di Immagine

    @Override
    public void play() {
        show();
    }



}
