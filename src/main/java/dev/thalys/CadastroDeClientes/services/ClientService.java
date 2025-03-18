package dev.thalys.CadastroDeClientes.services;
import dev.thalys.CadastroDeClientes.models.ClientModel;
import dev.thalys.CadastroDeClientes.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    //List
    public List<ClientModel> getAll() {
        return clientRepository.findAll();
    }
    //Create
    public ClientModel save(ClientModel client) {
        return clientRepository.save(client);
    }
    //Delete
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }
}
