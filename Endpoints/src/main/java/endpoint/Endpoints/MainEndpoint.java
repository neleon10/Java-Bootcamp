package endpoint.Endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainEndpoint {
    @GetMapping("/usuario/{id}")
    public String getUserId (@PathVariable String id){
        return id;
    }

    @GetMapping("/usuario/mytext/{texto}")
    public void getTexto (@PathVariable String texto){
        System.out.println("Hola, devuelvo el texto por parametro--> " + texto);
    }
}
