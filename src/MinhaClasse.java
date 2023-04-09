public class MinhaClasse {

    public static void main(String[] args) {

        //  Definindo variável que pode receber alteração

        int ano = 2021;
        ano = 2022;

        //  Criando uma  variável que não sofrerá alteração, usamos "final"

        final String BR = "Brasil";

        //Declaração de variáveis

        String meuNome = "Gustavo";

        int anoFabricacao = 2023;

        boolean verdadeira = true;
        anoFabricacao = 2018;

        //Parametros
        String primeiroNome = "Gustavo";
        String segundoNome = "Tomaz";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " +  primeiroNome.concat(" ").concat(segundoNome);

    }

}
