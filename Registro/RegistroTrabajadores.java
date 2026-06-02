package Registro;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RegistroTrabajadores {


    public void registrarTrabajador(RegistrarTiempo tiempo) {
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formatoDeFecha = DateTimeFormatter.ofPattern("dd_MM_yyyy");
        String fechaStr = formatoDeFecha.format(fecha);

        String nombreArchivo;
        if(tiempo.getIngreso()){
            nombreArchivo = "Ingreso_Empleados_Fecha_ " + fechaStr + ".txt";
        }else {
            nombreArchivo = "Salida_Empleados_Fecha_ " + fechaStr + ".txt";
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo,true))){
            bw.write(tiempo.logica());
            bw.newLine();
            System.out.println("Registro de trabajadores guardado en: " + nombreArchivo);

        }catch(IOException e){
            System.out.println("Error al guardar registro de trabajadores: " + e.getMessage());
        }
    }
}
