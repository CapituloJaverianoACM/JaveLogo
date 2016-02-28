package org.jfedor.nxtremotecontrol.model;

public class NXTInstruction {
	public int idImagen;
	public int duracion;
	public String nombre;
	public int repeticiones;
	
	public NXTInstruction(NXTInstruction other) {
		this.idImagen = other.idImagen;
		this.duracion = other.duracion;
		this.nombre = other.nombre;
		this.repeticiones = other.repeticiones;
	}

	public NXTInstruction(int idImagen, int duracion, String nombre) {
		super();
		this.idImagen = idImagen;
		this.duracion = duracion;
		this.nombre = nombre;
		this.repeticiones=0;
	}
	
	public NXTInstruction(int idImagen, int duracion, String nombre, int repeticiones) {
		super();
		this.idImagen = idImagen;
		this.duracion = duracion;
		this.nombre = nombre;
		this.repeticiones=repeticiones;
	}
	
	
	@Override
	public String toString() {
		return nombre;
	}
	
	
	
	
}
