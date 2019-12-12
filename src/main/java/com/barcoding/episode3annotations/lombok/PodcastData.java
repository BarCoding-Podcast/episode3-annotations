package com.barcoding.episode3annotations.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data //todo add test for equals and hashcode
@AllArgsConstructor
public class PodcastData {
  private String name;
  private List<String> participants;
}
