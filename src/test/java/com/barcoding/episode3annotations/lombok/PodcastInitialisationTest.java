package com.barcoding.episode3annotations.lombok;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PodcastInitialisationTest {

  private static final String BAR_CODING = "BarCoding";
  private static final String ARNOUT = "Arnout";
  private static final String PAULIEN = "Paulien";

  @Test
  void podCastData_ShouldHave_Constructor() {
    final PodcastData podcastData = new PodcastData(BAR_CODING, List.of(ARNOUT, PAULIEN));

    assertThat(podcastData.getName()).isEqualTo(BAR_CODING);
    assertThat(podcastData.getParticipants()).containsAll(List.of(PAULIEN, ARNOUT));
  }

  @Test
  void podCastBuilder_ShouldHave_Builder() {
    final PodcatBuilder podcastBuilder = PodcatBuilder.builder()
        .name(BAR_CODING)
        .participants(List.of(ARNOUT, PAULIEN))
        .build();

    assertThat(podcastBuilder.getName()).isEqualTo(BAR_CODING);
    assertThat(podcastBuilder.getParticipants()).containsAll(List.of(PAULIEN, ARNOUT));
  }

}