package com.lab.websec.backend.api.dto;

import java.math.BigInteger;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JwtResponse {
	
	  private String token;
	  private String type = "Bearer";
	  private BigInteger id;
	  private String username;
	  private String email;
	  private List<String> roles;
	  
	  public JwtResponse(String accessToken, BigInteger id, String username, String email, List<String> roles) {
		    this.token = accessToken;
		    this.id = id;
		    this.username = username;
		    this.email = email;
		    this.roles = roles;
		  }

}
