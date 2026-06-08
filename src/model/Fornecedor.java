package model;

public class Fornecedor {

    public int id;
    public String nome;
    public String cnpj;

    public Fornecedor(int id, String nome, String cnpj) {
        this.setId(id);
        this.setNome(nome);
        this.setCnpj(cnpj);
    }

    public Fornecedor(String nome, String cnpj) {
        this.setNome(nome);
        this.setCnpj(cnpj);
    }

    public Fornecedor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
