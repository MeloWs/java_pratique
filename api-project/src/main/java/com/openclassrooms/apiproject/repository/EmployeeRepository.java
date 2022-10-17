package com.openclassrooms.apiproject.repository;

import com.openclassrooms.apiproject.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // indique que la class est un bean et son role est de communiquer avec avec une source donnée
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
