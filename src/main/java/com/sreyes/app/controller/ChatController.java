package com.sreyes.app.controller;

import java.util.Date;
import java.util.Random;

import com.sreyes.app.model.document.Mensaje;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private String[] colores = { "red", "blue", "green", "orange", "magneta", "purple", "teal", "blueviolet" };

    @MessageMapping("/mensaje")
    @SendTo("/chat/mensaje")
    public Mensaje recibeMensaje(Mensaje mensaje) {
        mensaje.setFecha(new Date().getTime());
        if (mensaje.getTipo().equals("NUEVO_USUARIO")) {
            mensaje.setColor(colores[new Random().nextInt(colores.length)]);
            mensaje.setTexto("nuevo usuario");
        }
        return mensaje;
    }
}
