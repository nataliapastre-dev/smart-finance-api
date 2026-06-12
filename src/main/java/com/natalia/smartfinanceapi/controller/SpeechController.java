package com.natalia.smartfinanceapi.controller;

import com.natalia.smartfinanceapi.service.SpeechService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/speech")
public class SpeechController {

    private final SpeechService speechService;

    public SpeechController(SpeechService speechService) {
        this.speechService = speechService;
    }

    @PostMapping("/convert")
    public String convert(@RequestBody String audioBase64) {
        return speechService.convert(audioBase64);
    }
}