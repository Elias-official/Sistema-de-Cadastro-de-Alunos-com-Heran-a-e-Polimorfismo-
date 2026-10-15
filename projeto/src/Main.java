import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE CADASTRO =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar professor");
            System.out.println("3 - Listar pessoas");
            System.out.println("4 - Buscar pessoa por nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    cadastrarAluno(scanner, pessoas);
                    break;

                case 2:
                    cadastrarProfessor(scanner, pessoas);
                    break;

                case 3:
                    listarPessoas(pessoas);
                    break;

                case 4:
                    buscarPessoa(scanner, pessoas);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void cadastrarAluno(
            Scanner scanner, ArrayList<Pessoa> pessoas) {

        System.out.println("\n--- Cadastro de Aluno ---");

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite a sua de data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite a sua matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Digite a sua nota: ");
        double nota = Double.parseDouble(
                scanner.nextLine().replace(",", "."));

        Aluno aluno = new Aluno(
                nome, cpf, dataNascimento, matricula, nota);

        pessoas.add(aluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    public static void cadastrarProfessor(
            Scanner scanner, ArrayList<Pessoa> pessoas) {

        System.out.println("\n--- Cadastro de Professor ---");

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o sua data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite a sua disciplina: ");
        String disciplina = scanner.nextLine();

        System.out.print("Digite a sua titulação: ");
        String titulacao = scanner.nextLine();

        Professor professor = new Professor(
                nome, cpf, dataNascimento, disciplina, titulacao);

        pessoas.add(professor);

        System.out.println("Professor cadastrado com sucesso!");
    }

    public static void listarPessoas(ArrayList<Pessoa> pessoas) {

        System.out.println("\n--- Pessoas Cadastradas ---");

        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }

        for (Pessoa pessoa : pessoas) {
            exibirPessoa(pessoa);
            System.out.println("-------------------------");
        }
    }

    public static void buscarPessoa(
            Scanner scanner, ArrayList<Pessoa> pessoas) {

        System.out.print("\nDigite o nome que deseja buscar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrou = false;

        for (Pessoa pessoa : pessoas) {

            if (pessoa.getNome().equals(nomeBusca)) {
                exibirPessoa(pessoa);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public static void exibirPessoa(Pessoa pessoa) {

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCPF());
        System.out.println(
                "Data de nascimento: " + pessoa.getDataNascimento());

        if (pessoa instanceof Aluno) {
            Aluno aluno = (Aluno) pessoa;

            System.out.println("Tipo: Aluno");
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nota: " + aluno.getNota());

        } else if (pessoa instanceof Professor) {
            Professor professor = (Professor) pessoa;

            System.out.println("Tipo: Professor");
            System.out.println("Disciplina: " + professor.getDisciplina());
            System.out.println("Titulação: " + professor.getTitulacao());
        }
    }
}



class Pessoa {
    private String nome;
    private String CPF;
    private String dataNascimento;

    // Construtor sem parâmetros
    public Pessoa() {
        this("", "", "");
    }

    // Construtor com parâmetros
    public Pessoa(String nome, String CPF, String dataNascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

class Aluno extends Pessoa {
    private String matricula;
    private double nota;

    public Aluno(String nome, String CPF, String dataNascimento,
                 String matricula, double nota) {

        super(nome, CPF, dataNascimento);
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

class Professor extends Pessoa {
    private String disciplina;
    private String titulacao;

    public Professor(String nome, String CPF, String dataNascimento,
                     String disciplina, String titulacao) {

        super(nome, CPF, dataNascimento);
        this.disciplina = disciplina;
        this.titulacao = titulacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}