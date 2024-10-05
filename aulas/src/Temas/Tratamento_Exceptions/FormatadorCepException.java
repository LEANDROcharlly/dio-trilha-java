package Temas.Tratamento_Exceptions;

public class FormatadorCepException {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23768864");
            System.out.println(cepFormatado);
        } catch (CepinvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O cep não corresponde com a regra de negocio");
        }
    }

    static String formatarCep(String cep) throws CepinvalidoException{
        if(cep.length() != 8)
            throw new CepinvalidoException();

            //simulando um cep formatado
            return "23.768-864";
    }
}
