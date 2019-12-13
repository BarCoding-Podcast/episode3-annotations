package com.barcoding.episode3annotations.lombok.badpractice;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PodcastInitialisationTest {

  private static final String BAR_CODING = "BarCoding";
  private static final String ARNOUT = "Arnout";
  private static final String PAULIEN = "Paulien";

  @Test
  void immutablePodcastData_ShouldNotHave_Setters() {
    final ImmutablePodcastData podcastData = new ImmutablePodcastData(BAR_CODING, List.of(ARNOUT, PAULIEN));

    //This should not be possible for immutable objects;
    podcastData.setName(ARNOUT);

    assertThat(podcastData.getName()).isEqualTo(ARNOUT);
    assertThat(podcastData.getParticipants()).containsAll(List.of(PAULIEN, ARNOUT));
  }
}
