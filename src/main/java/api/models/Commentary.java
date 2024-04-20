package api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Commentary {

    public int id;

    public long time;

    public String message;
    public String status;
    public String visibilityStatus;

    public Object answerTo;
    public Object parentCommentId;
    public Object childrenComments;

    public Attributes attributes;

    public Owner owner;

    public Likes likes;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Owner {

        public int id;
        public int userId;
        public int level;
        public int rating;

        public String key;
        public String pictureUrl;
        public String displayName;
        public String publicStatus;

        public Object position;
        public Object job;
        public Object country;
        public Object city;
        public Object publicStatusMessage;
        public Object isFriend;
        public Object subscription;
        public Object badge;
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

        public boolean answer;
        public boolean useful;
    }
}
