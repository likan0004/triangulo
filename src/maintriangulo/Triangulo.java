package maintriangulo;

import static java.lang.Math.sqrt;


public class Triangulo {
    
   
    private Punto p1;
    private Punto p2;
    private Punto p3;
   



   public Triangulo(Punto p1, Punto p2, Punto p3){
        

this.p1=p1;
this.p2=p2;
this.p3=p3;
}
    
   public double ObtenerArea(){
	
       Recta r1= new Recta(p1,p2);
       
       double area, b,a;
        
        
                   
                    
                    
                   b=p1.distancia(p2);
                   a=r1.distancia(p3);
	
	area=(b*a)/2;
	return area;
}

      public double ObtenerPerimetro(){
          double perimetro;
	perimetro=p1.distancia(p2)+p2.distancia(p3)+p3.distancia(p1);
	return perimetro;
}
    
    public String toString(){
        
    return "Area= "+ObtenerArea()+" Perimetro: "+ObtenerPerimetro();
    }
         
}
