package Registro;

import Funcionarios.Funcionarios;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class RegistrarTiempo {

    private Funcionarios funcionario;
    private LocalTime fecha;
    private boolean ingreso;

    private static LocalTime horaIngreso = LocalTime.of(8,30);
    private static LocalTime horaSalida = LocalTime.of(17,0);

    public RegistrarTiempo(Funcionarios funcionario, LocalTime fecha, boolean ingreso) {
        this.funcionario = funcionario;
        this.fecha = fecha;
        this.ingreso = ingreso;
    }
    public boolean getIngreso() {
        return ingreso;
    }

    public String logica(){
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm");
        String tipoIngreso = ingreso ? "Ingreso" : "Salida";

        String registro = String.format("Rut: %s | Nombre: %s | Hora de [%s]: %s ", funcionario.getRut(),funcionario.getNombre(),tipoIngreso,fecha.format(hora));


        if(ingreso && fecha.isAfter((horaIngreso))){
            registro += "Atrasado";

        }

        if(!ingreso && fecha.isAfter((horaSalida))){
            Duration diferencia = Duration.between(fecha,horaSalida);
            long dHoras =  diferencia.toHours();
            long dMinutos = diferencia.toMinutes();
            registro += String.format(" [Tiempo Extra: %dh %dm]",  dHoras, dMinutos);
        }
        return registro;
    }


}
