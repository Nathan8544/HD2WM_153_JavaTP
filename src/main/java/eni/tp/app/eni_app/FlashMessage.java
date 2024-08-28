package eni.tp.app.eni_app;

public class FlashMessage {

    public static final int TYPE_FLASH_SUCCESS = 0;
    public static final int TYPE_FLASH_ERROR = 1;

    public int type;
    public String message;

    public FlashMessage(int type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getTypeCssClass(){
        return switch (type) {
            case TYPE_FLASH_SUCCESS -> "uk-alert-success";
            case TYPE_FLASH_ERROR -> "uk-alert-danger";
            default -> "uk-alert-primary";
        };

    }
}
