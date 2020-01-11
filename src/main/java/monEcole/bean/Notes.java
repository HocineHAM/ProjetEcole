package monEcole.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_notes")
public class Notes {
	@Column(name = "idnotes")
	private Integer id;
	private Date date_saisie;
	@ManyToOne
	private Integer ideleve;
	private Integer idmatiere;
	private Integer idprof;
	private Integer idtrimestre;
	private Integer note;
	private String avis;
	private float avancement;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate_saisie() {
		return date_saisie;
	}

	public void setDate_saisie(Date date_saisie) {
		this.date_saisie = date_saisie;
	}

	public Integer getIdeleve() {
		return ideleve;
	}

	public void setIdeleve(Integer ideleve) {
		this.ideleve = ideleve;
	}

	public Integer getIdmatiere() {
		return idmatiere;
	}

	public void setIdmatiere(Integer idmatiere) {
		this.idmatiere = idmatiere;
	}

	public Integer getIdprof() {
		return idprof;
	}

	public void setIdprof(Integer idprof) {
		this.idprof = idprof;
	}

	public Integer getIdtrimestre() {
		return idtrimestre;
	}

	public void setIdtrimestre(Integer idtrimestre) {
		this.idtrimestre = idtrimestre;
	}

	public Integer getNote() {
		return note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}

	public String getAvis() {
		return avis;
	}

	public void setAvis(String avis) {
		this.avis = avis;
	}

	public float getAvancement() {
		return avancement;
	}

	public void setAvancement(float avancement) {
		this.avancement = avancement;
	}

}
