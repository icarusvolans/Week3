package entities;
import java.time.LocalDate;
/**
 * Created by icarusvolans on 11/21/16.
 */
public class Pet {
    public static enum PetType { DOG, CAT, FISH, BIRD };
    private Long petId;
    private String name;
    private LocalDate dob;
    private PetType petType;
    private Long ownerId;

    public Pet(Long petId, String name, LocalDate dob, PetType petType, Long ownerId) {
        this.petId = petId;
        this.name = name;
        this.dob = dob;
        this.petType = petType;
        this.ownerId = ownerId;
    }

    public Pet() {
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }


}
