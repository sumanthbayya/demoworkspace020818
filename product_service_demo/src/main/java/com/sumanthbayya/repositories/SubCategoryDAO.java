package com.sumanthbayya.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sumanthbayya.entities.Master_Category;
import com.sumanthbayya.entities.Master_SubCategory;

@Transactional
@Repository
public interface SubCategoryDAO extends CrudRepository<Master_SubCategory, Long> {

	
	List<Master_SubCategory> findByMasterSubCategoryIdAndCategory(Long masterSubCategoryId,Master_Category category);
	
	List<Master_SubCategory> findByCategory(Master_Category category);
}
