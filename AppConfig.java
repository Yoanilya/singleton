public class AppConfig {
    private static final AppConfig instance = new AppConfig();

    private String theme;
    private String language;

    private AppConfig() {
        this.theme = "Light";
        this.language = "EN";
    }

    public static AppConfig getInstance() {
        return instance;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void printConfig() {
        System.out.println("Theme: " + theme);
        System.out.println("Language: " + language);
    }
}