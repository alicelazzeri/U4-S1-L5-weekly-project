package it.epicode.multiplayer;

public class Video extends ElementoMultimediale implements PuoEssereRiprodotto {
    // dichiarazione di una variabile interna di Video per definire la singola durata del video, che sarà diversa da quella dell'audio
    private int durata;

    public Video (String titolo, int durataVideo) {
        super(titolo, durataVideo);
        this.durata = durataVideo;
    }

    @Override
    public void play() {
        System.out.println("Titolo del video: " + getTitolo());
        System.out.println("Durata del video: " + durata);
    }
    // overriding del metodo dichiarato all'interno dell'interfaccia PuoEssereRiprodotto, adattato al contesto specifico
    // di Video
}
