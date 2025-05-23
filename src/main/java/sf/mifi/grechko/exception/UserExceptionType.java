package sf.mifi.grechko.exception;

public enum UserExceptionType {
    LOGIN("login"),
    EMAIL("email"),
    PHONE("phone"),
    TELEGRAM("telegram"),
    ADMIN("role admin");

    private String description;

    UserExceptionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
