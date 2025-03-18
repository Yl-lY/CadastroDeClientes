package dev.thalys.CadastroDeClientes.repositories;
import dev.thalys.CadastroDeClientes.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}
