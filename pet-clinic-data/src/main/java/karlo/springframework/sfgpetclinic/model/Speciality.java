package karlo.springframework.sfgpetclinic.model;

public class Speciality extends BaseEntity {

    public String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
