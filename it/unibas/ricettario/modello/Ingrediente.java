
package it.unibas.ricettario.modello;


public class Ingrediente {
    private String nome;
    private int quantita;
    private boolean allergene;
    private int Kcal100gr;

    public Ingrediente(String nome, int quantita, boolean allergene, int Kcal100gr) {
        this.nome = nome;
        this.quantita = quantita;
        this.allergene = allergene;
        this.Kcal100gr = Kcal100gr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public boolean isAllergene() {
        return allergene;
    }

    public void setAllergene(boolean allergene) {
        this.allergene = allergene;
    }

    public int getKcal100gr() {
        return Kcal100gr;
    }

    public void setKcal100gr(int Kcal100gr) {
        this.Kcal100gr = Kcal100gr;
    }
    public double getKcal(){
        return this.quantita* this.Kcal100gr/100.0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ingrediente: ").append(nome);
        sb.append(", quantita: ").append(quantita);
        sb.append(", allergene: ").append(allergene);
        sb.append(", Kcal100gr: ").append(Kcal100gr);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
