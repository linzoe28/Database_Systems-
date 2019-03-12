/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class PersonDB {
    private static Map<String, Person> db=new HashMap<>();
    static{
        Person p=new Person();
        p.setName("lendle");
        p.setEmails(new String[]{"1", "2"});
        db.put("lendle", p);
    }
    public static Person getPerson(String name){
        return db.get(name);
    }
    
    public static void addPerson(Person p){
        db.put(p.getName(), p);
    }
}
