package org.jfedor.nxtremotecontrol.model;

public class NXTInstruction {
	public int idImagen;
	public int duracion;
	public String nombre;
	public NXTInstruction(int idImagen, int duracion, String nombre) {
		super();
		this.idImagen = idImagen;
		this.duracion = duracion;
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return nombre;
	}
	
	
	
	
}
