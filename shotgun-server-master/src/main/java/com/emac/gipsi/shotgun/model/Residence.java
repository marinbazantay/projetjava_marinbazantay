package com.emac.gipsi.shotgun.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "Residence")
public class Residence {
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	
	@Column
	private String nomResidence;

	@OneToMany(fetch = FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinColumn(name = "shotgunResidence")
	private Set<Shotgun> listeShotguns = new HashSet<Shotgun>();

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nomResidence
	 */
	public String getNomResidence() {
		return nomResidence;
	}

	/**
	 * @param nomResidence
	 *            the nomResidence to set
	 */
	public void setNomResidence(String nomResidence) {
		this.nomResidence = nomResidence;
	}

	/**
	 * @return the listeShotguns
	 */
	public Set<Shotgun> getListeShotguns() {
		return listeShotguns;
	}

	/**
	 * @param listeShotguns
	 *            the listeShotguns to set
	 */
	public void setListeShotguns(Set<Shotgun> listeShotguns) {
		this.listeShotguns = listeShotguns;
	}
	
	public void addToResidence(Shotgun shotgun) {
		this.listeShotguns.add(shotgun);
		shotgun.setShotgunResidence(this);
	}
}