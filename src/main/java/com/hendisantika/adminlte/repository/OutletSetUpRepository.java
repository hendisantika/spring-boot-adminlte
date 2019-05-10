package com.hendisantika.adminlte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hendisantika.adminlte.model.OutletSetUp;

@Repository
public interface OutletSetUpRepository extends JpaRepository<OutletSetUp, Long>{

}
