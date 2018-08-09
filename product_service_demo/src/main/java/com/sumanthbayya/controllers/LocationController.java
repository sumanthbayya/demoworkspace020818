package com.sumanthbayya.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sumanthbayya.services.CategoryService;
import com.sumanthbayya.services.CommonService;
import com.sumanthbayya.services.DepartmentService;
import com.sumanthbayya.services.LocationService;
import com.sumanthbayya.services.SubCategoryService;
import com.sumanthbayya.vo.CategoryVo;
import com.sumanthbayya.vo.DepartmentVo;
import com.sumanthbayya.vo.LocationVo;
import com.sumanthbayya.vo.SubCategoryVo;

@RestController
@RequestMapping(value = "v1/location")
public class LocationController {

	@Autowired
	LocationService locationService;
	
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	SubCategoryService subCategoryService;
	
	@Autowired
	CommonService commonService;

	@RequestMapping(method = RequestMethod.GET)
	public List<LocationVo> getAllLocations() {
		return locationService.getLocations();
	}

	@RequestMapping(value = "{id}/department", method = RequestMethod.GET)
	public LocationVo getOneLocation(@PathVariable Long id) {
		return locationService.getLocationById(id);
	}

	@RequestMapping(value = "{id}/department", method = RequestMethod.DELETE)
	public String deleteLocation(@PathVariable String id) {
		return locationService.deleteLocation(id);
	}
	
	
	@RequestMapping(value = "{location_id}/department/{department_id}/category", method = RequestMethod.GET)
	public List<DepartmentVo> getOneDepartment(@PathVariable String location_id,@PathVariable String department_id) {
		return departmentService.getDepartmentByLocation(location_id,department_id);
	}
	
	@RequestMapping(value = "{location_id}/department/{department_id}/category", method = RequestMethod.DELETE)
	public void deleteDepartment(@PathVariable String location_id,@PathVariable String department_id) {
		departmentService.deleteDepartmentByLocation(department_id);
	}
	//new - done
	@RequestMapping(value = "{location_id}/department/{department_id}/category/{category_id}/subcategory", method = RequestMethod.GET)
	public List<CategoryVo> getOneCategory(@PathVariable String location_id,@PathVariable String department_id,@PathVariable String category_id) {
		return categoryService.getCategoryByDepartmentAndLocation(location_id,department_id,category_id);
	}
	
	@RequestMapping(value = "{location_id}/department/{department_id}/category/{category_id}/subcategory", method = RequestMethod.DELETE)
	public void deleteCategory(@PathVariable String location_id,@PathVariable String department_id,@PathVariable String category_id) {
		categoryService.deleteCategoryByDepartmentAndLocation(category_id);
	
	}
	//new2
	@RequestMapping(value = "{location_id}/department/{department_id}/category/{category_id}/subcategory/{subcategory_id}", method = RequestMethod.GET)
	public List<SubCategoryVo> getOneSubCategory(@PathVariable String location_id,@PathVariable String department_id,@PathVariable String category_id,@PathVariable String subcategory_id) {
		return subCategoryService.getSubCategoryByCategoryAndDepartmentAndLocation(location_id,department_id,category_id,subcategory_id);
	}
	
	@RequestMapping(value = "{location_id}/department/{department_id}/category/{category_id}/subcategory/{subcategory_id}", method = RequestMethod.DELETE)
	public void deleteSubCategory(@PathVariable String location_id,@PathVariable String department_id,@PathVariable String category_id,@PathVariable String subcategory_id) {
		subCategoryService.deleteSubCategoryByCategoryAndDepartmentAndLocation(subcategory_id);
	
	}

	@RequestMapping(value = "/addLocations", method = RequestMethod.POST)
	public String addLocations(@RequestBody List<LocationVo> locationList) {
		return locationService.addLocations(locationList);
	}
	
	@RequestMapping(value = "/updateLocations", method = RequestMethod.POST)
	public String updateLocations(@RequestBody List<LocationVo> locationList) {
		return locationService.updateLocations(locationList);
	}

	@RequestMapping(value = "{id}/{name}/{description}/{active}/department", method = RequestMethod.PUT)
	public String putLocations(@PathVariable Long id, @PathVariable String name, @PathVariable String description,@PathVariable String active) {
		return locationService.updateLocation(id, name, description, active);
	}

}
