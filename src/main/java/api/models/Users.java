package api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {

    public int id;
    public int userId;
    public int level;
    public int rating;

    public String key;
    public String pictureUrl;
    public String displayName;
    public String country;
    public String publicStatus;

    public Object position;
    public Object job;
    public Object city;
    public Object publicStatusMessage;
}
