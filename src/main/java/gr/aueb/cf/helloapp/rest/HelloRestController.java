package gr.aueb.cf.helloapp.rest;

import gr.aueb.cf.helloapp.dto.TeacherReadOnlyDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Objects;

@Controller
@RequestMapping("/hello")
public class HelloRestController {


    @GetMapping("/coding-factory")
    public String sayHello() {
        return "Hello Coding Factory !";
    }

    public ResponseEntity<TeacherReadOnlyDTO> getOneTeacher(@PathVariable("id") Long id) {
        TeacherReadOnlyDTO readOnlyDTO = new TeacherReadOnlyDTO(1L, "Αθανασιος", "Ανδρουτσος");

        if(Objects.equals(id, 1L)) {
            return new ResponseEntity<>(readOnlyDTO, HttpStatus.OK);
        } else {
            return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
