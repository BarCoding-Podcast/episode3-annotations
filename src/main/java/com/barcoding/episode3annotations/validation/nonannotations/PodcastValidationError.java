package com.barcoding.episode3annotations.validation.nonannotations;


public class PodcastValidationError extends RuntimeException {
  public PodcastValidationError(String message) {
    super(message);
  }
}
