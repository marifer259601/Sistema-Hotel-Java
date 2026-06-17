package gestion.com.hotel.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id_reserva;

    @Column(name = "id_usuario", nullable = false)
    private Long id_usuario;

    @Column(name = "id_habitacion", nullable = false)   
    private Long id_habitacion;

    @Column(name = "fecha_inicio", nullable = false)
    private String fecha_inicio;

    @Column(name = "fecha_fin", nullable = false)
    private String fecha_fin;

    @Column(name = "estado", nullable = false)
    private String estado;

    public Reserva() {

    }
    public Long getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(Long id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Long getId_usuario() {
        return id_usuario;
    }   

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
    public Long getId_habitacion() {
        return id_habitacion;
    }
    public void setId_habitacion(Long id_habitacion) {
        this.id_habitacion = id_habitacion;
    }
    public String getFecha_inicio() {
        return fecha_inicio;
    }
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    public String getFecha_fin() {
        return fecha_fin;
    }
    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
