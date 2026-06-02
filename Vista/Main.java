package Vista;

import Funcionarios.Funcionarios;
import Registro.RegistrarTiempo;
import Registro.RegistroTrabajadores;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        RegistroTrabajadores registroTrabajadores = new RegistroTrabajadores();

      
        Funcionarios f1 = new Funcionarios("12.345.678-9", "Ana Silva");
        Funcionarios f2 = new Funcionarios("98.765.432-1", "Carlos Gómez");
        Funcionarios f3 = new Funcionarios("11.222.333-4", "Luisa Pérez");
        
    
        registroTrabajadores.registrarTrabajador(new RegistrarTiempo(f1, LocalTime.of(8, 15), true));
       
        registroTrabajadores.registrarTrabajador(new RegistrarTiempo(f2, LocalTime.of(8, 45), true));
  
        registroTrabajadores.registrarTrabajador(new RegistrarTiempo(f3, LocalTime.of(8, 30), true));
        
  
        registroTrabajadores.registrarTrabajador(new RegistrarTiempo(f1, LocalTime.of(17, 0), false));

        registroTrabajadores.registrarTrabajador(new RegistrarTiempo(f2, LocalTime.of(16, 30), false));
     
        registroTrabajadores.registrarTrabajador(new RegistrarTiempo(f3, LocalTime.of(18, 45), false));

    }
}