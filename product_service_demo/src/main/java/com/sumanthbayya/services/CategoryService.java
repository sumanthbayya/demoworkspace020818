package com.sumanthbayya.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sumanthbayya.vo.DepartmentVo;

@Service
public class CategoryService {
	private static final Logger LOG = LoggerFactory.getLogger(CategoryService.class);

	public List<DepartmentVo> getCategoryByDepartmentAndLocation(String location_id, String department_id,
			String category_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCategoryByDepartmentAndLocation(String category_id) {
		// TODO Auto-generated method stub
		
	}
}
