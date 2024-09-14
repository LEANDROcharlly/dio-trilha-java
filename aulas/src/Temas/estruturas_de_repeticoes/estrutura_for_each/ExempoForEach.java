package Temas.estruturas_de_repeticoes.estrutura_for_each;

public class ExemploForEach{
    public static void main(String[] args){
        String[] alunos = {"Felipe","Jonas","Julia","Marcos"};

        for (int x = 0; x < alunos; x++){

            System.out.println("O aluno no índice x=" + x + " é " + alunos);
        
        }

        for(String aluno : alunos){

            System.out.println("Nome do aluno é: " + aluno);
        
        }

    }
}
