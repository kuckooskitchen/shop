package com.hamstercloud.shop.feature.toys;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ToyDto {

  private int id;
  private String name;
  private boolean active;
  private Date createdAt;

  public ToyDto() {

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
}