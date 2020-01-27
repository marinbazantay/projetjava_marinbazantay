package com.emac.gipsi.shotgun.dto;

import java.util.List;

public class ResidenceDto {
	private int id;
	private String nomResidence;
	private List<ShotgunDto> listeShotguns;

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
	public List<ShotgunDto> getListeShotguns() {
		return listeShotguns;
	}

	/**
	 * @param listeShotguns
	 *            the listeShotguns to set
	 */
	public void setListeShotguns(List<ShotgunDto> listeShotguns) {
		this.listeShotguns = listeShotguns;
	}
}

