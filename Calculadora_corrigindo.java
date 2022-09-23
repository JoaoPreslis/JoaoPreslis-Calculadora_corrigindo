package _68_2_6;

import java.util.Scanner;

public class Calculadora_corrigindo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[]{"Jakarta EE", "Spring", "Java oo Avançado"};
        System.out.println("Escolha dentre os cursos abaixo: ");
        for(int i = 0; i<cursos.length;i++)

        {
            System.out.println("[" + i + "] " + cursos[i]);
        }
        System.out.print("O curso que voçê deseja é: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();
        Boolean posicaoValida = posicaoCursoEscolhido >= 0
                && posicaoCursoEscolhido < cursos.length;
        if(!posicaoValida)

        {
            erroPorCausaDePosicaoInvalida();

        }

        imprimirTraco();

        String[] formasPagamento = new String[]{"Cartão", "Boleto"};
        System.out.println("Escolha dentre as formas de pagamento abaixo");
        for(
                int i = 0;
                i<formasPagamento.length;i++)

        {
            System.out.println("[" + i + "]" + formasPagamento[i]);


        }
        System.out.println("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
        posicaoValida =posicaoFormaPagamentoEscolhida >=0
                &&posicaoFormaPagamentoEscolhida<formasPagamento.length;
        if(!posicaoValida)

        {
            erroPorCausaDePosicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();
        System.out.println("O curso escolhido foi "+cursoEscolhido +" e a forma de pagamento é "+formaPagamentoEscolhida);


    }

    private static void erroPorCausaDePosicaoInvalida() {
        System.err.println("Posição Invalida!");
        System.exit(1);
    }

    private static void imprimirTraco() {
        System.out.println("---------------------------------------------------------------------------------------");

    }
}

