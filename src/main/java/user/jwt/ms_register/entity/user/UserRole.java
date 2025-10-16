package user.jwt.ms_register.entity.user;

public enum UserRole {
    ADMIN("ADMIN"),
    USER("USER");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
