package com.barcoding.episode3annotations.validation.annotations;

import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class PodcastTest {

  private static final String BAR_CODING = "BarCoding";
  private static final String ARNOUT = "Arnout";
  private static final String PAULIEN = "Paulien";

  private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  private static Validator validator = factory.getValidator();

  @Test
  void validPodcast_ShouldNotResult_InValidationErrors() {

    final Podcast validPodcast = new Podcast(BAR_CODING, List.of(ARNOUT, PAULIEN));

    final Set<ConstraintViolation<Podcast>> constraintViolations = validator.validate(validPodcast);

    assertThat(constraintViolations).isEmpty();

  }

  @Test
  void podcastWithNoName_ShouldResult_InValidationErrors() {

    final Podcast podcastWithNoName = new Podcast(null, List.of(ARNOUT, PAULIEN));

    final Set<ConstraintViolation<Podcast>> constraintViolations = validator.validate(podcastWithNoName);

    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList())).containsExactly("should always have a name");

  }

  @Test
  void podcastWithNoParticipants_ShouldResult_InValidationErrors() {

    final Podcast podcastWithNoName = new Podcast(BAR_CODING, List.of());

    final Set<ConstraintViolation<Podcast>> constraintViolations = validator.validate(podcastWithNoName);

    assertThat(constraintViolations).hasSize(2);
    assertThat(constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList())).containsOnlyOnce("should never be empty");
    assertThat(constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList())).containsOnlyOnce("should always have at least two participants");

  }

  @Test
  void podcastWithOneParticipant_ShouldResult_InValidationErrors() {

    final Podcast podcastWithOnlyOneParticipant = new Podcast(BAR_CODING, List.of(ARNOUT));

    final Set<ConstraintViolation<Podcast>> constraintViolations = validator.validate(podcastWithOnlyOneParticipant);

    assertThat(constraintViolations).hasSize(1);
    assertThat(constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList())).containsOnlyOnce("should always have at least two participants");

  }

}