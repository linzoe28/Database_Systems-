/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author User
 */
@Path("hello1")
public class Hello1Resource {
    @GET
    public String sayHello(@QueryParam("name")  String userName, 
            @QueryParam("helloString") String helloString){
        return "hello, "+userName+", "+helloString;
    }
}
