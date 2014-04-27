package com.msse.teamflyte.affinitymapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

@SuppressWarnings("serial")
public class AffinityMapperServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException 
	{
		DatastoreService  ds = DatastoreServiceFactory.getDatastoreService();
		
		Entity user = new Entity("User","prabinashrestha@gmail.com");
		user.setProperty("Name","Prabina Shrestha");
		user.setProperty("email","prabinashrestha@gmail.com");		
		ds.put(user);
//				
//		Entity interest1 =new Entity("Interest");
//		Entity interest2 =new Entity("Interest");
//		Entity interest3 =new Entity("Interest");
//		
//		List<Entity> interestsList = Arrays.asList(interest1, interest2, interest3);
//		ds.put(interestsList);
		
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		
	}
}
