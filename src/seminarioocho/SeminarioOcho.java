
package seminarioocho;


public class SeminarioOcho {

   
    public static void main(String[] args) {
        
        
        mostrar(new Cuadrado("Cuadro","green",10));
        mostrar(new Triangulo("Triangulo","red",3,4));
        mostrar(new Circulo("Circulo","Amarillo",10));
        
        }
        public static void mostrar(Figura fig){
            System.out.println("la figura "+fig.getNombre()+" tiene como area "+fig.calcularArea()+" y es de color "+fig.getColor());
        
        }
        
      
        
    }
    


