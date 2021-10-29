/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musik.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

        
/**
 *
 * @author PedroJorqueraHoyas
 */
public class CancionSugerida {
    private Date fecha;
    private int reproducciones;
    private String nombreCancion;
    public CancionSugerida() {
    }

    public CancionSugerida(Date fecha, int reproducciones, String nombreCancion) {
        this.fecha = fecha;
        this.reproducciones = reproducciones;
        this.nombreCancion = nombreCancion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }
    
    
}
