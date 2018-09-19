/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypack.mavenhibernate;

public class Student {

    private String name, password;
    private long cno;
    private float cpi;
    private double spi;

    public Student(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getCpi() {
        return cpi;
    }

    public void setCpi(float cpi) {
        this.cpi = cpi;
    }

    public double getSpi() {
        return spi;
    }

    public void setSpi(double spi) {
        this.spi = spi;
    }

    public long getCno() {
        return cno;
    }

    public void setCno(long cno) {
        this.cno = cno;
    }

}
