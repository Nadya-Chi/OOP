package domain;

public class MenuPost {
    private int canPin;
    private int canDelete;
    private int canEdit;

    public int getCanPin() {
        return canPin;
    }
    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }
    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }
    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }
}
