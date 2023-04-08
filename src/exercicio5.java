
//Leia várias idades e calcule a média entre as idades (usar uma variável para idade).
import java.util.Scanner;

public class exercicio5 {
    public static void main (String args[]){
        System.out.println("Digite as idades dos alunos:");
        
      Scanner scan = new Scanner(System.in); 

    int idade = 0;
    int mediaIdade;
    int soma = 0;
    int contador = 0;

    do {
        

        if (idade > 0){
            soma = soma + idade;
            contador = contador + 1;
        }
    }while (idade != 0);

    if (contador > 0){
        mediaIdade = soma / contador;
        System.out.println("A media das idades eh: "+mediaIdade);
    }
         
    }
    }

