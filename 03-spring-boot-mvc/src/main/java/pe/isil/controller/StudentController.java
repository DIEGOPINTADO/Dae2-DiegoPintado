package pe.isil.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pe.isil.model.Student;
import pe.isil.service.StudentService;

import java.util.List;

@Slf4j
@Controller
public class StudentController {


    private StudentService studentService;

    @Autowired
    public StudentController( @Qualifier("StudentServiceFake") StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String getAllStudents(Model model){
        List<Student> students = studentService.all();
        model.addAttribute("students", students);
        return "student";
    }

    @GetMapping("/students/add")
    public String addStudent(Model model){
        model.addAttribute("student", new Student());
        return "student-add";
    }

    @PostMapping("/students/save")
    public String studentSave(Student student){
        studentService.create(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{documentNumber}")
    public String studentForUpdate(@PathVariable String documentNumber, Model model){
        Student currentStudent = studentService.read(documentNumber);
        model.addAttribute("student", currentStudent);
        return "student-edit";
    }

    @PostMapping("/students/update")
    public String studentUpdate(Student student){
        studentService.update(student);
        return "redirect:/students";
    }

    @GetMapping("/students/delete/{documentNumber}")
    public String studentDelete(@PathVariable String documentNumber){
        studentService.delete(documentNumber);
        return "redirect:/students";
    }

}
