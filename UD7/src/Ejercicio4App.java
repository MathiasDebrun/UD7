import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String cant;
		String precio;
		String nom;
		double calculariva=0;
		double producto;
		double totalbruto=0;
		double totalneto=0;
		double pagado=0;
		double vuelto=0;
		
		Hashtable<String, String> precios=new Hashtable<String, String>();
		precios.put("carne","3");
		precios.put("lechuga","2");
		precios.put("bebida","2");
		precios.put("tomate","2");
		precios.put("fuet","3");
		precios.put("agua","1");
		precios.put("helado", "4");
		precios.put("vino", "3");
		precios.put("chocolate", "2");
		precios.put("leche", "1");
		
		Hashtable<String, String> productos=new Hashtable<String, String>();
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
		
		System.out.println("Buenas, ¿qué desea hacer? \n"
							+"1) Caja 2)Control de stock y precios 3)Salir");
		String opcion=sc.nextLine();
		while (opcion!="3" || opcion!="5") {
			switch(opcion) {
			case "volver": System.out.println("1) Caja 2)Control de stock y precios 3)Salir");
			    opcion=sc.nextLine();
			break;
			    
			case "1":
				System.out.println("¿Cántos productos agregará?");
				int n=Integer.parseInt(sc.nextLine());
				Double[]  compra= new Double[n];
				for (int i = 0; i < compra.length; i++) {
					System.out.println("Agregue el precio del producto");
					producto=Double.parseDouble(sc.nextLine());
					compra[i]=producto;
				}
				for (int i = 0; i < compra.length; i++) {
					totalbruto+=compra[i];
				}
				System.out.println("¿Qué IVA se le aplica a esta compra?"); 			//Aquí podemos agregar el procentaje de IVA que queramos.
				calculariva=sc.nextDouble();
				totalneto=totalbruto*((calculariva+100)/100);
				System.out.println("Total a pagar: "+totalneto+ " ¿Cuánto paga el cliente?");
				pagado=sc.nextDouble();
				vuelto=pagado-totalneto;
				System.out.println("Vuelto: "+vuelto);
				opcion="volver";
			break;
			case "2":
				while(opcion!="volver") {
				System.out.println("1) Cambiar Stock 2)Cambiar precio 3)Saber precio y stock 4)Agregar producto 5)Listar Productos 6)Salir");
			    String opcionb=sc.nextLine();
			    switch (opcionb) {
			    
			   
			    case "1":
			    	System.out.println("¿De qué producto quiere cambiar el stock?");
					nom=sc.nextLine();
					if (productos.containsKey(nom)) {
						System.out.println("Ingrese la cantidad del producto");
						cant=sc.nextLine();
						productos.put(nom, cant);
						System.out.println("Listo!");
						
						}
					else {
							System.out.println("Producto no encontrado");
					}
					opcionb="6";
			    break;
			    case "2":
			    	System.out.println("¿De qué producto quieres cambiar el precio?");
			    	nom=sc.nextLine();
			    	if (precios.containsKey(nom)) {
						System.out.println("Ingrese el precio del producto");
						precio=sc.nextLine();
						productos.put(nom, precio);
						System.out.println("Listo!");
						
						}
					else {
							System.out.println("Producto no encontrado");
					}
			    	opcionb="6";
			    break;
			    case "3":
			    	System.out.println("¿De qué producto quieres tener información?");
			    	nom=sc.nextLine();
			    	if (precios.containsKey(nom) && productos.containsKey(nom)) {
						System.out.println("El precio y la cantidad de "+nom+ " es " +precios.get(nom)+ " y "+productos.get(nom)+ " respectivamente.");
						
						}
					else {
							System.out.println("Producto no encontrado");
					}
			    	opcionb="6";
			    break;
			    case "4":
			    	System.out.println("Ingrese el nombre del producto");
					nom=sc.nextLine();
					System.out.println("Ingrese cantidad del producto");
					cant=sc.nextLine();
					System.out.println("Ingrese precio del producto");
					precio=sc.nextLine();
					productos.put(nom, cant);
					precios.put(nom, precio);
					opcionb="6";	
			    case "5":
			    	System.out.println("La cantidad de productos es: " +productos.toString());
			    	System.out.println("Los precios son: " +precios.toString());
			    	opcionb="6";
			    case "6": opcion="volver";
			    break;
			    }
				
			
			
			
			
			
			
			
			
				}
			}
			
			
			
		}
		
		
		
		
		
		
	}

}
