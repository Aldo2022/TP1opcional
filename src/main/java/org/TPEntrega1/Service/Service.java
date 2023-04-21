package org.TPEntrega1.Service;

import java.io.FileReader;
import java.io.IOException;
import org.TPEntrega1.Entidades.Pronostico;
import org.TPEntrega1.Entidades.Resultado;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import com.opencsv.bean.*;

public class Service {
	Resultado resultado = new Resultado();

     public static void ingresarArchivo(List<Resultado> listaResultado,List<Pronostico>listaPronostico) {
	
		// Definimos los nombres de los archivos CSV que queremos leer. 
		// Estos nombres pueden ser proporcionados como argumentos de línea de comandos.
		String archivoResultado = "E:\\ARG_PRO_GIT\\JavaBasico\\TPEntrega1\\src\\resources\\resultado.csv";
		String archivoPronostico = "E:\\ARG_PRO_GIT\\JavaBasico\\TPEntrega1\\src\\resources\\pronostico.csv";

		BufferedReader brAR = null;
		BufferedReader brAP = null;
		String linea = "";
		String separadorCSV = ",";
		
//Ingreso datos Resultado		
		try {
			brAR = new BufferedReader(new FileReader(archivoResultado));
			
			brAR.readLine();
			while((linea = brAR.readLine()) != null){
				String [] datosR = linea.split(separadorCSV);
				
				Resultado resultado = new Resultado(datosR[0],datosR[1],datosR[2],datosR[3]);
				listaResultado.add(resultado);
				
				System.out.println(datosR[0]+"     "+datosR[1]+"   --    "+datosR[2]+"     "+datosR[3]);
				System.out.println();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(brAR !=null) {
				try{
					brAR.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("                        Resultado de todo los Pronosticos\n");
//Ingreso datos Pronostico		
		try {
			brAP = new BufferedReader(new FileReader(archivoPronostico));
			
			brAP.readLine();
			while ((linea = brAP.readLine())!=null) {
				String [] datosP = linea.split(separadorCSV);
				
				Pronostico pronostico = new Pronostico(datosP[0],datosP[1],datosP[2],datosP[3],datosP[4]);
				listaPronostico.add(pronostico);
				
				System.out.println(datosP[0]+"  "+datosP[1]+"  "+datosP[2]+"  "+datosP[3]+"  "+datosP[4]);
				System.out.println();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(brAP !=null) {
				try {
					brAP.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void calcularPuntaje(List<Resultado> listaResultado,List<Pronostico>listaPronostico) {
	
		Integer punto=0;

		int partido=0;
		
		System.out.println("\nComparando el Pronostico con los Resultados\n");
		for (Resultado resultado : listaResultado) {
			partido++;
			
			for (Pronostico pronostico : listaPronostico) {
				if(resultado.getEquipo1().equalsIgnoreCase(pronostico.getEquipo1()) && resultado.getEquipo2().equalsIgnoreCase(pronostico.getEquipo2()))  {
			
					if(Integer.parseInt(resultado.getGolesEquipo1()) > Integer.parseInt(resultado.getGolesEquipo2())) {
						System.out.println(partido+"° Partido - El Ganador es  "+resultado.getEquipo1());
						if(pronostico.getGanaLocal().equalsIgnoreCase("x")) {
							System.out.println("acerte");
							punto++;
						}else {
							System.out.println("No acerte");
						}
						
					}else if(Integer.parseInt(resultado.getGolesEquipo2()) > Integer.parseInt(resultado.getGolesEquipo1())) {
						System.out.println(partido+"°Partido - El Ganador es  "+resultado.getEquipo2());
						if(pronostico.getGanaVisitante().equalsIgnoreCase("x")) {
							System.out.println("acerte");
							punto++;
						}else {
							System.out.println("No acerte");
						}
						
					}else if(Integer.parseInt(resultado.getGolesEquipo2()) == Integer.parseInt(resultado.getGolesEquipo1())) {
						System.out.println(partido+"°Partido - Ambos equipos Empataron");
						if(pronostico.getEmpate().equalsIgnoreCase("x")) {
							System.out.println("acerte");
							punto++;
						}else {
							System.out.println("No acerte");
						}
					}
				}
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.println("El Participante sumo "+ punto +" puntos");
	}
		
	
		
	
}	

		

		
	
	


