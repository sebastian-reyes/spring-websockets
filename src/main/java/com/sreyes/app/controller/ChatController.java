package com.sreyes.app.controller;

import java.util.Date;

import com.sreyes.app.model.document.Mensaje;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/mensaje")
    @SendTo("/chat/mensaje")
    public Mensaje recibeMensaje(Mensaje mensaje) {
        mensaje.setFecha(new Date().getTime());
        mensaje.setTexto("Recibido por el broker: " + mensaje.getTexto());
        return mensaje;
    }
}
