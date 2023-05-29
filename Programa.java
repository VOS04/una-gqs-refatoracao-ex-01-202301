import java.util.Scanner;

class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean erroTentativas = false;
    Pessoa pessoa = new Pessoa();
    Mensagem mensagem = new Mensagem();
    Validacao validacao = new Validacao();

    System.out.println("\tRelatório Auxiliar de Controle de Infecções");
    // Valdeno, correção do "sc", para "scanner";
    pessoa.coletaNome(scanner);
    pessoa.coletaIdade(scanner);

    erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pessoa); // Correção de (pesssoas) para (pessoa)
    // Adicionado os paramentros:mensagem, pessoa, erroTentativas, scanner
    validacao.validacaoDasProximasPerguntas(mensagem, pessoa, erroTentativas, scanner); // Correção: (pessoas) para
                                                                                        // (pessoa)

    validacao.calcularValidacaoFinal(pessoa, mensagem, erroTentativas);// Adicionado os parametros: pessoa, mensagem,
                                                                       // erroTentativas

    scanner.close(); // Linha comentada, retirado comentario
  }
}