package com.sumanthbayya.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sumanthbayya.entities.Master_Department;
import com.sumanthbayya.entities.Master_Location;

@Transactional
@Repository
public interface DepartmentDAO extends CrudRepository<Master_Department, Long>{
	
	List<Master_Department> findByMasterDepartmentIdAndLocation(Long masterDepartmentId,Master_Location location);
	
	@Modifying
	@Query("delete FROM Master_Department t where t.masterDepartmentId = :#{#masterDepartmentId}") 
    void deleteDepatmentObjectManual(@Param("masterDepartmentId") Long masterDepartmentId);

}
