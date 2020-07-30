package com.telisco.restAPI_Teslisco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("vegetables")
public class VegetableSupplier {

	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) 
	public List<Vegetables> getVegetables() {
		
		Vegetables v1 = new Vegetables();
		v1.setId("24-583-0264");
		v1.setName("Carrot");
		v1.setPrice("$62.02");
		v1.setQuantity(30);
		
		Vegetables v2 = new Vegetables();
		v2.setId("75-588-0160");
		v2.setName("okra");
		v2.setPrice("$86.41");
		v2.setQuantity(28);
		
		Vegetables v3 = new Vegetables();
		v3.setId("28-996-2788");
		v3.setName("onion");
		v3.setPrice("$11.11");
		v3.setQuantity(21);
		
		List<Vegetables> vegetables = new ArrayList<Vegetables>();
		vegetables.add(v1);
		vegetables.add(v2);
		vegetables.add(v3);
		
		return vegetables;
	}
}
