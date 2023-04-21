package org.TPEntrega1.Entidades;

import com.opencsv.bean.CsvBindByPosition;

public class Resultado {

	@CsvBindByPosition (position = 0 )
	private String Equipo1;
	@CsvBindByPosition (position = 1 )
	private String golesEquipo1;
	@CsvBindByPosition (position = 2 )
	private String golesEquipo2;
	@CsvBindByPosition (position = 3 )
	private String Equipo2;
	
	
	public Resultado(String equipo1, String golesEquipo1, String golesEquipo2, String equipo2) {
		
		this.Equipo1 = equipo1;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
		this.Equipo2 = equipo2;
	}
	
	public Resultado() {
		
	}
	public String getEquipo1() {
		return Equipo1;
	}
	public void setEquipo1(String equipo1) {
		this.Equipo1 = equipo1;
	}
	public String getGolesEquipo1() {
		return golesEquipo1;
	}
	public void setGolesEquipo1(String golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	public String getGolesEquipo2() {
		return golesEquipo2;
	}
	public void setGolesEquipo2(String golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	public String getEquipo2() {
		return Equipo2;
	}
	public void setEquipo2(String equipo2) {
		this.Equipo2 = equipo2;
	}

	@Override
	public String toString() {
		return "Resultado [Equipo1=" + Equipo1 + ", golesEquipo1=" + golesEquipo1 + ", golesEquipo2=" + golesEquipo2
				+ ", Equipo2=" + Equipo2 + "]";
	}
	
	
	
}
