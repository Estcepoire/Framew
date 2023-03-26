/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1987.framework;

import etu1987.framework.servlet.Urls;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author ASUS
 */
public class FonctionURL {
    public static Map<String,Mapping> fonction(){
        Map<String,Mapping> mappingUrls=new HashMap<>();
        List<Class<?>> li = Annotation.getModelClasses("test");
         System.out.println(li.size());
       for(int i =0;i<li.size();i++){        
           Method[] m=li.get(i).getMethods();
            for(int j=0;j<m.length;i++){
                if(m[j].isAnnotationPresent(Urls.class)){                  
                    Urls u=m[j].getAnnotation(Urls.class);
                   mappingUrls.put(u.nom(),new Mapping(li.get(i).getName(),m[j].getName()));
                    System.out.println("haha");
               }
            }
       }
        return mappingUrls;
    }
}
