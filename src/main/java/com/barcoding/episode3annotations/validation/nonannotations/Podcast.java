package com.barcoding.episode3annotations.validation.nonannotations;

import java.util.List;
import java.util.Objects;

public class Podcast {

  private String name;

  private List<String> participants;

  public Podcast(String name, List<String> participants) {
    this.name = name;
    this.participants = participants;
  }

  public String getName() {
    return name;
  }

  public List<String> getParticipants() {
    return participants;
  }


  public void validate() {


    if (this.name == null) {
      throw new PodcastValidationError("should always have a name");
    }

    if (this.participants.isEmpty()) {
      throw new PodcastValidationError("should never be empty");
    }

    if (this.participants.size() < 2) {
      throw new PodcastValidationError("should always have at least two participants");
    }
  }

  @Override
  public String toString() {
    return "Podcast{" +
        "name='" + name + '\'' +
        ", participants=" + participants +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Podcast podcast = (Podcast) o;
    return Objects.equals(name, podcast.name) &&
        Objects.equals(participants, podcast.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, participants);
  }
}
