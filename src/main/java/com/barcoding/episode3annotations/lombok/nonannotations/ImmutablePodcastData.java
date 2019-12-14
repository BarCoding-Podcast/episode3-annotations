package com.barcoding.episode3annotations.lombok.nonannotations;

import java.util.List;

public final class ImmutablePodcastData {
  private final String name;
  private final List<String> participants;

  public ImmutablePodcastData(String name, List<String> participants) {
    this.name = name;
    this.participants = participants;
  }

  public String getName() {
    return name;
  }

  public List<String> getParticipants() {
    return participants;
  }

}
