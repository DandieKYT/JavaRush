package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {

    public int id,
            level,
            rating,
            userId;

    public String key,
            pictureUrl,
            displayName,
            country,
            city,
            publicStatus,
            position;

    public Object job,
            subscription,
            badge,
            publicStatusMessage;

    public boolean isFriend;

}
