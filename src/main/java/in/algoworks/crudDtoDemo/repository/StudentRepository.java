package in.algoworks.crudDtoDemo.repository;

import in.algoworks.crudDtoDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
