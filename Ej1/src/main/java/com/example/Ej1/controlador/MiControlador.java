package com.example.Ej1.controlador;

import com.example.Ej1.modelo.Coche;
import com.example.Ej1.modelo.Moto;
import com.example.Ej1.servicio.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class MiControlador {

    @Autowired
    private MiServicio miServicio;

    @RequestMapping("/saluda")
    public Map saluda() {
        return Map.of("saludo", "Hola mundo");
    }

    @PostMapping("/calculoPFCoche")
    public ResponseEntity<?> calculoPFCoche(@RequestBody Coche coche){
//        private String matricula;
//        private int cilindrada;
//        private int cilindros;
//        private int potencia;

        return ResponseEntity.ok(Map.of("potenciaFiscal", miServicio.calcularPotenciaFiscal(coche)));

    }

    @PostMapping("/calculoPFmoto")
    public ResponseEntity<?> calculoPFMoto(@RequestBody Moto moto){
//        private String matricula;
//        private int cilindrada;
//        private int cilindros;
//        private int potencia;

        return ResponseEntity.ok(Map.of("potenciaFiscal", miServicio.calcularPotenciaFiscalMoto(moto)));

    }
}
