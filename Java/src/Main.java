import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Se o Usuario necessitar Inserir seus proprios dados
        //Dentro dos parametro passaria algo como: setNome(scanner.nextLine())
        //todo: todos os dados a serem armazenados vai ser em LOCACAO
        //TODO: CRIAR UM MENU PARA O CADASTRO DE UM USUARIO DA BIBLIOTECA

        //TODO: CRIE UM MENU PARA O CADASTRO DE UM FUNCIONARIO
        //TODO: CRIAR UM MENU PARA O CADASTRO DE UM LIVRO DA BIBLIOTECA

        Scanner scanner = new Scanner(System.in);

        //TODO: criando o objeto Usuario: contem todos as propriedades da classe Usuario
        Locacao locacao = new Locacao();

        //variaveis global
        int op;
        boolean cadastrado = false;
        // do while dentro de um switch
        // dentro outras op
        // cadastros gerais e dentro dele o login



        while (true) {
            do {
                System.out.println("===Biblioteca===");
                System.out.println("Cadastre-se [1]");
                System.out.println("Login      [2]");
                System.out.print("Escolha: ");
                op = scanner.nextInt();
                scanner.nextLine(); // Consome o ENTER
                if (op != 1 && op != 2) {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } while (op != 1 && op != 2);

            switch (op) {
                case 1:
                    // Cadastro do usuário
                    System.out.println("Insira seus dados cadastrais:");
                    System.out.print("Nome: ");
                    locacao.getUsuario().setNome(scanner.nextLine());
                    System.out.print("Idade: ");
                    locacao.getUsuario().setIdade(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Rua: ");
                    locacao.getUsuario().getEndereco().setRua(scanner.nextLine());
                    System.out.print("Bairro: ");
                    locacao.getUsuario().getEndereco().setBairro(scanner.nextLine());
                    System.out.print("Numero: ");
                    locacao.getUsuario().getEndereco().setNum(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Insira seu E-mail de Cadastro: ");
                    locacao.getUsuario().setEmail(scanner.nextLine());
                    System.out.print("Insira uma senha: ");
                    locacao.getUsuario().setSenha(scanner.nextLine());

                    System.out.println("Seja Bem Vindo: " + locacao.getUsuario().getNome());
                    cadastrado = true;
                    op=2;
                    break;
                case 2:
                    if (locacao.getUsuario() == null || !cadastrado) {
                        System.out.println("Nenhum usuário cadastrado!!");
                        break;
                    }
                    System.out.println("Insira seus Dados de Login:");
                    System.out.print("Nome: ");
                    String nomeLogin = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senhaLogin = scanner.nextLine();
                    if (locacao.getUsuario().getNome().equals(nomeLogin) && locacao.getUsuario().getSenha().equals(senhaLogin)) {
                        System.out.println("Login realizado com sucesso!!");

                    } else {
                        System.out.println("Nome e/ou Senha Inválidos, Tente Novamente!!");
                    }
                    break;
            }
        }

    }

}
