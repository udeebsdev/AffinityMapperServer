package com.msse.teamflyte.affinitymapper;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AffinityMapperServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException 
	{
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world Now");
		
		//snippets:
		
//		DatastoreService  ds = DatastoreServiceFactory.getDatastoreService();		
//		Entity user = new Entity("User","prabinashrestha@gmail.com");
//		user.setProperty("Name","Prabina Shrestha");
//		user.setProperty("email","prabinashrestha@gmail.com");		
//		ds.put(user);
//				
//		Entity interest1 =new Entity("Interest");
//		Entity interest2 =new Entity("Interest");
//		Entity interest3 =new Entity("Interest");
//		
//		List<Entity> interestsList = Arrays.asList(interest1, interest2, interest3);
//		ds.put(interestsList);
			
		
		//CollectionResponse<Person>
		//return CollectionResponse.<ContactOutput> builder().setItems(list).build();

		//mgr.refresh(p);
		
	}
}
