package com.aviation.mediator.aircraft;

import com.aviation.mediator.interfaces.AirTrafficControl;

/**
 * ConcreteColleague
 * Implementa a interface Aircraft para uma aeronave específica (Boeing 747)
 */
public class Boeing747 extends Aircraft {

    /**
     * Construtor do Boeing 747
     * @param mediator Referência para o controlador de tráfego aéreo
     * @param identifier Identificador único da aeronave
     */
    public Boeing747(AirTrafficControl mediator, String identifier) {
        super(mediator, identifier); // Inicializa o Mediator e o identificador
    }

    @Override
    public void send(String message) {
        // Envia uma mensagem para o Mediator
        System.out.println("Boeing747 " + identifier + " enviando mensagem: " + message);
        mediator.sendMessage(message, this); // O Mediator encaminha a mensagem para outras aeronaves
    }

    @Override
    public void receiveMessage(String message) {
        // Recebe e exibe uma mensagem
        System.out.println("Boeing747 " + identifier + " recebendo mensagem: " + message);
    }
}
