package com.sumanthbayya.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumanthbayya.entities.Master_Category;
import com.sumanthbayya.entities.Master_Department;
import com.sumanthbayya.entities.Master_Location;
import com.sumanthbayya.repositories.CategoryDAO;
import com.sumanthbayya.repositories.DepartmentDAO;
import com.sumanthbayya.repositories.LocationDAO;
import com.sumanthbayya.vo.LocationVo;

@Service
public class CommonService {
	private static final Logger LOG = LoggerFactory.getLogger(CommonService.class);

	@Autowired
	LocationDAO locationDao;
	
	@Autowired
	DepartmentDAO departmentDAO;
	
	@Autowired
	CategoryDAO categoryDao;
	
	//Helping methods for api services
	
		public Master_Category getCategoryByObjectId(Long id){
			Optional<Master_Category> masterCatObj = categoryDao.findById(id);
			return masterCatObj.get();
		}
	
		public LocationVo getLocationById(Long id){
			LOG.info("fetching location data with id"+id); 
			Optional<Master_Location> masterLoc=locationDao.findById(id);
			LocationVo getLocVo = new LocationVo();
			getLocVo.setId(masterLoc.get().getMasterLocationId());
			getLocVo.setLocationName(masterLoc.get().getMasterLocationName());
			getLocVo.setLocationDesc(masterLoc.get().getMasterLocationDesc());
			getLocVo.setActive(masterLoc.get().getMasterActiveFlag());
			return getLocVo;
		}
		
		public Master_Location getLocationObjectbyId(Long id){
			LOG.info("fetching location data with id"+id); 
			Optional<Master_Location> masterLoc=locationDao.findById(id);
			return masterLoc.get();
		}
		
		public Master_Department getDepartmentObjectById(Long id){
			LOG.info("fetching location data with id"+id); 
			Optional<Master_Department> masterDep=departmentDAO.findById(id);
			Master_Department masterDepSending = new Master_Department();
			masterDepSending.setLocation(masterDep.get().getLocation());
			masterDepSending.setMasterDepActiveFlag(masterDep.get().getMasterDepActiveFlag());
			masterDepSending.setMasterDepartmentDesc(masterDep.get().getMasterDepartmentDesc());
			masterDepSending.setMasterDepartmentId(masterDep.get().getMasterDepartmentId());
			masterDepSending.setMasterDepartmentName(masterDep.get().getMasterDepartmentName());
			return masterDepSending;
		}
		
		public List<Master_Department> getDepartmentsByLocationId(Long id){
			
			List<Master_Department> allDeps = departmentDAO.findByLocation(getLocationObjectbyId(id));
			
			return allDeps;
			
		}
}
