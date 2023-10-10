/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S11_09.S11_09_E01;

/**
 *
 * @author Lab18
 */
public class Main_S11_09_E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante_09_E01 estudiante = new Estudiante_09_E01("Juan", 20, "Universidad X");
        Empleado_09_E01 empleado = new Empleado_09_E01("María", 30, "Empresa Y");
        Jubilado_09_E01 jubilado = new Jubilado_09_E01("Pedro", 65, 2000);

        estudiante.saludar();
        estudiante.estudiar();

        empleado.saludar();
        empleado.trabajar();

        jubilado.saludar();
        jubilado.jubilacion();
    }
    
}
