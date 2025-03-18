package dev.thalys.CadastroDeClientes.controllers;
import dev.thalys.CadastroDeClientes.models.ClientModel;
import dev.thalys.CadastroDeClientes.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<ClientModel> getAll() {
        return clientService.getAll();
    }

    @PostMapping
    public ClientModel create(@RequestBody ClientModel client) {
        return clientService.save(client);
    }
}
