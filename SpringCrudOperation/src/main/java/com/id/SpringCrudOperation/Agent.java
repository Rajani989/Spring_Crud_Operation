package com.id.SpringCrudOperation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Agent {
  @NonNull
   private int id;
   private String name;
   private String area;
   private int commission;
}
