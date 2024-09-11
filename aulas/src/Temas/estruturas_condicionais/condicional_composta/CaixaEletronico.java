package Temas.estruturas_condicionais.condicional_composta;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorsolicitado = 17.0;

        if(valorsolicitado < saldo){
            saldo = saldo - valorsolicitado;
            System.out.println("Novo saldo" + saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
        
    }
}