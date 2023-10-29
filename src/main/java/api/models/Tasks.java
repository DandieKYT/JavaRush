package api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tasks {

    public int id;
    public int reward;
    public int totalSolved;
    public int level;
    public int lesson;

    public double rating;
    public double averageAttempt;

    public String key;
    public String type;
    public String pictureUrl;
    public String title;
    public String description;
    public String language;
    public String teacher;
    public String complexity;
    public String userStatus;

    public Tasks quest;

    public Object premiumRequired;
    public Object condition;
    public Object conditionHtml;
    public Object videoLink;
    public Object lectureKey;
}
