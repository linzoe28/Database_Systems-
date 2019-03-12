/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author User
 */
public class Person {
    private String name;
    private String [] emails=null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String[] getEmails() {
        return emails;
    }
    public void setEmails(String[] emails) {
        this.emails = emails;
    }
}
