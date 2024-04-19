package it.epicode.multiplayer;

public interface PuoEssereRiprodotto {
    void play();
}

// creazione di un'interfaccia apposita da implementare nelle classi RegistrazioneAudio e Video in quanto riproducibili
// l'interfaccia va a sostituire il metodo astratto play() che avevo dichiarato nella superclasse ElementoMultimediale,
// e che sarebbe stato applicato anche a Immagine, pur non essendo riproducibile, non avendo una durata