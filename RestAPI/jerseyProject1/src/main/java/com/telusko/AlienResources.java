package com.telusko;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;

@Path("/aliens")
public class AlienResources {


    private static AlienRepository alienRepository=new AlienRepository();

    public AlienResources() {
    }


    @GET
//    @Produces(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)

    public List<Alien> getAlien(){

        System.out.println("Alien getting called...");
        return alienRepository.getAlienList();
    }


    @GET
    @Path("/alien/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Alien getAlien(@PathParam("id") int id){
        return alienRepository.getById(id);
    }


    @POST
    @Path("/alien")
    public Alien createAlien(Alien a){

        System.out.println("creating Alien");
        alienRepository.createAlien(a);


        return a;
    }


    @DELETE
    @Path("/alien/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteAlien(@PathParam("id") int id){
        boolean del=alienRepository.deleteAlien(id);

        if (del){
            return "Successfully Deleted...";
        }else {
            return "Deletion Failed!";
        }
    }

}
