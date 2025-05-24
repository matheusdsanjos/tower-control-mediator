package com.aviation.mediator.aircraft;

import com.aviation.mediator.interfaces.AirTrafficControl;

/**
 * Colleague interface
 * Define a interface para aeronaves que interagem através do Mediator
 */
public abstract class Aircraft {
    protected AirTrafficControl mediator; // Referência para o Mediator
    protected String identifier; // Identificador único da aeronave

    /**
     * Construtor da aeronave
     * @param mediator Referência para o controlador de tráfego aéreo
     * @param identifier Identificador único da aeronave
     */
    public Aircraft(AirTrafficControl mediator, String identifier) {
        this.mediator = mediator; // Inicializa o Mediator
        this.identifier = identifier; // Inicializa o identificador da aeronave
        mediator.registerAircraft(this); // Registra a aeronave no Mediator
    }

    /**
     * Método para enviar mensagens
     * @param message Mensagem a ser enviada
     */
    public abstract void send(String message);
    
    /**
     * Método para receber mensagens
     * @param message Mensagem recebida
     */
    public abstract void receiveMessage(String message);
}
