package com.emac.gipsi.shotgun.services.impl;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emac.gipsi.shotgun.dto.ResidenceDto;
import com.emac.gipsi.shotgun.dto.ResidenceShotgunDto;
import com.emac.gipsi.shotgun.model.Residence;
import com.emac.gipsi.shotgun.repositories.ResidenceRepository;
import com.emac.gipsi.shotgun.services.IResidenceService;

@Service("residenceService")
@Transactional
public class ResidenceService implements IResidenceService {

	@Autowired
	private ResidenceRepository residenceRepository;
	
	private final ModelMapper modelMapper = new ModelMapper();

	public ResidenceService(ResidenceRepository residenceRepository) {
		this.residenceRepository = residenceRepository;
	}

	@Override
	public List<ResidenceShotgunDto> getResidences() {
		Type listType = new TypeToken<List<ResidenceShotgunDto>>() {}.getType();
		List<ResidenceShotgunDto> result = modelMapper.map(residenceRepository.findAll(), listType);
		return result;
	}

	@Override
	public ResidenceShotgunDto getResidence(int id) {
		Optional<Residence> residence = residenceRepository.findById(id);
		if (residence.isPresent()) {
			ResidenceShotgunDto result = new ResidenceShotgunDto();
			modelMapper.map(residence.get(), result);
			return result;
		}

		return null;
	}

	@Override
	public List<ResidenceDto> getResidencesWithShotguns() {
		Type listType = new TypeToken<List<ResidenceDto>>() {}.getType();
		List<ResidenceDto> result = modelMapper.map(residenceRepository.findAll(), listType);
		return result;
	}
}