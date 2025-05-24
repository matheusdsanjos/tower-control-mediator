package com.aviation.mediator.controller;

import java.util.ArrayList;
import java.util.List;

import com.aviation.mediator.aircraft.Aircraft;
import com.aviation.mediator.interfaces.AirTrafficControl;

/**
 * ConcreteMediator
 * Implementa a interface AirTrafficControl e coordena a comunicação entre as aeronaves
 */
public class TowerControl implements AirTrafficControl {
    private List<Aircraft> aircraftList; // Lista de aeronaves registradas

    /**
     * Construtor do controlador da torre
     */
    public TowerControl() {
        this.aircraftList = new ArrayList<>(); // Inicializa a lista de aeronaves
    }

    @Override
    public void sendMessage(String message, Aircraft aircraft) {
        // Envia a mensagem para todas as aeronaves registradas, exceto para a que enviou a mensagem
        for (Aircraft ac : aircraftList) {
            if (ac != aircraft) {
                ac.receiveMessage(message);
            }
        }
    }

    @Override
    public void registerAircraft(Aircraft aircraft) {
        // Adiciona uma nova aeronave à lista de controle
        aircraftList.add(aircraft);
        System.out.println("Aeronave registrada no sistema de controle: " + aircraft.getClass().getSimpleName());
    }
}
