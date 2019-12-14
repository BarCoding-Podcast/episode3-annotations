package com.barcoding.episode3annotations.jpa.annotations;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PodCast {
  @Id
  private long id;
  private String name;
}
