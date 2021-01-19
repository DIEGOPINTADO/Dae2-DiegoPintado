package pe.isil.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

        log.info("students =>"+students);

        return "student";
    }


}
