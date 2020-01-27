package com.emac.gipsi.shotgun.dto;

import java.util.List;

import com.emac.gipsi.shotgun.model.Shotgun;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class ResidenceShotgunDto {
	private int	id;
    private String nomResidence;

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
}

