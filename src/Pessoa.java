import java.util.Objects;

public class Pessoa implements Comparable{

    int cpf;
    String nome;
    int idade;


    @Override
    public boolean equals(Object o) {
        Pessoa outra = (Pessoa) o;
        return this.cpf == (outra.cpf);
    }

    @Override
    public int hashCode() {
        return cpf;
    }

    @Override
    public String toString() {
        return "CPF=" + cpf +
                ", Nome=" + nome +
                ", Idade=" + idade +"\n";
    }

    public Pessoa(int cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Object o) {
        Pessoa outra = (Pessoa) o;
        return this.idade - outra.idade;
    }
}
