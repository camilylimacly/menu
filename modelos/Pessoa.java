package modelos;  // Declaração do pacote

public class Pessoa {
    
    private String nome;  // Atributo privado, acessível somente dentro da classe Pessoa
    private int idade;  // Atributo privado, acessível somente dentro da classe Pessoa

    // Construtor que recebe nome e idade como parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Construtor sobrecarregado que recebe apenas o nome
    // Inicializa com valores padrão: nome="Carlos" e idade=20
    public Pessoa() {
        this.nome = "Carlos";
        this.idade = 20;
    }

    // Método que exibe uma mensagem de saudação com o nome e idade da pessoa
    public void saudacao() {
        System.out.println("Olá, " + nome + "!" + " Você tem " + idade + " anos.");
    }

    // Métodos Getters e Setters para acesso controlado aos atributos privados
    
    // Retorna o nome da pesso
    public String getNome() {
        return nome;
    }

    // Retorna a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Define um novo nome para a pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Define uma nova idade para a pessoa
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Sobrescrita do método toString para uma representação textual do objeto
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }
}

public class Gato {

    private String nome;
    private int idade;
    private String raca;

    // Construtor com parâmetros
    public Gato(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    // Construtor padrão
    public Gato() {
        this.nome = "Mingau";
        this.idade = 2;
        this.raca = "Vira-lata";
    }

    // Método específico
    public void miar() {
        System.out.println("Miau! Eu sou " + nome + ", tenho " + idade + " anos e sou da raça " + raca + ".");
    }

    // Getter nome
    public String getNome() {
        return nome;
    }

    // Setter nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter idade
    public int getIdade() {
        return idade;
    }

    // Setter idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter raca
    public String getRaca() {
        return raca;
    }

    // Setter raca
    public void setRaca(String raca) {
        this.raca = raca;
    }

    // toString
    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", raca=" + raca + "]";
    }
}