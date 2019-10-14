package pe.edu.upn.demo1.service.impl;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo1.entity.HRLocations;
import pe.edu.upn.demo1.repository.HRLocationsRepository;
import pe.edu.upn.demo1.service.HRLocationsService;

public class HRLocationsServiceImpl implements HRLocationsService{
	
	@Autowired
	private HRLocationsRepository hrlocationrepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<HRLocations> findAll() throws Exception {
		
		return hrlocationrepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<HRLocations> findById(Integer id) throws Exception {
		
		return hrlocationrepository.findById(id);
	}

	@Transactional
	@Override
	public HRLocations save(HRLocations entity) throws Exception {
		
		return hrlocationrepository.save(entity);
	}

	@Transactional
	@Override
	public HRLocations update(HRLocations entity) throws Exception {
		
		return hrlocationrepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		hrlocationrepository.deleteById(id);
		
	}
	
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		hrlocationrepository.deleteAll();
		
	}

}
