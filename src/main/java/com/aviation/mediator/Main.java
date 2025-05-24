package com.aviation.mediator;

import com.aviation.mediator.aircraft.Aircraft;
import com.aviation.mediator.aircraft.AirbusA320;
import com.aviation.mediator.aircraft.Boeing747;
import com.aviation.mediator.controller.TowerControl;

/**
 * Classe principal para demonstrar o padrão Mediator
 * Sistema de Controle de Tráfego Aéreo
 */
public class Main {
    
    /**
     * Método principal da aplicação
     * @param args Argumentos da linha de comando
     */
    public static void main(String[] args) {
        System.out.println("=== Sistema de Controle de Tráfego Aéreo ===");
        System.out.println("Demonstração do padrão Mediator\n");
        
        // Cria o objeto TowerControl que vai gerenciar a comunicação entre aeronaves
        TowerControl towerControl = new TowerControl();
        
        System.out.println("\n--- Registrando Aeronaves ---");
        // Cria aeronaves e as registra no TowerControl
        Aircraft boeing = new Boeing747(towerControl, "Boeing-747-123");
        Aircraft airbus = new AirbusA320(towerControl, "Airbus-A320-456");

        System.out.println("\n--- Comunicação entre Aeronaves ---");
        // Envia uma mensagem do Boeing 747
        boeing.send("Solicitando permissão para decolar.");
        
        System.out.println(); // Linha em branco para melhor legibilidade
        
        // Envia uma mensagem do Airbus A320
        airbus.send("Solicitando permissão para aterrissar.");

        System.out.println("\n=== Fim da demonstração ===");
        
        /* Saídas esperadas:
         * Boeing747 Boeing-747-123 enviando mensagem: Solicitando permissão para decolar.
         * AirbusA320 Airbus-A320-456 recebendo mensagem: Solicitando permissão para decolar.
         * AirbusA320 Airbus-A320-456 enviando mensagem: Solicitando permissão para aterrissar.
         * Boeing747 Boeing-747-123 recebendo mensagem: Solicitando permissão para aterrissar.
         */
    }
}
