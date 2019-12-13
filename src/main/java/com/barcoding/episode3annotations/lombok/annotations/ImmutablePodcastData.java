package com.barcoding.episode3annotations.lombok.annotations;

import lombok.Value;

import java.util.List;

@Value
public class ImmutablePodcastData {
    private String name;
    private List<String> participants;
}
