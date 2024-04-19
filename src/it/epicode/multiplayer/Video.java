package it.epicode.multiplayer;

public class Video extends ElementoMultimediale implements PuoEssereRiprodotto, RegolaVolume, RegolaLuminosita {

    // Dichiarazione di una variabile interna di Video per definire la singola durata del video, che sarà diversa da quella dell'audio

    private int durata;
    private int volume;
    private int luminosita;

    // Getter e setter per la variabile volume

    public int getVolume() {
        return volume;
    }

    // Verifica del valore positivo del volume

    public void setVolume(int volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            System.out.println("Il volume inserito non è valido. Inserisci un valore positivo");
        }
    }

    public Video(String titolo, int durataVideo, int volume, int luminosita) {
        super(titolo, durataVideo);
        this.durata = durataVideo;
        this.volume = volume;
        this.luminosita = this.luminosita;
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

    // Overriding dei metodi per gestire la modifica del volume implementati con l'interfaccia RegolaVolume, adattati al contesto specifico
    // di Video

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
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

    @Override
    public void play() {
        System.out.println("Titolo del video: " + getTitolo());
        System.out.println("Durata del video: " + durata);

        // Ripetizione della stringa concatenata per il valore della durata

        for (int i = 0; i < durata; i++) {
            String ripetizioneEsclamativi = "!".repeat(volume); // esclamativi ripetuti per il valore del volume
            String ripetizioneAsterischi = "*".repeat(luminosita); // asterischi ripetuti per il valore della luminosità
            System.out.println(getTitolo() + ripetizioneEsclamativi + ripetizioneAsterischi);
        }

    }
}
