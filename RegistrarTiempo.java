import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class RegistrarTiempo {

    private Funcionarios funcionario;
    private LocalDate fecha;
    private boolean ingreso;

    private static LocalTime horaIngreso = LocalTime.of(8,30);
    private static LocalTime horaSalida = LocalTime.of(17,0);

    public RegistrarTiempo(Funcionarios funcionario, LocalDate fecha, boolean ingreso) {
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





        if(tipoIngreso && fecha.isAfter(horaIngreso)){

        }

        if(!tipoIngreso && fecha.isAfter(horaSalida))

    }


}
