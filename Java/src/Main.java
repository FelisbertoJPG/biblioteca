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


        System.out.println("===Biblioteca===");
        System.out.println("Cadastre-se[1]");
        System.out.println("Login[2]");

        switch (op){
            case 1:
                System.out.println("Insira seus dados cadastrais:");
                System.out.println("Nome:");
                locacao.getUsuario().setNome(scanner.nextLine());
                System.out.println("Idade:");
                locacao.getUsuario().setIdade(scanner.nextInt());
                System.out.println("Endereço:");
                //TODO: UM PRA CADA
                locacao.getUsuario().getEndereco().setNum(scanner.nextInt());
                locacao.getUsuario().getEndereco().setRua(scanner.nextLine());
                locacao.getUsuario().getEndereco().setBairro(scanner.nextLine());
                //TODO: EMAIL
                locacao.getUsuario().setEmail(scanner.nextLine());
                //TODO: SENHA
                locacao.getUsuario().setSenha(scanner.nextLine());
                System.out.println("Seja Bem Vindo: "+locacao.getUsuario().getNome());
                break;
            case 2:
                //TODO: LOGIN

        }

        do{
            op = scanner.nextInt();
            System.out.println("Selecione uma opção válida!!");
            if(op==1){

            }
        }while (op!=1);

        do {
            System.out.println("Consulta de Livro:");
            System.out.println("Insira o Nome do Livro");
            livro.setNome(scanner.nextLine());




        }while ();




    }

}
