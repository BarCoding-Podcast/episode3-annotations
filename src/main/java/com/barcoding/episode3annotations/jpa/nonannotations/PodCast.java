package com.barcoding.episode3annotations.jpa.nonannotations;

public class PodCast {

  private long id;
  private String name;

  public PodCast() {
  }

  public PodCast(long id, String name) {
    this.id = id;
    this.name = name;
  }
}
