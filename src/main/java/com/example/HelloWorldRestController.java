package com.example;

/**
 * Created by Administrator on 2017/5/7 0007.
 */
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldRestController {
    @RequestMapping("/hello/json/{player}")
    public Message message(@PathVariable String player) {
        Message msg = new Message(player, "Hello " + player);
        return msg;
    }

    @RequestMapping("/hello/xml/{player}")
    public MessageXML messagexml(@PathVariable String player) {
        MessageXML msg = new MessageXML(player, "Hello " + player);
        return msg;
    }

}