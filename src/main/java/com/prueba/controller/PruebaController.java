package com.prueba.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/prueba")
public class PruebaController {

    @GetMapping("/buscar")
    public ResponseEntity<?> buscarPalabra(@RequestParam("fruta") String fruta){
        Set<String> frutas = Set.of("Mango","Pera","Mandarina","Uva");
        for(String f:frutas){
            if(f.equalsIgnoreCase(fruta)){
                return new ResponseEntity<>(Map.of("mensaje","fruta encontrada "+fruta.toUpperCase()),HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(Map.of("mensaje","fruta no encontrada"),HttpStatus.NOT_FOUND);
    }

}
