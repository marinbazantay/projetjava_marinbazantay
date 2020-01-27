package com.emac.gipsi.shotgun.services;

import java.util.List;

import com.emac.gipsi.shotgun.dto.ResidenceShotgunDto;
import com.emac.gipsi.shotgun.dto.ResidenceDto;

public interface IResidenceService {
	public List<ResidenceShotgunDto> getResidences();
	
	public ResidenceShotgunDto getResidence(int id);
	
	public List<ResidenceDto> getResidencesWithShotguns();
}
