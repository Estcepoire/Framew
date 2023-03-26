/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1987.framework;

/**
 *
 * @author ASUS
 */
public class Mapping {
    String className;
    String methode;

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethode() {
        return methode;
    }

    public void setMethode(String methode) {
        this.methode = methode;
    }

    public Mapping() {
    }

    public Mapping(String className, String methode) {
        this.className = className;
        this.methode = methode;
    }
}
