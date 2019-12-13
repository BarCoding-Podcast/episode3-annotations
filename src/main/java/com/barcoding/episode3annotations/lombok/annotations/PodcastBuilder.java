package com.barcoding.episode3annotations.lombok.annotations;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class PodcastBuilder {
  private String name;
  private List<String> participants;
}
