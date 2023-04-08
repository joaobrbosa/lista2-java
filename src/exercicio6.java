//Ler 10 números e imprimir quantos são pares e quantos são ímpares.
import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        System.out.println("Digite dez numeros aleatorios, respectivamente:");
        try (Scanner scan = new Scanner(System.in)) {
            int valor;
            int contador=0;
            int contadorImpar=0;
            int contadorPar=0;
            while (contador <= 10){
                valor = scan.nextInt();
                if (valor%2 ==0){
                    contadorPar++;
                }else  {
                    contadorImpar++;
                }
                    contador++;
            }System.out.println(contadorPar +" Numeros Pares " + " e " +contadorImpar+" Numeros Impares");
        }
     }
 }
 
    

