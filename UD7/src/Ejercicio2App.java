import java.util.Hashtable;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Enumeration;
public class Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Precio de los artículos
		int lechuga=2;
		int tomate=2;
		int leche=1;
		int carne=3;
		int bebida=2;
		int fuet=3;
		int agua=1;
	
		//Hashtable con los códigos de los artículos
		Hashtable<String, String> compra= new Hashtable<String, String>();
		compra.put("44","leche");
		compra.put("22","carne");
		compra.put("65","lechuga");
		compra.put("51","bebida");
		compra.put("25","tomate");
		compra.put("16","fuet");
		compra.put("37","agua");
		
		
		ArrayList<String> suma= new ArrayList<String>();
		
		Enumeration<String> llaves= compra.keys();
		while (llaves.hasMoreElements()) {
			suma.add(llaves.nextElement());
			
			
		}
		//Creamos un array y le asignamos todos los valores de los códigos.
		String[] sumando= new String[suma.size()];
		sumando=suma.toArray(sumando);
		double totalbruto=0;
		double totalneto=0;
		int numart=0;
		//Bucle que recorre el array con los códigos de los artículos y según el código, va sumando al precio total bruto y neto
		for (int i = 0; i < sumando.length; i++) {
			
			switch(sumando[i]) {
			case "44":
				totalbruto+=1;
				totalneto+=leche*1.04;
				numart++;
			break;
			case "22":
				totalbruto+=3;
				totalneto+=carne*1.21;
				numart++;
			break;
			case "37":
				totalbruto+=1;
				totalneto+=agua*1.04;
				numart++;
			break;
			case "16":
				totalbruto+=3;
				totalneto+=fuet*1.21;
				numart++;
			break;
			case "25":
				totalbruto+=2;
				totalneto+=tomate*1.04;
				numart++;
			break;
			case "65":
				totalbruto+=2;
				totalneto+=lechuga*1.04;
				numart++;
			break;
			case "51":
				totalbruto+=2;
				totalneto+=bebida*1.21;
				numart++;
			break;
		
				}
			
		}
		//Creamos las variables para almacenar lo que pagó el cliente y cuánto se le debe devolver
		double pagado=20;
		double vuelto=pagado-totalneto;
		//Mostramos por pantalla los resultados
		System.out.println("EL total sin impuestos es: " +totalbruto);
		System.out.println("EL total con impuestos es: "+totalneto);
		System.out.println("Los artículos con 4% de IVA son: leche, verduras y agua. Los artículos con 21% de IVA son: fuet, bebida y carne");
		System.out.println("El número de artículos comprados es: " +numart);
		System.out.println("Cantidad pagada: 20 euros");
		System.out.println("A devolver: " +vuelto+ "euros");
		
		
		
	}

}
