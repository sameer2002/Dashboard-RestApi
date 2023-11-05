package com.example.projectapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class dashboard {
    @Id
    private ObjectId id;
    private Integer endYear;
    private String city;
    private Double cityLng;
    private Double cityLat;
    private Integer intensity;
    private String sector;
    private String topic;
    private String insight;
    private String swot;
    private String url;
    private String region;
    private Integer startYear;
    private Integer impact;
    private String added;
    private String published;
    private String country;
    private Integer relevance;
    private String pestle;
    private String source;
    private String title;
    private Integer likelihood;
}
