package util;

public class Validacoes {

    private Validacoes() {
    
    }

    public static boolean racaValido(String raca) {
        return !(raca == null || raca.trim().isEmpty() || raca.matches(".*\\d+.*"));
    }

    public static String mensagemErroRaca(String raca) {
        if (raca == null || raca.trim().isEmpty()) {
            return "Erro: A raça do gato não pode estar vazia!";
        } else if (nome.matches(".*\\d+.*")) {
            return "Erro: A raça do gato não pode conter números!";
        }
        return "";
    }

    public static boolean idadeValida(int idade) {
        return idade >= 0 && idade <= 20;
    }

    public static String mensagemErroIdade(int idade) {
        if (idade < 0) {
            return "Erro: A idade do gato não pode ser negativa!";
        } else if (idade > 20) {
            return "Erro: Idade do gato inválida!";
        }
        return "";
    }
}