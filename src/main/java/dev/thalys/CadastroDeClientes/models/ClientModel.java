package dev.thalys.CadastroDeClientes.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name= "tb_clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String city;
    private String state;
    private int age;
}
