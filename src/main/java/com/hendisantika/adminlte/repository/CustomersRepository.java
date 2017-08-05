package com.hendisantika.adminlte.repository;

import com.hendisantika.adminlte.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
