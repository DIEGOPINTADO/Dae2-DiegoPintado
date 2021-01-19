package pe.isil.service;

import pe.isil.model.Student;

import java.util.List;

public interface StudentService {

    void create(Student student);
    Student read(String documentNumber);
    void update(Student student);
    void delete(String documentNumber);

    List<Student> all();

}
