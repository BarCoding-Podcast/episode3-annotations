package com.barcoding.episode3annotations.lombok.badpractice;

import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

import java.util.List;

/**
 * NOTE: This is an example of bad use of lombok
 */
@Setter
@Value
public class ImmutablePodcastData {
  @NonFinal private String name;
  private List<String> participants;
}
