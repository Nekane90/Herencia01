package clases;

public class Animal {
	private int idAnimal;
	private String nombre;
	private boolean chip;// Indica si tiene o no chip
	
	
	
	////////////CONSTRUCTORES/////////
	public Animal(int idAnimal, String nombre, boolean chip) {
		super();
		this.idAnimal = idAnimal;
		this.nombre = nombre;
		this.chip = chip;
	}
	
	
	public Animal() {
		super();
		this.idAnimal = 0;
		this.nombre = "********";
		this.chip = false;
	}
	
	
	
	
	
	
	
	
////////////to string/////////
		@Override
			public String toString() {
			return "Animal [idAnimal=" + idAnimal + ", nombre=" + nombre + ", chip=" + chip + "]";
	
	
	
	
	
	
	
	
	
		}



	
}
