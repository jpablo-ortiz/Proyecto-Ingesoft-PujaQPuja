package pujaQpuja.model.entities.otros;

import java.util.Objects;

import javafx.scene.image.ImageView;
import pujaQpuja.model.entities.Puja;

public class TablaCatalogoTemporal {
    private ImageView imagen;
    private String desc;
    private String estado;
    private Puja puja;
    private String mensajeNotificacion;

    public TablaCatalogoTemporal() {
    }

    public TablaCatalogoTemporal(ImageView imagen, String desc, Puja puja, String estado) {
        this.imagen = imagen;
        this.desc = desc;
        this.puja = puja;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ImageView getImagen() {
        return this.imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Puja getPuja() {
        return this.puja;
    }

    public void setPuja(Puja puja) {
        this.puja = puja;
    }

    public TablaCatalogoTemporal imagen(ImageView imagen) {
        setImagen(imagen);
        return this;
    }

    public TablaCatalogoTemporal desc(String desc) {
        setDesc(desc);
        return this;
    }

    public TablaCatalogoTemporal puja(Puja puja) {
        setPuja(puja);
        return this;
    }

    public TablaCatalogoTemporal puja(String  mensajeNotificacion) {
        setMensajeNotificacion(mensajeNotificacion);
        return this;
    }

    public String getMensajeNotificacion() {
        return mensajeNotificacion;
    }

    public void setMensajeNotificacion(String mensajeNotificacion) {
        this.mensajeNotificacion = mensajeNotificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TablaCatalogoTemporal)) {
            return false;
        }
        TablaCatalogoTemporal tablaCatalogoTemporal = (TablaCatalogoTemporal) o;
        return Objects.equals(imagen, tablaCatalogoTemporal.imagen) && Objects.equals(desc, tablaCatalogoTemporal.desc) && Objects.equals(puja, tablaCatalogoTemporal.puja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imagen, desc, puja);
    }

    @Override
    public String toString() {
        return "{" + " imagen='" + getImagen() + "'" + ", desc='" + getDesc() + "'" + ", puja='" + getPuja() + "'" + "}";
    }

}
