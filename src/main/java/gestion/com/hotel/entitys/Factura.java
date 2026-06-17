package gestion.com.hotel.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id_factura;

    @Column(name = "id_reserva", nullable = false, unique = true)
    private Long id_reserva;

    @Column(name = "monto_total", nullable = false)
    private Double monto_total;

    @Column(name = "fecha_emision", nullable = false)
    private String fecha_emision;

    @Column(name = "estado", nullable = false)
    private String estado;

    public Factura() {

    }
}
