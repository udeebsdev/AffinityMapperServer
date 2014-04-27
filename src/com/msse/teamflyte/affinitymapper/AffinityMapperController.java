package com.msse.teamflyte.affinitymapper;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;
import com.google.appengine.api.users.User;

@Api(name = "affinitymapper", version = "v1")
public class AffinityMapperController {

	@ApiMethod(name = "getUser", path = "user/{userId}", httpMethod = HttpMethod.GET)
	public Map<String, String> getUser(@Named("userId") String userId, User user, HttpServletRequest req) {
	
		Map<String, String> result = new HashMap<String, String>();
		result.put("name", "Prabina");
		return result;
	}	
}
