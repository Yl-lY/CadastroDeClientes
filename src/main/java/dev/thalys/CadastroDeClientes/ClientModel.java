package dev.thalys.CadastroDeClientes;

import jakarta.persistence.*;

@Entity
@Table( name= "tb_cadastro")
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String city;
    private String state;
    private int age;

    public ClientModel() {
    }

    public ClientModel(String nome, String email, String city, String state, int age) {
        this.nome = nome;
        this.email = email;
        this.city = city;
        this.state = state;
        this.age = age;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
