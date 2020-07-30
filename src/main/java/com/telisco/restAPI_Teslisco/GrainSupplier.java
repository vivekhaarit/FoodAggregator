package com.telisco.restAPI_Teslisco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("grains")
public class GrainSupplier {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) 
	public List<Grain> getGrains() {
		
		Grain g1 = new Grain();
		g1.setId("24-583-0264");
		g1.setName("wheat");
		g1.setPrice("$62.02");
		g1.setQuantity(30);
		
		Grain g2 = new Grain();
		g2.setId("75-588-0160");
		g2.setName("barley");
		g2.setPrice("$86.41");
		g2.setQuantity(28);
		
		Grain g3 = new Grain();
		g3.setId("28-996-2788");
		g3.setName("rye");
		g3.setPrice("$11.11");
		g3.setQuantity(21);
		
		List<Grain> grains = new ArrayList<Grain>();
		grains.add(g1);
		grains.add(g2);
		grains.add(g3);
		
		return grains;
	}
}
