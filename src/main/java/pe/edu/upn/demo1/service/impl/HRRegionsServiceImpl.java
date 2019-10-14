package pe.edu.upn.demo1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo1.entity.HRRegions;
import pe.edu.upn.demo1.repository.HRRegionsRepository;
import pe.edu.upn.demo1.service.HRRegionsService;

public class HRRegionsServiceImpl implements HRRegionsService {
	
	@Autowired
	private HRRegionsRepository hrregionsrepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<HRRegions> findAll() throws Exception {
		
		return hrregionsrepository.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<HRRegions> findById(Integer id) throws Exception {
		
		return hrregionsrepository.findById(id);
	}

	@Transactional
	@Override
	public HRRegions save(HRRegions entity) throws Exception {
		
		return hrregionsrepository.save(entity);
	}
	
	@Transactional
	@Override
	public HRRegions update(HRRegions entity) throws Exception {
		
		return hrregionsrepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		hrregionsrepository.deleteById(id);
		
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		hrregionsrepository.deleteAll();
		
	}

}
