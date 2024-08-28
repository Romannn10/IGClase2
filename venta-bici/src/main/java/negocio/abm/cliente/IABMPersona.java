/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio.abm.cliente;

import modelo.persona.Persona;

/**
 *
 * @author Alumno
 */
public interface IABMPersona {
    
    public static final String ES_CLIENTE="cliente";
    public static final String ES_VENDEDOR="vendedor";
    
    public void altaPersona(Persona persona);
    
    public void bajaPersona(Persona persona);
    
    public void modificarDatosPersona(Persona persona);
    
    public void listarPersonas(String tipo);
   
    
}
