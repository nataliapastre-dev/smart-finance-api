package com.natalia.smartfinanceapi.service;

import org.springframework.stereotype.Service;

@Service
public class SpeechService {

    public String convert(String audioBase64) {

        // Simulação de reconhecimento de fala
        if (audioBase64 == null || audioBase64.isEmpty()) {
            return "Áudio inválido";
        }

        return "Texto reconhecido da fala (simulação)";
    }
}