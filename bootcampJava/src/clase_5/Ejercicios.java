package clase_5;

import java.util.Scanner;
//atencion, no uso public static void main(String[] args) porque ya lo uso en MAIN
public class Ejercicios {
    //se reserva la variable privada
    private Scanner userInput;

    public Ejercicios() { //este es el constructor
        userInput = new Scanner(System.in);
    }
    public void edadPerro(){ //metodo 1
        System.out.println("Ingrese dato para edad del humano: ");
        Integer edadDelDoggy = userInput.nextInt();
        System.out.println("La edad de su perro es " + edadDelDoggy * 7 + " años");
    }
    public void millaKilometros(){ //metodo 2
        System.out.println("Ingrese distancia en millas: ");
        Integer millas = userInput.nextInt();
        System.out.println("Los kilometros son: " + millas * 1.60934);

    }
    public void descuento(){
        System.out.println("Ingrese el precio del producto: ");
        Integer precioProducto = userInput.nextInt();
        System.out.println("Ingrese ahora el descuento: ");
        Integer descuento = userInput.nextInt();
        if(precioProducto <= descuento){
            System.out.println("No se puede calcular si el descuento es mayor al producto. ");
        }
        System.out.println("El precio final es de " + (precioProducto - (precioProducto * descuento / 100)));
    }
    public void propinaPaPapa(){
        System.out.println("Ingrese el monto de la comida: ");
        Integer monto = userInput.nextInt();
        System.out.println("Ingrese el porcentaje de propina: ");
        Integer propina = userInput.nextInt();
        if(monto <= propina){
            System.out.println("no se puede, le das mucha propina ");
        }else{
            Integer valorPropina = monto * propina / 100;
            System.out.println("La propina es de " + valorPropina + " euros.");
            System.out.println("El precio final es de " + (monto + valorPropina));
        }
    }
}
