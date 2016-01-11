package si.um.feri.obu.domain.model;

public class RegisterPermissionResponse {

    private boolean allowed;

    public RegisterPermissionResponse() {
    }

    public boolean isAllowed() {
        return allowed;
    }

    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }

    @Override
    public String toString() {
        return "RegisterPermissionResponse{" +
                "allowed=" + allowed +
                '}';
    }
}
