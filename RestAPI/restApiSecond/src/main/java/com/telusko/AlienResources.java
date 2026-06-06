package com.telusko;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Path("/aliens")
public class AlienResources {


    private static AlienRepository alienRepository=new AlienRepository();


    @GET
//    @Produces(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alien> getAlien(){
        return alienRepository.getAliens();
    }


    @GET
    @Path("/alien/{id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public String getAlien(@PathParam("id") int id){
        Alien alien=alienRepository.getById(id);

        if (alien==null){
            return "Alien not found!";
        }else{
            return "Alien_ji_mil_gye....hehe";
        }

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



    @PUT
    @Path("/alien")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Alien updateAlien(Alien alien){

        Alien a=alienRepository.getById(alien.getId());
        if (a==null){
            return alienRepository.createAlien(alien);
        }else{
            return alienRepository.updateAlien(alien);
        }
    }


}
