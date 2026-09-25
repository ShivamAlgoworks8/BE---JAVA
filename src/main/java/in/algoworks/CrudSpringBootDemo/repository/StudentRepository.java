package in.algoworks.CrudSpringBootDemo.repository;

import in.algoworks.CrudSpringBootDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}