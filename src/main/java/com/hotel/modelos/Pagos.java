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


@Entity(name="pagos")
public class Pagos implements Serializable {

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
    private String tipopago;
    @Column(nullable=false, length=16)
    private String numtarjeta;
    @Column(nullable=false, length=10)
    private String fechavencimiento;
    @Column(nullable=false, precision=10)
    private int numseguridad;
    @ManyToOne(optional=false)
    @JoinColumn(name="idusuario", nullable=false)
    private Usuario usuario;

    /** Default constructor. */
    public Pagos() {
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
     * Access method for tipopago.
     *
     * @return the current value of tipopago
     */
    public String getTipopago() {
        return tipopago;
    }

    /**
     * Setter method for tipopago.
     *
     * @param aTipopago the new value for tipopago
     */
    public void setTipopago(String aTipopago) {
        tipopago = aTipopago;
    }

    /**
     * Access method for numtarjeta.
     *
     * @return the current value of numtarjeta
     */
    public String getNumtarjeta() {
        return numtarjeta;
    }

    /**
     * Setter method for numtarjeta.
     *
     * @param aNumtarjeta the new value for numtarjeta
     */
    public void setNumtarjeta(String aNumtarjeta) {
        numtarjeta = aNumtarjeta;
    }

    /**
     * Access method for fechavencimiento.
     *
     * @return the current value of fechavencimiento
     */
    public String getFechavencimiento() {
        return fechavencimiento;
    }

    /**
     * Setter method for fechavencimiento.
     *
     * @param aFechavencimiento the new value for fechavencimiento
     */
    public void setFechavencimiento(String aFechavencimiento) {
        fechavencimiento = aFechavencimiento;
    }

    /**
     * Access method for numseguridad.
     *
     * @return the current value of numseguridad
     */
    public int getNumseguridad() {
        return numseguridad;
    }

    /**
     * Setter method for numseguridad.
     *
     * @param aNumseguridad the new value for numseguridad
     */
    public void setNumseguridad(int aNumseguridad) {
        numseguridad = aNumseguridad;
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
     * Compares the key for this instance with another Pagos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Pagos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Pagos)) {
            return false;
        }
        Pagos that = (Pagos) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Pagos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Pagos)) return false;
        return this.equalKeys(other) && ((Pagos)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Pagos |");
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
