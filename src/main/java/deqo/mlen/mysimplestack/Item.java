package deqo.mlen.mysimplestack;

public class Item {
    private Integer valeur;

    public Item (){
    }

    public Item (Integer valeur){
        this.valeur=valeur;
    }

    public Integer getValeur(){
        return this.valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }
}
