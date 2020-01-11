package monEcole.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_matiere")
public class Matiere {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idmatiere;
	
	String nom;

	public Integer getIdmatiere() {
		return idmatiere;
	}

	public void setIdmatiere(Integer idmatiere) {
		this.idmatiere = idmatiere;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
