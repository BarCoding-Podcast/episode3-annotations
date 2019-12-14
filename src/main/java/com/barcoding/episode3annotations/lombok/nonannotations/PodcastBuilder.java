package com.barcoding.episode3annotations.lombok.nonannotations;

import java.util.List;

public class PodcastBuilder {
  private String name;
  private List<String> participants;

  private PodcastBuilder(String name, List<String> participants) {
    this.name = name;
    this.participants = participants;
  }

  public static PodcastBuilderBuilder builder() {
    return new PodcastBuilderBuilder();
  }

  public String getName() {
    return name;
  }

  public List<String> getParticipants() {
    return participants;
  }

  public static class PodcastBuilderBuilder {
    private String name;
    private List<String> participants;

    public PodcastBuilderBuilder() {}

    public PodcastBuilderBuilder name(String name) {
      this.name = name;
      return this;
    }

    public PodcastBuilderBuilder participants(List<String> participants) {
      this.participants = participants;
      return this;
    }

    public PodcastBuilder build() {
      return new PodcastBuilder(name, participants);
    }
  }


}
