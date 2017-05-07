package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "XML")
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageXML {
    @XmlElement
    String name;
    @XmlElement
    String text;

    public MessageXML(String name, String text) {
        this.name = name;  
        this.text = text;  
    }

    public MessageXML() {
        this.name = "zzx";
        this.text = "test";
    }

    public String getName() {  
        return name;  
    }

    public String getText() {  
        return text;  
    }  
   
}  