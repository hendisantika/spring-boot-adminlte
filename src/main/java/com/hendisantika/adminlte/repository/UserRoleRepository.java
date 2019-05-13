package com.hendisantika.adminlte.repository;

import com.hendisantika.adminlte.model.UserRole;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

	@Modifying
	@Query("DELETE UserRole b WHERE b.user.id = ?1")
	void deleteByUserId(long userId);

	@Modifying(clearAutomatically = true)
	@Query("UPDATE UserRole u SET u.id =?1 WHERE u.role.id = ?2 and  u.user.id = ?3")
	void updateByUserRoleIdandRoleId(long urId, long rId,long uId);

	@Query("SELECT b FROM UserRole b WHERE b.user.id = ?1")
	Set<UserRole> findByUserId(long userId);
	
	

}
