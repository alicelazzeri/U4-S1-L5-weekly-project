package it.epicode.multiplayer;

public class RegistrazioneAudio extends ElementoMultimediale implements PuoEssereRiprodotto, RegolaVolume  {

    // Dichiarazione di una variabile interna di RegistrazioneAudio per definire la singola durata dell'audio, che sarà diversa da quella del video

    private int durata;
    private int volume;

    // Getter e setter per la variabile volume

    public int getVolume() {
        return volume;
    }

    // Verifica del valore positivo del volume

    public void setVolume(int volume) {
        if(volume > 0) {
            this.volume = volume;
        } else {
            System.out.println("Il volume inserito non è valido. Inserisci un valore positivo");
        }
    }

    // Costruttore di RegistrazioneAudio che riprende i parametri definiti in ElementoMultimediale

    public RegistrazioneAudio(String titolo, int durataAudio, int volume) {
        super(titolo, durataAudio);
        this.durata = durataAudio;
        this.volume = volume;
    }

    // Overriding dei metodi per gestire la modifica del volume implementati con l'interfaccia RegolaVolume, adattati al contesto specifico
    // di RegistrazioneAudio

    @Override
    public void alzaVolume() {
         volume++;
    }

    @Override
    public void abbassaVolume() {
        if(volume > 0) {
            volume--;
        }
    }

    // Overriding del metodo dichiarato all'interno dell'interfaccia PuoEssereRiprodotto, adattato al contesto specifico
    // di RegistrazioneAudio

    @Override
    public void play() {
        System.out.println("Titolo della registrazione: " + getTitolo());
        System.out.println("Durata della registrazione: " + durata + " minuti");

        // Ripetizione della stringa concatenata per il valore della durata

        for (int i = 0; i < durata; i++) {
            String ripetizioneEsclamativi = "!".repeat(volume); // esclamativi ripetuti per il valore del volume
            System.out.println(getTitolo()+ ripetizioneEsclamativi);
        }
    }


}
