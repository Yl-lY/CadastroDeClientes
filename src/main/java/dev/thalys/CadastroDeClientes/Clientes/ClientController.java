package dev.thalys.CadastroDeClientes.Clientes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/")
    public String boasVindas() {
      return "Boas vindas à minha API";
    }
}
