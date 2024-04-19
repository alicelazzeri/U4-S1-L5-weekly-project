package it.epicode.multiplayer;

public abstract class ElementoMultimediale {
    private String titolo;
    private int durata;

    // Creazione di un primo costruttore con cui definire i parametri da istanziare
    // in RegistrazioneAudio e Video, che richiedono sia il titolo che la durata

    public ElementoMultimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    // Creazione di un secondo costruttore con cui definire il parametro da istanziare
    // in Immagine, che riceve solo titolo come parametro

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    // Creazione dei metodi getter e setter per l'accesso ristretto ai dati delle variabili private della classe

    // Metodi getter

    public String getTitolo() {
        return titolo;
    }
    public int getDurata() {
        return durata;
    }

    // Metodi setter

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    // Verifica del valore positivo della durata

    public void setDurata(int durata) {
        if (durata > 0) {
            this.durata = durata;
        } else {
            System.out.println("La durata inserita non è valida. Inserisci un valore positivo");
        }
    }


}
