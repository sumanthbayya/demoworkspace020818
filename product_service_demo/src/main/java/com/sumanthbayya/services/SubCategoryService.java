package com.sumanthbayya.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sumanthbayya.vo.DepartmentVo;

@Service
public class SubCategoryService {

	private static final Logger LOG = LoggerFactory.getLogger(SubCategoryService.class);

	public List<DepartmentVo> getSubCategoryByCategoryAndDepartmentAndLocation(String location_id, String department_id,
			String category_id, String subcategory_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteSubCategoryByCategoryAndDepartmentAndLocation(String subcategory_id) {
		// TODO Auto-generated method stub
		
	}
}
