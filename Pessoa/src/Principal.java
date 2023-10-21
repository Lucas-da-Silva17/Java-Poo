// import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) throws Exception {
        String nome = "lucas", profissao = "dev";
        Pessoa pessoa = new Pessoa();

        pessoa.setid(1);
        pessoa.setnome("Lucas");
        pessoa.setcpf("000.000.00-00");
        pessoa.setrg("1111111111-1");
        pessoa.setcidade("São Paulo");
        pessoa.setestadoCivil("Solteiro");
        pessoa.setdata("17/07/2001");

        System.out.println("Meu nome é: " + pessoa.getnome());
        System.out.println("CPF: " + pessoa.getcpf());
        System.out.println("rg: " + pessoa.getrg());
        System.out.println("Cidade em que nasci " + pessoa.getcidade());
        System.out.println("estado " + pessoa.getestadoCivil());
        System.out.println("data de nascimento " + pessoa.getdata());

        System.out.println("------------------------------------------");
        System.out.println("depois de usar setter para mudar os valores");

        pessoa.setnome("lucas");
        pessoa.setdata("25/12/2001");
        System.out.println("Meu nome é: " + pessoa.getnome());
        System.out.println("CPF: " + pessoa.getcpf());
        System.out.println("rg: " + pessoa.getrg());
        System.out.println("Cidade em que nasci " + pessoa.getcidade());
        System.out.println("estado " + pessoa.getestadoCivil());
        System.out.println("data de nascimento " + pessoa.getdata());

        System.out.println("-----------------------------------------------------------------------");
        System.out.println(pessoa.toString());

        System.out.println("----------------------------------------------------------------------- teste agenda");
        System.out.println(" ");

        Agenda agenda = new Agenda();
        Pessoa pessoa2 = new Pessoa(0, "lucas", "123", "321", "sao paulo", "solteiro", "17/07/2001", "dev");
        Pessoa pessoa3 = new Pessoa(0, "ferrari", "123", "321", "sao paulo", "solteiro", "17/07/2001", "medico");
        Pessoa pessoa4 = new Pessoa(0, "luan", "123", "321", "sao paulo", "solteiro", "17/07/2001", "engenheiro");

        agenda.adicionarPessoas(pessoa2);
        agenda.adicionarPessoas(pessoa3);
        agenda.adicionarPessoas(pessoa4);

        // ArrayList<Pessoa> pessoascomprofissao = agenda.buscarProfissao("dev");

        // if(pessoascomprofissao != null) {
        // System.out.println(pessoascomprofissao.toString());
        // } else {
        // System.out.println("nenhuma pessoa contem essa profissão!");
        // }

        agenda.buscarNome(nome);
        System.out.println("------------busca nome");
        System.out.println(" ");
        System.out.println("------------ verifica profissão");
        agenda.buscarProfissao(profissao);
        System.out.println("------------exibir lista de contatos");
        agenda.exibirnome();
    }
}