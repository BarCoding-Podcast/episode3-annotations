package com.barcoding.episode3annotations.validation.nonannotations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

class PodcastTest {
  private static final String BAR_CODING = "BarCoding";
  private static final String ARNOUT = "Arnout";
  private static final String PAULIEN = "Paulien";

  @Test
  void validPodcast_ShouldNotResult_InValidationErrors() {

    final Podcast validPodcast = new Podcast(BAR_CODING, List.of(ARNOUT, PAULIEN));

    assertThatCode(validPodcast::validate).doesNotThrowAnyException();

  }

  @Test
  void podcastWithNoName_ShouldResult_InValidationErrors() {

    final Podcast podcastWithNoName = new Podcast(null, List.of(ARNOUT, PAULIEN));

    assertThatCode(podcastWithNoName::validate).hasMessage("should always have a name");

  }

  @Test
  void podcastWithNoParticipants_ShouldResult_InValidationErrors() {

    final Podcast podcastWithNoParticipants = new Podcast(BAR_CODING, List.of());

    assertThatCode(podcastWithNoParticipants::validate).hasMessage("should never be empty");

  }

  @Test
  void podcastWithOneParticipant_ShouldResult_InValidationErrors() {

    final Podcast podcastWithOnlyOneParticipant = new Podcast(BAR_CODING, List.of(ARNOUT));

    assertThatCode(podcastWithOnlyOneParticipant::validate).hasMessage("should always have at least two participants");

  }

}