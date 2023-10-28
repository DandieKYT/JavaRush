package api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Commentary {

    public int id;
    public long time;
    public String message, status, visibilityStatus;

    public Object answerTo, parentCommentId, childrenComments;
    public Attributes attributes;
    public Owner owner;

    public Likes likes;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Owner {
        public int id, userId, level, rating;
        public String key, pictureUrl, displayName, publicStatus;
        public Object position, job, country, city, publicStatusMessage,
                isFriend, subscription, badge;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Likes {
        public int count;
        public Object status;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Attributes {
        public boolean answer, useful;
    }
}
