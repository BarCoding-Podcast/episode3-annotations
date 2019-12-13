package com.barcoding.episode3annotations.lombok.annotations;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PodcastData {
  private String name;
  private List<String> participants;
}
