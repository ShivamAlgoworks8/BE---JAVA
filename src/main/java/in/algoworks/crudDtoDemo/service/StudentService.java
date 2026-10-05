package in.algoworks.crudDtoDemo.service;

import in.algoworks.crudDtoDemo.entity.Student;
import in.algoworks.crudDtoDemo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student createStudent(Student studentReq) {


        return studentRepository.save(studentReq);
    }
}