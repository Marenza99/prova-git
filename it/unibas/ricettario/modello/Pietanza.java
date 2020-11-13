
package it.unibas.ricettario.modello;

import java.util.ArrayList;
import java.util.List;


public class Pietanza {
    private String nome;
    private double costo;
    private String categoria;
    private List<Ingrediente> listaIngredienti = new ArrayList<Ingrediente>();

    public Pietanza(String nome, double costo, String categoria) {
        this.nome = nome;
        this.costo = costo;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String prova(){
        return "Prova-git";
    }



    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Ingrediente> getListaIngredienti() {
        return listaIngredienti;
    }

    public void setListaIngredienti(List<Ingrediente> listaIngredienti) {
        this.listaIngredienti = listaIngredienti;
    }

    public void aggiungiIngrediente(Ingrediente ingrediente) {
        this.listaIngredienti.add(ingrediente);
    }
    
    public double getKcal(){
        double somma = 0.0;
        for (Ingrediente ingrediente : listaIngredienti) {
            somma += ingrediente.getKcal();
            
        }
        return somma;
    }
    
    public Boolean contieneAllergeni(){
        for (Ingrediente ingrediente : listaIngredienti) {
            if(ingrediente.isAllergene()){
                return true;
            }
            
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pietanza: ").append(nome);
        sb.append(", costo: ").append(costo);
        sb.append(", categoria: ").append(categoria);
        sb.append(", listaIngredienti: ").append(listaIngredienti);
        sb.append('}');
        return sb.toString();
    }
    
    
    
   
}
