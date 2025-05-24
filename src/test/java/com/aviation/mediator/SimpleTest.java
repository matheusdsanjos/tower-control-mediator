package com.aviation.mediator;

import com.aviation.mediator.aircraft.Aircraft;
import com.aviation.mediator.aircraft.Boeing747;
import com.aviation.mediator.aircraft.AirbusA320;
import com.aviation.mediator.controller.TowerControl;

/**
 * Teste simples para validar o funcionamento do sistema
 * Nota: Este é um exemplo básico. Para testes reais, considere usar JUnit.
 */
public class SimpleTest {
    
    public static void main(String[] args) {
        System.out.println("=== Iniciando Testes Simples ===\n");
        
        testBasicCommunication();
        testMultipleAircraft();
        
        System.out.println("=== Todos os testes concluídos ===");
    }
    
    /**
     * Teste básico de comunicação entre duas aeronaves
     */
    public static void testBasicCommunication() {
        System.out.println("--- Teste 1: Comunicação Básica ---");
        
        TowerControl tower = new TowerControl();
        Aircraft boeing = new Boeing747(tower, "TEST-B747-001");
        Aircraft airbus = new AirbusA320(tower, "TEST-A320-002");
        
        boeing.send("Teste de comunicação do Boeing");
        airbus.send("Teste de comunicação do Airbus");
        
        System.out.println("✅ Teste de comunicação básica concluído\n");
    }
    
    /**
     * Teste com múltiplas aeronaves
     */
    public static void testMultipleAircraft() {
        System.out.println("--- Teste 2: Múltiplas Aeronaves ---");
        
        TowerControl tower = new TowerControl();
        Aircraft[] aircraft = {
            new Boeing747(tower, "MULTI-B747-001"),
            new AirbusA320(tower, "MULTI-A320-002"),
            new Boeing747(tower, "MULTI-B747-003"),
            new AirbusA320(tower, "MULTI-A320-004")
        };
        
        // Primeira aeronave envia mensagem para todas as outras
        aircraft[0].send("Mensagem para múltiplas aeronaves");
        
        System.out.println("✅ Teste de múltiplas aeronaves concluído\n");
    }
}
