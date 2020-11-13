
package it.unibas.ricettario.persistenza;

import it.unibas.ricettario.modello.Archivio;
import it.unibas.ricettario.modello.Costanti;
import it.unibas.ricettario.modello.Ingrediente;
import it.unibas.ricettario.modello.Pietanza;


public class DAOArchivioMock implements IDAOArchivio {
    @Override
    public Archivio carica(String nomeFile) throws DAOException {
        Archivio archivio = new Archivio();
        
        Pietanza antipastoCarne = new Pietanza("Antipasto carne normale ",11.0,Costanti.ANTIPASTO);
        antipastoCarne.aggiungiIngrediente(new Ingrediente("Bruschetta",50,true,95));
        antipastoCarne.aggiungiIngrediente(new Ingrediente("Mozzarella",67,true,69));
        antipastoCarne.aggiungiIngrediente(new Ingrediente("Prosciutto",90,true,54));
        archivio.aggiungiPietanza(antipastoCarne);
        
        Pietanza pastaAlforno = new Pietanza("Pasta al forno ", 28.0, Costanti.PRIMO);
        pastaAlforno.aggiungiIngrediente(new Ingrediente("Sfoglie ", 89, false, 100));
        pastaAlforno.aggiungiIngrediente(new Ingrediente(" Sugo ", 45, true, 77));
        pastaAlforno.aggiungiIngrediente(new Ingrediente(" Macinato ", 30, false, 100));
        archivio.aggiungiPietanza(pastaAlforno);
        
        Pietanza pastaPanna = new Pietanza("Pasta con la panna ", 16.0, Costanti.PRIMO);
        pastaAlforno.aggiungiIngrediente(new Ingrediente("penne ", 23, true, 21));
        pastaAlforno.aggiungiIngrediente(new Ingrediente(" Panna ", 32, true, 99));
        archivio.aggiungiPietanza(pastaPanna);
        
        Pietanza bistecca = new Pietanza("Bistecca",18.0,Costanti.SECONDO);
        bistecca.aggiungiIngrediente(new Ingrediente("Carne",34,false,87));
        archivio.aggiungiPietanza(bistecca);
        
        Pietanza gelato = new Pietanza("Gelato",7.0,Costanti.DESSERT);
        gelato.aggiungiIngrediente(new Ingrediente("gelato al caffe'", 90, true,100));
        archivio.aggiungiPietanza(gelato);
        
        
        return archivio;
    }
    
}
