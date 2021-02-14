import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hashtable<String, String> Alumnos= new Hashtable<String, String>();
       Scanner sc= new Scanner(System.in);
       
      System.out.println("Introduzca cuántos alumnos agregará");
      int n= sc.nextInt();
     double[] suma= new double[n];
      String[] total= new String[n];
      double promedio=0;
      double sumatotal=0;
      for(int i=1; i<=n;i++) {
    	  System.out.print("Introduzca nota media y nombre");
    	  double m=sc.nextDouble();
    	  String nota= String.valueOf(m);
//    	  System.out.println("Introduzca nombre");
    	  String nombre= sc.nextLine();
    	  Alumnos.put(nota,nombre);
      }
    	
        Enumeration notas= Alumnos.keys();
		 for (int i=0; notas.hasMoreElements(); i++) {
			 
			 total[i]=(String) notas.nextElement();
		 }
		for (int i=0; i< total.length; i++) {
			 suma=Arrays.stream(total).mapToDouble(Double::parseDouble).toArray();
					
		}
		for (int i=0; i<suma.length; i++) {
			sumatotal=sumatotal+suma[i];
		}
		promedio=sumatotal/n;
		System.out.println(promedio);
	}

}
