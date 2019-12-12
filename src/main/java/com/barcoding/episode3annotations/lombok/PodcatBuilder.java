package com.barcoding.episode3annotations.lombok;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class PodcatBuilder {
  private String name;
  private List<String> participants;
}
