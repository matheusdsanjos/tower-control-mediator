package com.aviation.mediator.aircraft;

import com.aviation.mediator.interfaces.AirTrafficControl;

/**
 * ConcreteColleague
 * Implementa a interface Aircraft para outra aeronave específica (Airbus A320)
 */
public class AirbusA320 extends Aircraft {

    /**
     * Construtor do Airbus A320
     * @param mediator Referência para o controlador de tráfego aéreo
     * @param identifier Identificador único da aeronave
     */
    public AirbusA320(AirTrafficControl mediator, String identifier) {
        super(mediator, identifier); // Inicializa o Mediator e o identificador
    }

    @Override
    public void send(String message) {
        // Envia uma mensagem para o Mediator
        System.out.println("AirbusA320 " + identifier + " enviando mensagem: " + message);
        mediator.sendMessage(message, this); // O Mediator encaminha a mensagem para outras aeronaves
    }

    @Override
    public void receiveMessage(String message) {
        // Recebe e exibe uma mensagem
        System.out.println("AirbusA320 " + identifier + " recebendo mensagem: " + message);
    }
}
