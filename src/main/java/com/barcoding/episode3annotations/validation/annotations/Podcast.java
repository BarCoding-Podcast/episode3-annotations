package com.barcoding.episode3annotations.validation.annotations;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

public class Podcast {

  @NotNull(message = "should always have a name")
  private String name;

  @NotEmpty(message = "should never be empty")
  @Size(min = 2, message = "should always have at least two participants")
  private List<String> participants;

  public Podcast(@NotNull String name, @NotEmpty @Size(min = 2) List<String> participants) {
    this.name = name;
    this.participants = participants;
  }

  public String getName() {
    return name;
  }

  public List<String> getParticipants() {
    return participants;
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
