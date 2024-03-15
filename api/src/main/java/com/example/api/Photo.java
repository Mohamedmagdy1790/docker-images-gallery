package com.example.api;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Photo {
    private String id;
    private String slug;
    private String createdAt;
    private String updatedAt;
    private Integer width;
    private Integer height;
    private String color;
    private String blurHash;
    private String description;
    private String altDescription;

    @JsonProperty("urls")
    private Urls urls;

    @JsonProperty("user")
    private User user;
@JsonIgnore
    private Exif exif;
    @JsonIgnore

    private Location location;
    @JsonIgnore

    private Boolean publicDomain;
    @JsonIgnore

    private Tag[] tags;

    // Getters and setters
}
@Getter
class Urls {
    private String raw;
    private String full;
    private String regular;
    private String small;
    private String thumb;
    private String smallS3;

    // Getters and setters
}
@Getter
class User {
    private String id;
    private String username;
    private String name;
    private String firstName;
    private String lastName;
    private String twitterUsername;
    private String portfolioUrl;
    private String bio;
    private String location;
    private ProfileImage profileImage;
    private String instagramUsername;
    private Integer totalCollections;
    private Integer totalLikes;
    private Integer totalPhotos;
    private Integer totalPromotedPhotos;
    private Boolean acceptedTos;
    private Boolean forHire;
    private Social social;

    // Getters and setters
}
@Getter

class ProfileImage {
    private String small;
    private String medium;
    private String large;

    // Getters and setters
}
@Getter

class Social {
    private String instagramUsername;
    private String portfolioUrl;
    private String twitterUsername;
    private String paypalEmail;

    // Getters and setters
}
@Getter

class Exif {
    private String make;
    private String model;
    private String exposureTime;
    private String aperture;
    private String focalLength;
    private Integer iso;

    // Getters and setters
}
@Getter

class Location {
    private String name;
    private String city;
    private String country;
    private Position position;

    // Getters and setters
}
@Getter

class Position {
    private Double latitude;
    private Double longitude;

    // Getters and setters
}
@Getter

class Tag {
    private String type;
    private String title;
    private Source source;

    // Getters and setters
}
@Getter

class Source {
    private Ancestry ancestry;
    private String title;
    private String subtitle;
    private String description;
    private CoverPhoto coverPhoto;

    // Getters and setters
}
@Getter

class Ancestry {
    private Type type;
    private Category category;
    private Subcategory subcategory;

    // Getters and setters
}
@Getter

class Type {
    private String slug;
    private String prettySlug;

    // Getters and setters
}

class Category {
    private String slug;
    private String prettySlug;

    // Getters and setters
}
@Getter

class Subcategory {
    private String slug;
    private String prettySlug;

    // Getters and setters
}
@Getter

class CoverPhoto {
    private String id;
    private String slug;
    private String createdAt;
    private String updatedAt;
    private String promotedAt;
    private Integer width;
    private Integer height;
    private String color;
    private String blurHash;
    private String description;
    private String altDescription;
    private Breadcrumb[] breadcrumbs;
    private Urls urls;
    private Links links;
    private Integer likes;
    private Boolean likedByUser;
    private Object[] currentUserCollections;
    private Object sponsorship;
    private TopicSubmissions topicSubmissions;
    private Boolean premium;
    private Boolean plus;
    private User user;

    // Getters and setters
}
@Getter

class Breadcrumb {
    private String slug;
    private String title;
    private Integer index;
    private String type;

    // Getters and setters
}
@Getter

class Links {
    private String self;
    private String html;
    private String download;
    private String downloadLocation;

    // Getters and setters
}
@Getter

class TopicSubmissions {
    private Object nature;

    // Getters and setters
}