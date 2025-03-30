package api.reqresMy;

public class UserData {
    private Integer id;
    private String email;
    private String first_naprivateme;
    private String last_name;
    private String avatar;

    public UserData(Integer id, String email, String first_naprivateme, String last_name, String avatar) {
        this.id = id;
        this.email = email;
        this.first_naprivateme = first_naprivateme;
        this.last_name = last_name;
        this.avatar = avatar;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_naprivateme() {
        return first_naprivateme;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getAvatar() {
        return avatar;
    }
}
