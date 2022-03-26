

package taller3.televisores;

public class TV {

	private Marca marca;
	public int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	public Control control;
	
	public static int numTV;

	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	

	public Marca getMarca() {
		return marca;
	}

	public Control getControl() {
		return control;
	}

	public int getPrecio() {
		return precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public int getCanal() {
		return canal;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	public boolean getEstado() {
		return estado;
		
	}
	
	public void setMarca(Marca marc) {
		 marca = marc;
	}

	public void setControl(Control ctrl) {
		control = ctrl;
	}

	public void setPrecio( int prec) {
		precio = prec;
	}

	public void setVolumen( int volum) {
		if (volum < 0 || volum > 7)
			return;
		else 
		volumen = volum;
	}

	public void setCanal (int cana) {
		if (cana < 1 || cana > 120)
			return;
		if (estado == false)
			return;
		else
		canal = cana;
	}
	
	public static void setNumTV (int numtv) {
		 numTV = numtv;
	}
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public void canalUp () {
		if (estado == false) {
			return;
		}
		if(canal == 120){
			return;
		}
		else {
			canal++;
		}
		
	}
	public void canalDown () {
		if (estado == false) {
			return;
		}
		if(canal == 1){
			return;
		}
		else {
			canal--;
		}
		
	}
	public void volumenUp () {
		if (estado == false) {
			return;
		}
		if(volumen == 7){
			return;
		}
		else {
			volumen++;
		}
		
	}
	public void volumenDown () {
		if (estado == false) {
			return;
		}
		if(volumen == 0){
			return;
		}
		else {
			volumen--;
		}
		
	}
	
    
}
