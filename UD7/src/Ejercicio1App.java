import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hashtable<String, String> Alumnos= new Hashtable<String, String>();	//Hashtable de alumnos
       Scanner sc= new Scanner(System.in);
       
      System.out.println("Introduzca cuántos alumnos agregará");            //Le pedimos al usuario el tamaño del Array en el que vamos a sumar.
      int n= sc.nextInt();
     double[] suma= new double[n];
      String[] total= new String[n];
      double promedio=0;
      double sumatotal=0;
      for(int i=1; i<=n;i++) {
    	  System.out.print("Introduzca nota media y nombre");				//Pedimos los datos al usuario.
    	  double m=sc.nextDouble();
    	  String nota= String.valueOf(m);
//    	  System.out.println("Introduzca nombre");
    	  String nombre= sc.nextLine();
    	  Alumnos.put(nota,nombre);
      }
    	
        Enumeration notas= Alumnos.keys();									// Usamos Enumeration para almacenar las keys de "Alumnos"
		 for (int i=0; notas.hasMoreElements(); i++) {
			 
			 total[i]=(String) notas.nextElement();                         //Le asignamos los valores de las keys, que en este caso son las notas.
		 }
		for (int i=0; i< total.length; i++) {
			 suma=Arrays.stream(total).mapToDouble(Double::parseDouble).toArray();  //Convertimos las keys, que están  en String, a double. Y se lo agregamos al Array suma.
					
		}
		for (int i=0; i<suma.length; i++) {									//Sumamos los elemenots del array.
			sumatotal=sumatotal+suma[i];
		}
		promedio=sumatotal/n; 												//Dividimos el total por el número de notas, así tenemos el promedio.
		System.out.println(promedio);										//Devolvemos el promedio.
	}

}
