package com.emac.gipsi.shotgun.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emac.gipsi.shotgun.dto.ResidenceDto;
import com.emac.gipsi.shotgun.dto.ResidenceShotgunDto;
import com.emac.gipsi.shotgun.services.IResidenceService;

@CrossOrigin
@RequestMapping("/residences")
@RestController
public class ResidenceController {
	
	@Autowired
	private IResidenceService residenceService;

	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<ResidenceShotgunDto> getResidence() {
		return this.residenceService.getResidences();
	}
	
	@RequestMapping(path = "/shotguns", method = RequestMethod.GET)
	public List<ResidenceDto> getResidencesWithShotguns() {
		return this.residenceService.getResidencesWithShotguns();
	}
}
