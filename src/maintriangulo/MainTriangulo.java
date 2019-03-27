package maintriangulo;

import java.util.Scanner;


public class MainTriangulo {

    
    public static void main(String[] args) {
      
   Scanner sc = new Scanner(System.in);
    double coordenadasX[]  = new double [3];
double coordenadasY[]  = new double [3];    
    
   int i=0;
   double area,peri,a,b,c;
   
         for (i=0;i <3;i++){
   	         System.out.println("Escribe la coordenada x "+(i+1));
   	coordenadasX[i]= sc.nextDouble();
   	         System.out.println("Escribe la coordenada y "+(i+1));
    coordenadasY[i]=sc.nextDouble();
                 
  
         }
             Punto da = new Punto(coordenadasX[0],coordenadasY[0]);
                    Punto db = new Punto(coordenadasX[1],coordenadasY[1]);
                    Punto dc = new Punto (coordenadasX[2],coordenadasY[2]);
                   
                    

                  Triangulo triangulo = new Triangulo(da,db,dc);
                  
                  
                  
                  
                  area=triangulo.ObtenerArea(); 
         System.out.println("Area "+area);
 peri=triangulo.ObtenerPerimetro();
           
         System.out.println("Perimetro "+peri);
         
        
    }
}
