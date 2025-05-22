package gr.aueb.cf.helloapp.dto;

public record TeacherReadOnlyDTO(Long id, String firstname, String lastname) {

    public TeacherReadOnlyDTO() {
        this(null, "", "");
    }
}
