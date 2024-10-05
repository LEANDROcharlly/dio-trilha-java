package Temas.Tratamento_Exceptions;

import java.util.Locale;
import java.util.Scanner;

public class Excecao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try{
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("O nome completo: " + nome + " " + sobrenome);
        System.out.println("A idade: " + idade);
        System.out.println("A altura: " + altura);
        
        scanner.close();
        }
        catch(java.util.InputMismatchException e){
            System.out.println("A idade precisa ser numerica e altura tem que seu com ponto no lugar da virgula");
        }

    }
    
}
