package entities;

/**
 * Created by icarusvolans on 11/21/16.
 */
public class Owner {
    private Long ownerId; //- notice this is an object wrapper, not a primitive
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Owner(Long ownerId, String firstName, String lastName, String phone, String address) {
        this.ownerId = ownerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public Owner() {
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
