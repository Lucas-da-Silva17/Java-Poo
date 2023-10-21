import java.util.ArrayList;

public class Agenda extends Pessoa {

    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public ArrayList<Pessoa> adicionarPessoas(Pessoa pessoa) {
        this.pessoas.add(pessoa);
        return pessoas;
    }

    public void buscarNome(String nome) {
        for (Pessoa pessoa : this.pessoas) {
            if (pessoa.getnome().equals(nome)) {
                System.out.println("Encontrou o nome");
                System.out.println(pessoa.toString());
            } else {
                System.out.println("o nome não foi encontrado");
            }
        }
    }

    public void buscarProfissao(String profissao) {

        ArrayList<Pessoa> pessoaprofissao = new ArrayList<Pessoa>();
        // pessoas.forEach(profissional -> {
        // if (profissional.getProfissao().equals(profissao)) {
        // pessoaprofissao.add(profissional);
        // }
        // });
        for (Pessoa pessoa : this.pessoas) {
            if (pessoa.getProfissao().equals(profissao)) {
                pessoaprofissao.add(pessoa);
            }
        }

        for (Pessoa pessoa : pessoaprofissao) {
            System.out.println(pessoa);
        }
    }

    public void exibirnome() {
        System.out.println("mostrar os nomes de cada pessoa da lista");
        for (Pessoa pessoa : this.pessoas) {
            System.out.println(pessoa.toString());
        }
    }
}
