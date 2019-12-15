package com.barcoding.episode3annotations.jsonmapping.annotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PodcastJsonTest {

  private static final String BAR_CODING = "BarCoding";
  private static final String ARNOUT = "Arnout";
  private static final String PAULIEN = "Paulien";
  private static final String ID = "0912";
  private static final String RELEASE_DATE = "01-01-2019";

  private final Date releaseDate = Date.from(Instant.parse("2019-01-01T00:00:00.00Z"));

  @Test
  void mapValidJson_toObject() throws JsonProcessingException {

    final String podcastJson = "{" +
        " \"name\": \"" + BAR_CODING + "\", " +
        " \"authors\": [\"" + ARNOUT + "\", \"" + PAULIEN + "\"], " +
        " \"releaseDate\": \"01-01-2019\""+
    "}";

    final Podcast podcast = new ObjectMapper().readValue(podcastJson, Podcast.class);

    assertThat(podcast).isEqualTo(new Podcast(null, BAR_CODING, List.of(ARNOUT, PAULIEN), releaseDate));

  }

  @Test
  void mapValidObject_toJson() throws JsonProcessingException {

    final Podcast podcast = new Podcast(ID, BAR_CODING, List.of(ARNOUT, PAULIEN), releaseDate);

    final String json = new ObjectMapper().writeValueAsString(podcast);

    assertThat(json).contains(RELEASE_DATE); // in the format that was specified
    assertThat(json).contains("authors"); // the property names is converted to authors
    assertThat(json).contains(PAULIEN, ARNOUT);
    assertThat(json).contains(BAR_CODING);

    assertThat(json).doesNotContain("id", ID); // property was ignored

  }

}