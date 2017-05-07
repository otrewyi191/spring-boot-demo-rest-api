package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pizza")
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageXML {

    String name;
    String text;

    public MessageXML(String name, String text) {
        this.name = name;  
        this.text = text;  
    }
    public MessageXML() {
        this.name = "zzx";
        this.text = "test";
    }
    @XmlElement(name = "name")
    public String getName() {  
        return name;  
    }
    @XmlElement(name = "text")
    public String getText() {  
        return text;  
    }  
   
}  