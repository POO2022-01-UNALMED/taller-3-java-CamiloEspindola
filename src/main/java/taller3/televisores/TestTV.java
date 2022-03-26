package taller3.televisores;

public class TestTV {
	public static void main(String[] args) {
        TV.setNumTV(0);
		
		Marca marca =  new Marca("Semsung");
	   
		TV tv1 =  new TV(marca, true);
		TV tv2 =  new TV(marca, true);
		TV tv3 =  new TV(marca, true);
	    System.out.println(TV.getNumTV());
	    
	    //assertEquals(TV.getNumTV(), 3, "No estas contando el numero de objetos de tipo de TV que se van creando");
    
	}
	}
