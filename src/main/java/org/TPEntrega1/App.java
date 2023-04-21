package org.TPEntrega1;

import org.TPEntrega1.Service.Service;
import org.TPEntrega1.Entidades.*;
import java.util.ArrayList;
import java.util.List;
public class App {
	
	
    public static void main( String[] args ){
    	
    	
    	List<Resultado>listaResultado = new ArrayList<Resultado>(); 
    	List<Pronostico>listaPronostico = new ArrayList<Pronostico>();
    	
        System.out.println("                      Resultado de los Partidos \n" );
        
        Service.ingresarArchivo(listaResultado,listaPronostico);
        Service.calcularPuntaje(listaResultado,listaPronostico);
    }
}
