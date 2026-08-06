import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();  // Simplified
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);  // Fixed: use get(0) instead of pop()
    }

    public int count() {
        return languages.size();  // Fixed: corrected spelling of "return"
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);  // Simplified - use built-in method
    }

    public boolean isExciting() {
        // Returns true if Karl wants to learn Java OR Kotlin
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}