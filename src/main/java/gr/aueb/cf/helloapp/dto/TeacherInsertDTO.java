package gr.aueb.cf.helloapp.dto;

public record TeacherInsertDTO (String firstname, String lastname){

    public TeacherInsertDTO() {
        this(null, null);
    }
}

