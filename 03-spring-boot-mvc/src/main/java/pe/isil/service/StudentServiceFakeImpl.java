package pe.isil.service;

import org.springframework.stereotype.Service;
import pe.isil.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("StudentServiceFake")
public class StudentServiceFakeImpl implements StudentService{

    List<Student> studentList = new ArrayList<>(
            Arrays.asList(
                    new Student("12345678", "Jose", "Ventura", 28),
                    new Student("00012345", "Juan", "Perez", 40)
            )
    );

    @Override
    public void create(Student student) {
        studentList.add(student);
    }

    @Override
    public Student read(String documentNumber) {

        Student student = studentList.stream()
                .filter(s -> documentNumber.equals(s.getDocumentNumber()))
                .findFirst()
                .orElseGet(null);

        return student;
    }

    @Override
    public void update(Student student) {

        Student currentStudent = read(student.getDocumentNumber());

        if (currentStudent != null){
            int index = studentList.indexOf(currentStudent);
            studentList.set(index, student);
        }

    }

    @Override
    public void delete(String documentNumber) {
        Student student = read(documentNumber);
        studentList.remove(student);
    }

    @Override
    public List<Student> all() {
        return studentList;
    }
}
