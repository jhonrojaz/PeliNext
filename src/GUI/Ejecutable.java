/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Pelicula;
import Clases.Serie;
import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ArrayList<Pelicula> p = new ArrayList<>();
        ArrayList<Serie> s = new ArrayList<>();

        p.add(new Pelicula());
        p.add(new Pelicula("La comunidad del anillo", "Peter Jackson"));
        p.add(new Pelicula("Warrior ", "Acción", "Gavin O'Connor", 134, 2011));
        p.add(new Pelicula("Sherlock", "Ficción", "Alfonso Cuarón", 89, 2010));
        p.add(new Pelicula("Aliados", "Romantica", "Robert Zemeckis", 126, 2016));

        s.add(new Serie());
        s.add(new Serie("The crown", "Peter Morgan"));
        s.add(new Serie("Grace and Frankie", "Martha Kauffman", "Comedia", 90, 3));
        s.add(new Serie("The Ranch", "Steve Thompkins", "Comedia", 85, 1));
        s.add(new Serie("Inspector Gadget", "Jean Chalopin", "Infantil", 30, 2));

        p.get(2).marcarVisto("52m 49s");
        p.get(3).marcarVisto("46m 25s");
        s.get(3).marcarVisto("98m 40s");
        s.get(4).marcarVisto("29m 06s");
        
        System.out.println("Pelicula Visualizadas\n");
        for (int i=0;i<=4;i++)
        { 
          if (!"00m 00s".equals(p.get(i).tiempoVisto()))
            {
              System.out.println(p.get(i).toString());
                                System.out.println("");
          }
        }
        
        System.out.println("Serie Visualizadas\n");
        for(int i=0;i<=4;i++)
        {
            if ("00m 00s".equals(s.get(i).tiempoVisto()))
            {
            } else {
                System.out.println(s.get(i).toString());
                System.out.println("");
            }
        }
        int indice=0;
        int mayor=0;
        for(int i=0;i<=4;i++)
        {
            if (s.get(i).getTemporadas()>mayor)
            {
                indice=i;
                mayor=s.get(i).getTemporadas();
            }
        }
        System.out.println("Serie con mas Temporadas:\n");
        System.out.println(s.get(indice).toString());
        
        indice=0;
        mayor=0;
        for(int i=0;i<=4;i++)
        {
            if (p.get(i).getAño()>mayor)
            {
                indice=i;
                mayor=p.get(i).getAño();
            }
        }
        System.out.println("\nPelicula mas Reciente:\n");
        System.out.println(p.get(indice).toString());
        
    }

}
