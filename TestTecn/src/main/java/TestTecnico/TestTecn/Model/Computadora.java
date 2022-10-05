package TestTecnico.TestTecn.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="computadora")
public class Computadora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idComputadora;
	@Column
	private  String tipoComputadora;
	@Column
	private int ramGB;
	@Column
	private int almacenamientoGB;
	@Column
	private String SistemOpetativo;
	@Column
	private String Color;
	public int getIdComputadora() {
		return idComputadora;
	}
	public void setIdComputadora(int idComputadora) {
		this.idComputadora = idComputadora;
	}
	public String getTipoComputadora() {
		return tipoComputadora;
	}
	public void setTipoComputadora(String tipoComputadora) {
		this.tipoComputadora = tipoComputadora;
	}
	public int getRamGB() {
		return ramGB;
	}
	public void setRamGB(int ramGB) {
		this.ramGB = ramGB;
	}
	public int getAlmacenamientoGB() {
		return almacenamientoGB;
	}
	public void setAlmacenamientoGB(int almacenamientoGB) {
		this.almacenamientoGB = almacenamientoGB;
	}
	public String getSistemOpetativo() {
		return SistemOpetativo;
	}
	public void setSistemOpetativo(String sistemOpetativo) {
		SistemOpetativo = sistemOpetativo;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	
	

}
