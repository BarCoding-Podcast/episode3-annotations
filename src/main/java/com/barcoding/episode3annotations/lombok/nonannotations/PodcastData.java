package com.barcoding.episode3annotations.lombok.nonannotations;

import java.util.List;
import java.util.Objects;

public class PodcastData {
  private String name;
  private List<String> participants;

  public PodcastData(String name, List<String> participants) {
    this.name = name;
    this.participants = participants;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getParticipants() {
    return participants;
  }

  public void setParticipants(List<String> participants) {
    this.participants = participants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PodcastData that = (PodcastData) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(participants, that.participants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, participants);
  }
}
