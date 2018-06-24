package com.littletest.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

/**
 * Created by Ricard on 23/06/2018.
 */
@RestController
public class ExampleController {

    @GetMapping("/hola")
    public Mensaje example(){
        return new Mensaje("Ricard", "Mensaje cualquiera");
    }
}
