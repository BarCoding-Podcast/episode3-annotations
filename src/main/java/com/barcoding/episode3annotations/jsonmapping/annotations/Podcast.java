package com.barcoding.episode3annotations.jsonmapping.annotations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Podcast {

  @JsonIgnore // do not expose this property
  private String id;

  private String name;

  @JsonProperty("authors") // can be used if the name in the JSON is different
  private List<String> participants;

  @JsonFormat(
      shape = JsonFormat.Shape.STRING,
      pattern = "dd-MM-yyyy"
  )
  private Date releaseDate;


  public Podcast(String id, String name, List<String> participants, Date releaseDate) {
    this.id = id;
    this.name = name;
    this.participants = participants;
    this.releaseDate = releaseDate;
  }

  public Podcast() {
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<String> getParticipants() {
    return participants;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setParticipants(List<String> participants) {
    this.participants = participants;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  @Override
  public String toString() {
    return "Podcast{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", participants=" + participants +
        ", releaseDate=" + releaseDate +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Podcast podcast = (Podcast) o;
    return Objects.equals(id, podcast.id) &&
        Objects.equals(name, podcast.name) &&
        Objects.equals(participants, podcast.participants) &&
        Objects.equals(releaseDate, podcast.releaseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, releaseDate);
  }
}
