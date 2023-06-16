package carlosSpring;
//es una clase para buscar un endpoint

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController //esto es para decirle que es un controller.
public class MainController {
    @GetMapping("/mi-url")//esto es para implementar URL.
    public String primerPrueba(){
        return "Hola, la choncha de tu hermana";
    }
    @GetMapping("/generate-password")//otra URL
    public String generatePassword(){
        double aleatorio = Math.random() * 546;
        long numeroAleatorio = Math.round(aleatorio);
        String password = "hasheado" + numeroAleatorio;
        return password;
    }
}
