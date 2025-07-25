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
        // do while dentro de um switch
        // dentro outras op
        // cadastros gerais e dentro dele o login
        do {
            System.out.println("===Biblioteca===");
            System.out.println("Cadastre-se [1]");
            System.out.println("Login      [2]");
            System.out.print("Escolha: ");
            op = scanner.nextInt();
            if (op != 1 && op != 2) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (op != 1 && op != 2);

        switch (op){
            case 1:
                //Criar um Usuario Cadastrado
                System.out.println("Insira seus dados cadastrais:");
                System.out.println("Nome:");
                locacao.getUsuario().setNome(scanner.nextLine());
                locacao.getUsuario().setNome(scanner.nextLine());
                //trata o Enter pendente scanner.nextLine();
                //(scanner.next()) => String, para de ler quando tem Espaço na frase
                //NextLine le a linha toda ate o Enter
                //se perde nos sout()
                System.out.println("Idade:");
                locacao.getUsuario().setIdade(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Endereço:");
                System.out.println("----------------------");
                System.out.println("Rua: ");
                locacao.getUsuario().getEndereco().setRua(scanner.nextLine());

                System.out.println("Bairro: ");
                locacao.getUsuario().getEndereco().setBairro(scanner.nextLine());

                System.out.println("Numero: ");
                locacao.getUsuario().getEndereco().setNum(scanner.nextInt());

                //TODO: EMAIL
                System.out.println("Insira seu E-mail de Cadastro: ");
                locacao.getUsuario().setEmail(scanner.next());

                //TODO: SENHA
                System.out.println("Insira uma senha: ");
                locacao.getUsuario().setSenha(scanner.next());

                System.out.println("Seja Bem Vindo: "+locacao.getUsuario().getNome());
                break;
                //TODO:criar uma função a parte, pra tentar chamar aqui
            case 2:
                //TODO: LOGIN
                //pull
                if (locacao.getUsuario()==null){
                    System.out.println("Nenhum usuario cadastrado!!");
                    break;
                    //retornar pro começo do switch
                }
                System.out.println("Insira seus Dados de Login:");
                System.out.print("Nome: ");
                String nomeLogin = scanner.nextLine();
                System.out.print("Senha: ");
                String senhaLogin = scanner.nextLine();
                if(locacao.getUsuario().equals(nomeLogin) && locacao.getUsuario().equals(senhaLogin)){
                    System.out.println("Login realizado com sucesso!!");

                }else{
                    System.out.println("Nome e/ou Senha Invalidos, Tente Novamente!!");
                }
                break;

        }


    }

}
