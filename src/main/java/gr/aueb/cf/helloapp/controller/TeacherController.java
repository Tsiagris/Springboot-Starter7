package gr.aueb.cf.helloapp.controller;

import gr.aueb.cf.helloapp.dto.TeacherInsertDTO;
import gr.aueb.cf.helloapp.dto.TeacherReadOnlyDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teachers")
public class TeacherController {

    @GetMapping("/insert")
    public String getTeacherForm(Model model) {
        model.addAttribute("teacherInsertDTO", new TeacherInsertDTO());
        return "teachers/insert";
    }
    @PostMapping("/insert")
    public String addTeacher(@ModelAttribute("teacherInsertDTO") TeacherInsertDTO teacherInsertDTO, Model model) {
        //validation
        //service.addTeacher
        TeacherReadOnlyDTO teacherReadOnlyDTO = new TeacherReadOnlyDTO(1L, "Aθανάσιος", "Ανδρούτσος");
        model.addAttribute("dto", teacherReadOnlyDTO);
        return "teachers/success";
    }

}
