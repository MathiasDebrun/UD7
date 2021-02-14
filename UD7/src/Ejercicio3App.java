import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String cant;
		String nom;
		Hashtable<String, String> productos=new Hashtable<String, String>();
		System.out.println("Buenas, ¿qué desea hacer?\n"
				+ "1) Agregar Producto 2) Modificar cantidad de un producto 3)Buscar información sobre un producto 4)Listar toda la información 5)Salir");
		String opcion= sc.nextLine();
		//Base de datos.
		productos.put("leche","44");
		productos.put("carne","22");
		productos.put("lechuga","65");
		productos.put("bebida","51");
		productos.put("tomate","25");
		productos.put("fuet","16");
		productos.put("agua","37");
		productos.put("helado", "33");
		productos.put("vino", "99");
		productos.put("chocolate", "68");
		
		
		//Bucle que se repite mientras la opción elegida no sea "Salir".
		while(opcion!="5") {
			switch(opcion) {
			//Creamos una opción para poder volver a elegir, así el programa no termina cada vez que realizamos una acción.
			case "volver": 
				System.out.println("1) Agregar Producto 2) Modificar cantidad de un producto 3)Buscar información sobre un producto 4)Listar toda la información 5)Salir");
				opcion=sc.nextLine();
			break;
			case "1": 
				System.out.print("Ingrese cantidad del producto");
				cant=sc.nextLine();
				System.out.println("Ingrese el nombre del producto");
				nom=sc.nextLine();
				productos.put(nom, cant);
				opcion="volver";
			break;
			case "2":
				System.out.println("¿Que producto quiere cambiar?");
				nom=sc.nextLine();
				if (productos.containsKey(nom)) {
					System.out.println("Ingrese la cantidad del producto");
					cant=sc.nextLine();
					productos.put(nom, cant);
					
					}
				else {
						System.out.println("Producto no encontrado");
				}
				opcion="volver";
			break;
			
			case "3": 
				System.out.println("¿Sobre qué producto quiere saber la cantidad?");
				nom=sc.nextLine();
				if (productos.containsKey(nom)) {
					System.out.println("Hay "+productos.get(nom));
					
				} else {
					System.out.println("No se ha encontrado ese producto");
				}
				opcion="volver";
			break;
			
			case "4":
				System.out.println(productos.toString());
				opcion="volver";
			break;
				
			}
			
			
			
			
			
		}
		
		
	}

}
