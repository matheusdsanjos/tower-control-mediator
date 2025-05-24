package com.aviation.mediator.interfaces;

import com.aviation.mediator.aircraft.Aircraft;

/**
 * Mediator interface
 * Define o contrato que todos os mediadores concretos devem seguir
 */
public interface AirTrafficControl {
    /**
     * Método para enviar mensagens entre aeronaves
     * @param message Mensagem a ser enviada
     * @param aircraft Aeronave que está enviando a mensagem
     */
    void sendMessage(String message, Aircraft aircraft);
    
    /**
     * Método para registrar aeronaves no sistema de controle de tráfego
     * @param aircraft Aeronave a ser registrada
     */
    void registerAircraft(Aircraft aircraft);
}
