package maintriangulo;


public class Recta {
private Punto p1;
private Punto p2;



public Recta(Punto p1,Punto p2){
this.p1=p1;
this.p2=p2;

}
public Recta(double x1,double y1,double x2,double y2){
    p1=new Punto(x1,y1);
    p2=new Punto(x2,y2);
   
    
}
public Punto getP1(){
return p1;
}
public Punto getP2(){
return p2;
}
public void setP1(Punto p1){
this.p1=p1;
}
public void setP2(Punto p2){
this.p2=p2;
}
public double pendiente(){    //PENDIENTE DE UNA RECTA
return(p2.getY()-p1.getY())/(p2.getX()-p1.getX());
}
public double ordenado(){  //ecuacion de la           
return pendiente()*(-1)*p1.getX()+p1.getY();
}
public double distancia(Punto p){    //DISTANCIA DE UN PUNTO A UNA RECTA
return  Math.abs(pendiente()*(p.getX())-1*p.getY()+ordenado())/Math.sqrt(Math.pow(pendiente(),2)+1);
}

}