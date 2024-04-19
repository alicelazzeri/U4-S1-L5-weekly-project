package it.epicode.multiplayer;

public class RegistrazioneAudio extends ElementoMultimediale implements PuoEssereRiprodotto {
    // dichiarazione di una variabile interna di RegistrazioneAudio per definire la singola durata dell'audio, che sarà diversa da quella del video
    private int durata;

    private int volume;
    public RegistrazioneAudio(String titolo, int durataAudio) {
        super(titolo, durataAudio);
        this.durata = durataAudio;
    }

    @Override
    public void play() {
        System.out.println("Titolo della registrazione: " + getTitolo());
        System.out.println("Durata della registrazione: " + durata);
    }

    // overriding del metodo dichiarato all'interno dell'interfaccia PuoEssereRiprodotto, adattato al contesto specifico
    // di RegistrazioneAudio
}
