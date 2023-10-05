package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Games {
    public int id, preferredUserLevel, tasksCompleted,
            tasksTotal;
    public String key, title, description, content, taskKey, iconUrl,
            coverUrl, pictureUrl, appCoverUrl, videoUrl, status, visibilityStatus;
    public Object appId;
}
