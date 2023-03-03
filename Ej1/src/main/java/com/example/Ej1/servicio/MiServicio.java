package com.example.Ej1.servicio;

import com.example.Ej1.modelo.Coche;
import com.example.Ej1.modelo.Moto;
import org.springframework.stereotype.Service;

@Service
public class MiServicio {
    public String calcularPotenciaFiscal(Coche coche) {
//        private String matricula;
//        private int cilindrada;
//        private int cilindros;
//        private int potencia;

        return String.format("%.2f", Math.pow(((double) coche.getCilindrada() / (double) coche.getCilindros()), 0.6) * 0.08 * (double) coche.getCilindros());


    }

    public String calcularPotenciaFiscalMoto(Moto moto) {
//        private String matricula;
//        private float tiempo;
//        private float recorrido;
//        private float cilindros;
//        private float cilindrada;

        double pf;
        if (moto.getTiempo() == 2) {
            pf = 0.08 * Math.pow((moto.getCilindrada() / moto.getCilindros()), 0.6) * moto.getCilindros();
        } else {
            pf = 0.08 * Math.pow((moto.getCilindrada() / moto.getCilindros()), 0.6) * moto.getCilindros() * (moto.getRecorrido() / moto.getTiempo());
        }
        return String.format("%.2f", pf);
    }
}
