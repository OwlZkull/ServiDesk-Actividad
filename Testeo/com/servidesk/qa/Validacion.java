package com.servidesk.qa;


import Objetos.Computador;

public class Validacion {
    public static void main(String[] args) {
        System.out.println("=== EJECUTANDO PRUEBAS DE QA: VALIDACIÓN DE ENTRADA ===");

        Computador pc = new Computador("SN-12345", "HP", "Pavilion", 16, "Intel i7");

        if (pc.getMemoriaRAM() > 0) {
            System.out.println("✅ [PASS] Memoria RAM válida: " + pc.getMemoriaRAM() + " GB");
        } else {
            System.err.println("❌ [FAIL] La memoria RAM no puede ser menor o igual a 0");
        }

        if (pc.getNumeroSerie() != null && !pc.getNumeroSerie().trim().isEmpty()) {
            System.out.println("✅ [PASS] Número de Serie correcto: " + pc.getNumeroSerie());
        } else {
            System.err.println("❌ [FAIL] El número de serie está vacío");
        }
    }
}