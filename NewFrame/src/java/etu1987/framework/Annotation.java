/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1987.framework;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Annotation {
    public static List<Class<?>> getModelClasses(String package_name){
        List<Class<?>> classes = new ArrayList<>();
       try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Enumeration<URL> resources = classLoader.getResources(package_name);
            while(resources.hasMoreElements()){
                URL res = resources.nextElement();
                if(res.getProtocol().equals("file")){
                    File packageDir = new File(res.toURI());
                    for(File file : packageDir.listFiles()){
                        String filename = file.getName();
                        if(filename.endsWith(".class")){
                            String className = filename.substring(0, filename.length()-6);
                            System.out.println(className);
                            Class<?> c = Class.forName(package_name + "." + className);
                        }
                    }
                }
            }
        } catch (IOException | ClassNotFoundException | URISyntaxException e) {
        }
       return classes;
   }
}
