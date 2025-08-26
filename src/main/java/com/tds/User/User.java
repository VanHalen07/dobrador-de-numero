package com.tds.User;

public class User {
    private int id;
    private String nome;
    private String email;
    private int idade;

    public User(int id, String nome, String email, int idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Email: " + email + " | Idade: " + idade;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade > 0 && idade < 120) {
            this.idade = idade;
        }
        else {
            System.out.println("A idade não pode ser menor que 0 nem maior que 120");
        }
    }

}