// Generated with g9.

package com.hotel.modelos;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="reservacion")
public class Reservacion implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";

    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(nullable=false, length=10)
    private String telefono;
    @Column(nullable=false, precision=10)
    private int numadultos;
    @Column(nullable=false, precision=10)
    private int numninios;
    @Column(nullable=false, precision=10)
    private int nummascotas;
    @Column(nullable=false, length=15)
    private String tipohabitacion;
    @Column(nullable=false, precision=10)
    private int numhabitacion;
    @Column(nullable=false, length=10)
    private String fechaentrada;
    @Column(nullable=false, length=10)
    private String fechasalida;
    @ManyToOne(optional=false)
    @JoinColumn(name="idusuario", nullable=false)
    private Usuario usuario;

    /** Default constructor. */
    public Reservacion() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for telefono.
     *
     * @return the current value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Setter method for telefono.
     *
     * @param aTelefono the new value for telefono
     */
    public void setTelefono(String aTelefono) {
        telefono = aTelefono;
    }

    /**
     * Access method for numadultos.
     *
     * @return the current value of numadultos
     */
    public int getNumadultos() {
        return numadultos;
    }

    /**
     * Setter method for numadultos.
     *
     * @param aNumadultos the new value for numadultos
     */
    public void setNumadultos(int aNumadultos) {
        numadultos = aNumadultos;
    }

    /**
     * Access method for numninios.
     *
     * @return the current value of numninios
     */
    public int getNumninios() {
        return numninios;
    }

    /**
     * Setter method for numninios.
     *
     * @param aNumninios the new value for numninios
     */
    public void setNumninios(int aNumninios) {
        numninios = aNumninios;
    }

    /**
     * Access method for nummascotas.
     *
     * @return the current value of nummascotas
     */
    public int getNummascotas() {
        return nummascotas;
    }

    /**
     * Setter method for nummascotas.
     *
     * @param aNummascotas the new value for nummascotas
     */
    public void setNummascotas(int aNummascotas) {
        nummascotas = aNummascotas;
    }

    /**
     * Access method for tipohabitacion.
     *
     * @return the current value of tipohabitacion
     */
    public String getTipohabitacion() {
        return tipohabitacion;
    }

    /**
     * Setter method for tipohabitacion.
     *
     * @param aTipohabitacion the new value for tipohabitacion
     */
    public void setTipohabitacion(String aTipohabitacion) {
        tipohabitacion = aTipohabitacion;
    }

    /**
     * Access method for numhabitacion.
     *
     * @return the current value of numhabitacion
     */
    public int getNumhabitacion() {
        return numhabitacion;
    }

    /**
     * Setter method for numhabitacion.
     *
     * @param aNumhabitacion the new value for numhabitacion
     */
    public void setNumhabitacion(int aNumhabitacion) {
        numhabitacion = aNumhabitacion;
    }

    /**
     * Access method for fechaentrada.
     *
     * @return the current value of fechaentrada
     */
    public String getFechaentrada() {
        return fechaentrada;
    }

    /**
     * Setter method for fechaentrada.
     *
     * @param aFechaentrada the new value for fechaentrada
     */
    public void setFechaentrada(String aFechaentrada) {
        fechaentrada = aFechaentrada;
    }

    /**
     * Access method for fechasalida.
     *
     * @return the current value of fechasalida
     */
    public String getFechasalida() {
        return fechasalida;
    }

    /**
     * Setter method for fechasalida.
     *
     * @param aFechasalida the new value for fechasalida
     */
    public void setFechasalida(String aFechasalida) {
        fechasalida = aFechasalida;
    }

    /**
     * Access method for usuario.
     *
     * @return the current value of usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Setter method for usuario.
     *
     * @param aUsuario the new value for usuario
     */
    public void setUsuario(Usuario aUsuario) {
        usuario = aUsuario;
    }

    /**
     * Compares the key for this instance with another Reservacion.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Reservacion and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Reservacion)) {
            return false;
        }
        Reservacion that = (Reservacion) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Reservacion.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Reservacion)) return false;
        return this.equalKeys(other) && ((Reservacion)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Reservacion |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
