//O Model representa o banco de dados no projeto, tendo uma conexão no ./repository

package models;

public class Contato {
    private int id;
    private String nome, email, telefone;

    //CONSTRUCTORS
    public Contato () {}
    public Contato (int id) {
        this.id = id;
    }
    public Contato (int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Contato (int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    public Contato (int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    //GETTERS
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
