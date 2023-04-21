package org.TPEntrega1.Entidades;

import com.opencsv.bean.CsvBindByPosition;

public class Pronostico {

	@CsvBindByPosition (position = 0 )
	private String Equipo1;
	@CsvBindByPosition (position = 1 )
	private String ganaLocal;
	@CsvBindByPosition (position = 2 )
	private String empate;
	@CsvBindByPosition (position = 3 )
	private String ganaVisitante;
	@CsvBindByPosition (position = 4 )
	private String Equipo2;
	
	
	
	
	public Pronostico(String equipo1, String ganaLocal, String empate, String ganaVisitante, String equipo2) {
		
		this.Equipo1 = equipo1;
		this.ganaLocal = ganaLocal;
		this.empate = empate;
		this.ganaVisitante = ganaVisitante;
		this.Equipo2 = equipo2;
	}
	
	public Pronostico() {
		
	}
	public String getEquipo1() {
		return Equipo1;
	}
	public void setEquipo1(String equipo1) {
		this.Equipo1 = equipo1;
	}
	public String getGanaLocal() {
		return ganaLocal;
	}
	public void setGanaLocal(String ganaLocal) {
		this.ganaLocal = ganaLocal;
	}
	public String getEmpate() {
		return empate;
	}
	public void setEmpate(String empate) {
		this.empate = empate;
	}
	public String getGanaVisitante() {
		return ganaVisitante;
	}
	public void setGanaVisitante(String ganaVisitante) {
		this.ganaVisitante = ganaVisitante;
	}
	public String getEquipo2() {
		return Equipo2;
	}
	public void setEquipo2(String equipo2) {
		this.Equipo2 = equipo2;
	}

	@Override
	public String toString() {
		return "Pronostico [equipo1=" + Equipo1 + ", ganaLocal=" + ganaLocal + ", empate=" + empate + ", ganaVisitante="
				+ ganaVisitante + ", equipo2=" + Equipo2 + "]";
	}
	
	
	
	
}
