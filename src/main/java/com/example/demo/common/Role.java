package com.example.demo.common;

import lombok.Getter;

@Getter
public enum Role {
  USER("user", "일반 사용자"),
  ADMIN("admin", "관리자");

  private final String name;
  private final String description;

  Role(String name, String description) {
    this.name = name;
    this.description = description;
  }
}