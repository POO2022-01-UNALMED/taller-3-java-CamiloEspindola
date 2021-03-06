package taller3.televisores;



public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
    private Control control;
    public static int numTV;
	
    
    public TV(Marca marca, boolean estado ) {
		this.marca = marca;
	    this.estado = estado;
	    numTV++;
	}
    
    // setters
    public void setMarca(Marca marca) {
    	this.marca = marca;
    }
    public void setControl(Control control) {
    	this.control = control;
    }
    public void setPrecio(int precio) {
    	this.precio = precio;
    }
    public void setVolumen(int volumen) {
    	if (estado == true && volumen<=7 && volumen >=0)
    	this.volumen = volumen;
    }
    public void setCanal(int canal) {
    	if (estado == true && canal<=120 && canal >0)
    	this.canal = canal;
    }
    public static void setNumTV(int num) {
    	 numTV = num;
    }
    //getters
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
    public void turnOn() {
    	estado = true;
    }
    public void turnOff() {
    	estado = false;
    }
    
    public boolean getEstado() {
    	return estado;
    }
    public void canalUp() {
    	if (estado == true && canal<120)
    	canal++;
    }
    public void canalDown() {
    	if (estado == true && canal>1)
    	canal--;
    }
    public void volumenUp() {
    	if (estado == true && volumen<7)
    	volumen++;
    }
    public void volumenDown() {
    	if (estado == true && volumen>1)
    	volumen--;
    }    
}


