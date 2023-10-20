public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String cidade;
    private String estadoCivil;
    private String data;
    private String profissao;

   

    public Pessoa(int id, String nome, String cpf, String rg, String cidade, String estadoCivil, String data,
            String profissao) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cidade = cidade;
        this.estadoCivil = estadoCivil;
        this.data = data;
        this.profissao = profissao;
    }

    public Pessoa() {

    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getrg() {
        return rg;
    }

    public void setrg(String rg) {
        this.rg = rg;
    }

    public String getcidade() {
        return cidade;
    }

    public void setcidade(String cidade) {
        this.cidade = cidade;
    }

    public String getestadoCivil() {
        return estadoCivil;
    }

    public void setestadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getdata() {
        return data;
    }

    public void setdata(String data) {
        this.data = data;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String toString() {
        return String.format("nome: " + getnome() + " \n" +
                "CPF: " + getcpf() + " \n" +
                "RG: " + getrg() + " \n" +
                "Cidade: " + getcidade() + " \n" +
                "Estado Civil: " + getestadoCivil() + " \n" +
                "Data: " + getdata());
    }
}
