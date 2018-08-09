package com.sumanthbayya.services;

import java.util.ArrayList;
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
import com.sumanthbayya.vo.CategoryVo;
import com.sumanthbayya.vo.DepartmentVo;
import com.sumanthbayya.vo.LocationVo;

@Service
public class CategoryService {
	private static final Logger LOG = LoggerFactory.getLogger(CategoryService.class);
	
	@Autowired
	LocationDAO locationDao;
	
	@Autowired
	DepartmentDAO departmentDAO;
	
	@Autowired
	CategoryDAO categoryDao;
	
	@Autowired
	CommonService commonService;
	

	public List<CategoryVo> getCategoryByDepartmentAndLocation(String location_id, String department_id,String category_id) {
	LOG.info("Getting locations and department wise categories");
		List<Master_Category> catDBData = new ArrayList<>();
		List<Master_Department> depsByLocationList = commonService.getDepartmentsByLocationId(Long.valueOf(location_id));
		for (Master_Department master_Department : depsByLocationList) {
			categoryDao.findByMasterCategoryIdAndDepartment(Long.valueOf(category_id),master_Department);
			for (Master_Category master_category : categoryDao.findByMasterCategoryIdAndDepartment(Long.valueOf(category_id),master_Department)) {
				catDBData.add(master_category);
			}
		}
		List<CategoryVo> uiDepVo  = new ArrayList<>();
		for (Master_Category master_Category : catDBData) {
			CategoryVo cvo = new CategoryVo();
			cvo.setActiveFlag(master_Category.getMasterCatActiveFlag());
			cvo.setCategoryDesc(master_Category.getMasterCategoryDesc());
			cvo.setCategoryId(master_Category.getMasterCategoryId());
			cvo.setCategoryName(master_Category.getMasterCategoryName());
			cvo.setDepartmentId(master_Category.getDepartment().getMasterDepartmentId());
			cvo.setDepartmentName(master_Category.getDepartment().getMasterDepartmentName());
			cvo.setLocationId(master_Category.getDepartment().getLocation().getMasterLocationId());
			cvo.setLocationName(master_Category.getDepartment().getLocation().getMasterLocationName());
			uiDepVo.add(cvo);
		}
		
		return uiDepVo;
	}

	public void deleteCategoryByDepartmentAndLocation(String category_id) {

		categoryDao.deleteById(Long.valueOf(category_id));
	}
	
	
	
	
	
	
	
	
}
