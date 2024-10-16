package fr.uphf.Questease.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class SecuInfoController {
    @GetMapping("/SecuInfo")
    public @ResponseBody String hello(
            @RequestParam(value="name", defaultValue = "world") String name
    ) {
        return String.format("Hello %s", name );
    }
}
