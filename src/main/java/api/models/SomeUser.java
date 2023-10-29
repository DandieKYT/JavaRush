package api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SomeUser {

    public int id;

    public String key;
    public String referenceKey;
    public String type;
    public String title;
    public String description;
    public String content;
    public String visibilityStatus;
    public String language;

    public Users user;
}
