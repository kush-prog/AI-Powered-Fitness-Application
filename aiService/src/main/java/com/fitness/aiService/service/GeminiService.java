package com.fitness.aiService.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Service
public class GeminiService {

    private final WebClient webClient;

    @Value("${gemini.api.url}")
    private String geminiAPiUrl;
    @Value("${gemini.api.key}")
    private String geminiAPiKey;

    public GeminiService(WebClient.Builder webclientBuilder){
        this.webClient = webclientBuilder.build();
    }

    public String getAnswer(String question){
        Map<String, Object> request = Map.of(
                "contents", new Object[] {
                        Map.of("parts", new Object[]{
                                Map.of("text", question)
                        })
                }
        );

        String response = webClient.post()
                .uri(geminiAPiUrl + "?key=" + geminiAPiKey)
                .header("Content-Tyoe", "application/json")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return response;
    }
}
