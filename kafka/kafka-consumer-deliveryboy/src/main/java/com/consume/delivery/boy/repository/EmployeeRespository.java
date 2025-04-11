package com.consume.delivery.boy.repository;

import com.consume.delivery.boy.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<EmployeeEntity, Integer> {
}
