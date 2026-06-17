package gestion.com.hotel.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Habitacion {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id_habitacion;

    @Column(name = "id_hotel", nullable = false)
    private Long id_hotel;

    @Column(name = "id_categoria", nullable = false)
    private Long id_categoria;

    @Column(name = "numero", nullable = false, unique = true)
    private Integer numero;

    @Column(name = "piso", nullable = false)
    private Integer piso;

    @Column(name = "estado", nullable = false)
    
    private String estado;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "activo")
    private Boolean activo;


    public Habitacion() {
    }


    public Long getId_habitacion() {
        return id_habitacion;
    }


    public void setId_habitacion(Long id_habitacion) {
        this.id_habitacion = id_habitacion;
    }


    public Long getId_hotel() {
        return id_hotel;
    }


    public void setId_hotel(Long id_hotel) {
        this.id_hotel = id_hotel;
    }


    public Long getId_categoria() {
        return id_categoria;
    }


    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }


    public Integer getNumero() {
        return numero;
    }


    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    public Integer getPiso() {
        return piso;
    }


    public void setPiso(Integer piso) {
        this.piso = piso;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getObservaciones() {
        return observaciones;
    }


    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    public Boolean getActivo() {
        return activo;
    }


    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    
}
