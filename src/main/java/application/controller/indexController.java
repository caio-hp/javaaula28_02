package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class indexController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/mensagem")
    public String mensagem(@RequestParam int opcao, Model ui){
        String texto = "";
        switch (opcao) {
            case 1:
                texto = "Bom dia";
                break;
            case 2:
                texto = "Boa Tarde";
                break;
            case 3:
                texto = "Boa noite";
                break;
            default:
                texto = "Olá";
                break;
        }

        ui.addAttribute("texto", texto);
        return "mensagem";
    }
}
