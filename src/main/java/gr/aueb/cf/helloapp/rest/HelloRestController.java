package gr.aueb.cf.helloapp.rest;

import gr.aueb.cf.helloapp.dto.TeacherInsertDTO;
import gr.aueb.cf.helloapp.dto.TeacherReadOnlyDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.OutputKeys;
import java.util.Objects;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping("/coding-factory")
    public String sayHello() {
        return "Hello Coding Factory!";
    }

    @GetMapping("/teachers/{id}")
    public ResponseEntity<TeacherReadOnlyDTO> getOneTeacher(@PathVariable("id") Long id) {
        TeacherReadOnlyDTO readOnlyDTO = new TeacherReadOnlyDTO(1L, "Αθανάσιος", "Ανδρούτσος");

        if (Objects.equals(id, 1L)) {
            return new ResponseEntity<>(readOnlyDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/teachers")
    public ResponseEntity<TeacherReadOnlyDTO> addTeacher(@RequestBody TeacherInsertDTO insertDTO) {
        TeacherReadOnlyDTO readOnlyDTO = new TeacherReadOnlyDTO(1L, insertDTO.firstname(), insertDTO.lastname());
        return new ResponseEntity<>(readOnlyDTO, HttpStatus.CREATED);
    }
}
