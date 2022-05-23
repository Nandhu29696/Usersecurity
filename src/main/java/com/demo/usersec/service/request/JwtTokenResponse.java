package com.demo.usersec.service.request;

import java.io.Serializable;
import lombok.Data;

@Data
public class JwtTokenResponse implements Serializable {

	private static final long serialVersionUID = -7932010041518853295L;
	
	private final String token;
	
	private final String fullName;

    public JwtTokenResponse(String token, String fullName) {
        this.token = token;
		this.fullName = fullName;
    }

}
