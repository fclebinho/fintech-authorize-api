package com.clebergomes.aws_cognito.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserAttributesRequest {
  private String email;
  private String phoneNumber;
  private String fullName;
}
