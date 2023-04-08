//Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS e quantos são POSITIVOS.
import java.util.Scanner;

public class exercicio2 {
        public static void main(String[] args) {
           System.out.println("Digite dez numeros aleatorios, respectivamente:");
           try (Scanner scan = new Scanner(System.in)) {
            int valor;
               int contador=0;
               int contadorNeg =0;
               int contadorPos= 0;
               while (contador < 10){
                   valor = scan.nextInt();
                   if (valor <=0){
                       contadorNeg++;
                   }else {
                       contadorPos++;
                   }
                   contador++;
               }System.out.println(contadorPos +" Numeros positivos " + " e " +contadorNeg+" Numeros negativos");
        }
    }
    
    
}
