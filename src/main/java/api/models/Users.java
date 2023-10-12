package api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {

    public int id;

    public int userId;

    public String key;

    public String pictureUrl;

    public String displayName;

    public Object position;

    public Object job;

    public String country;

    public Object city;

    public int level;

    public int rating;

    public String publicStatus;

    public Object publicStatusMessage;
}
