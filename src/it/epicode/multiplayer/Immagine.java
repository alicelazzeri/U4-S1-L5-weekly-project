package it.epicode.multiplayer;

public class Immagine extends ElementoMultimediale {
    public Immagine(String titolo) {
        // dalla classe astratta ElementoMultimediale per Immagine è necessario solo il titolo, non essendo prevista una durata per l'immagine
        super(titolo);
    }


    public void mostraImmagine() {
        System.out.println("Titolo dell'immagine: " + getTitolo());
    }

    // creazione di un metodo proprio di Immagine per stampare a schermo il titolo dell'immagine, svincolata dal metodo
    // play(), più coerente con la riproducibilità di RegistrazioneAudio e Video
}
