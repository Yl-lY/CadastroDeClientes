package dev.thalys.CadastroDeClientes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String boasVindas() {
      return "Boas vindas à minha API";
    }
}
