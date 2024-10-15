package fr.uphf.Questease.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Util_Controller {
    @GetMapping("/Utilisateur")
    public @ResponseBody String hello(
            @RequestParam(value="name", defaultValue = "world") String name
    ) {
        return String.format("Hello %s", name );
    }
}
