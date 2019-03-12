/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author User
 */
@Path("person")
public class PersonResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{name}")
    public Person getPerson(@PathParam("name") String userName){
        return PersonDB.getPerson(userName);
    }
    
    @POST
    public void addPerson(@FormParam("name") String name, @FormParam("emails") List<String> emails){
        Person p=new Person();
        p.setName(name);
        List<String> newList=new ArrayList<>();
        for(String email : emails){
            if(email!=null && email.length()>0){
                newList.add(email);
            }
        }
        p.setEmails(newList.toArray(new String[0]));
        PersonDB.addPerson(p);
    }
}
