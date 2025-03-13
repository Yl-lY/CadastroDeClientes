package dev.thalys.CadastroDeClientes.Planos;

import dev.thalys.CadastroDeClientes.Clientes.ClientModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table( name= "tb_planos")
public class PlanoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(mappedBy = "plano")
    private List<ClientModel> clientes;

    public PlanoModel() {
    }

    public PlanoModel(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
