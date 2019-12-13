package com.barcoding.episode3annotations.lombok.annotations;

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
  void podCastData_shouldImplement_EqualsAndHashCode(){
    final PodcastData podcastData = new PodcastData(BAR_CODING, List.of(ARNOUT, PAULIEN));
    final PodcastData podcastData2 = new PodcastData(BAR_CODING, List.of(ARNOUT, PAULIEN));

    assertThat(podcastData).isEqualTo(podcastData2);
    assertThat(podcastData.hashCode()).isEqualTo(podcastData2.hashCode());
  }

  @Test
  void podCastBuilder_ShouldHave_Builder() {
    final PodcastBuilder podcastBuilder = PodcastBuilder.builder()
        .name(BAR_CODING)
        .participants(List.of(ARNOUT, PAULIEN))
        .build();

    assertThat(podcastBuilder.getName()).isEqualTo(BAR_CODING);
    assertThat(podcastBuilder.getParticipants()).containsAll(List.of(PAULIEN, ARNOUT));
  }

}
