package Quest1;

import java.util.Scanner;

public class TesteGeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Criação de assistente administrativo e técnico
        Administrativo assistenteAdmin = new Administrativo("João", 30, "ADM123", "Noite", 500.0);
        Tecnico assistenteTec = new Tecnico("Maria", 25, "TEC456", 1000.0);

        System.out.println("Assistente Administrativo:");
        System.out.println("Nome: " + assistenteAdmin.getNome());
        System.out.println("Matrícula: " + assistenteAdmin.getNumeroMatricula());

        System.out.println("\nAssistente Técnico:");
        System.out.println("Nome: " + assistenteTec.getNome());
        System.out.println("Matrícula: " + assistenteTec.getNumeroMatricula());

        // b) Criação de um cachorro e um gato
        Cachorro cachorro = new Cachorro("Rex", "Pastor Alemão");
        Gato gato = new Gato("Mimi", "Siamês");

        System.out.println("\nAnimais:");
        System.out.println(cachorro.late());
        System.out.println(gato.mia());
        System.out.println(cachorro.caminha());
        System.out.println(gato.caminha());

        // c) Testando as classes Rica, Pobre e Miserável
        Rica pessoaRica = new Rica("Carlos", 40, 1_000_000.0);
        Pobre pessoaPobre = new Pobre("Ana", 35);
        Miseravel pessoaMiseravel = new Miseravel("José", 50);

        System.out.println("\nPessoas:");
        pessoaRica.fazCompras();
        pessoaPobre.trabalha();
        pessoaMiseravel.mendiga();

        // d) Escolha do tipo de ingresso
        System.out.println("\nDigite 1 para ingresso normal e 2 para VIP:");
        int tipoIngresso = scanner.nextInt();

        if (tipoIngresso == 1) {
            Normal ingressoNormal = new Normal(50.0);
            System.out.println("Ingresso Normal:");
            ingressoNormal.imprimeValor();
        } else if (tipoIngresso == 2) {
            System.out.println("Digite 1 para camarote superior e 2 para camarote inferior:");
            int tipoVip = scanner.nextInt();

            if (tipoVip == 1) {
                CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.0, 50.0, 50.0);
                System.out.println("Ingresso VIP - Camarote Superior:");
                System.out.println("Valor: R$ " + camaroteSuperior.getValorCamaroteSuperior());
            } else if (tipoVip == 2) {
                CamaroteInferior camaroteInferior = new CamaroteInferior(100.0, 50, "Próximo ao palco");
                System.out.println("Ingresso VIP - Camarote Inferior:");
                camaroteInferior.imprimeLocalizacao();
                System.out.println("Valor: R$ " + camaroteInferior.getValor());
            } else {
                System.out.println("Opção inválida!");
            }
        } else {
            System.out.println("Opção inválida!");
        }

        // e) Escolha do tipo de imóvel
        System.out.println("\nDigite 1 para imóvel novo e 2 para imóvel velho:");
        int tipoImovel = scanner.nextInt();

        if (tipoImovel == 1) {
            Novo imovelNovo = new Novo("Rua das Flores, 123", 300000.0, 50000.0);
            System.out.println("Imóvel Novo:");
            imovelNovo.imprimeInformacoes();
        } else if (tipoImovel == 2) {
            Velho imovelVelho = new Velho("Avenida Central, 456", 200000.0, 30000.0);
            System.out.println("Imóvel Velho:");
            imovelVelho.imprimeInformacoes();
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

