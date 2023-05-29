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
    pessoa.coletaNome(pessoa, scanner); // adicionado o parametro pessoa a linha 13,14
    pessoa.coletaIdade(pessoa, scanner);
    // Adicionado o parametro scannner na linha 16
    erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pessoa, scanner); // Correção de (pesssoas) para (pessoa)
    // Adicionado os paramentros:mensagem, pessoa, erroTentativas, scanner
    validacao.validacaoDasProximasPerguntas(mensagem, pessoa, erroTentativas, scanner); // Correção: (pessoas) para
                                                                                        // (pessoa)

    validacao.calcularValidacaoFinal(pessoa, mensagem, erroTentativas);// Adicionado os parametros: pessoa, mensagem,
                                                                       // erroTentativas

    scanner.close(); // Linha comentada, retirado comentario ////////////////
  }
}