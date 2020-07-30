package com.telisco.restAPI_Teslisco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("fruits")
public class FruitResource {
	
	FruitRepository repo = new FruitRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) 
	public Fruit[] getFruits() {
		
		return repo.getFruits();
	}
	
	@GET
	@Path("fruit/{name}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Fruit getFruit(@PathParam("name") String name) {
		return repo.getFruit(name);
	}
	 
	
//	@POST
//	@Path("newfruit")
//	public Fruit createFruit(Fruit f) {
//		repo.addNewFruit(f);
//		return f;	
//	}
	
}
