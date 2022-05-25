package net.javaguides.springbootbackend.repository;

//Repository interface
import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.springbootbackend.model.Employee;
import org.springframework.stereotype.Repository;


//JpaRepository exposes database call methods(Save, FindById, DeleteById, pagination, etc) Provides automatically for all of
//the methods so we do not need to write any of it.

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

R

}
