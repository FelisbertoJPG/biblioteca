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
        Usuario usuario = new Usuario();
        Funcionario funcionario = new Funcionario();
        Livro livro = new Livro();

        System.out.println("Fluxo de Cadastro Usuario: ");
        System.out.println("Nome: ");
        usuario.setNome(scanner.nextLine());
        System.out.println("Idade: ");
        usuario.setIdade(scanner.nextInt());



        System.out.println("Seu nome é: "+usuario.getNome()+"e idade "+usuario.getIdade());


        }

    }
