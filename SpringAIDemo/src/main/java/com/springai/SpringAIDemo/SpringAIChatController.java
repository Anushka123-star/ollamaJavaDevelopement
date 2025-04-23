package com.springai.SpringAIDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/chat")
public class SpringAIChatController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String OLLAMA_URL = "http://localhost:11434/api/generate";

    @PostMapping("/{conversationId}")
    public String chat(@PathVariable String conversationId, @RequestBody String question) {

        // Prepare request body for Ollama API
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("model", "llama2"); // use llama2 as model name
        requestBody.put("prompt", question);
        requestBody.put("stream", false); // disable streaming for simplicity

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, Object>> request = new HttpEntity<>(requestBody, headers);

        try {
            ResponseEntity<Map> response = restTemplate.postForEntity(OLLAMA_URL, request, Map.class);

            if (response.getStatusCode() == HttpStatus.OK && response.getBody() != null) {
                return (String) response.getBody().get("response");
            } else {
                return "Error: Unexpected response from Ollama";
            }
        } catch (Exception e) {
            return "Error communicating with Ollama: " + e.getMessage();
        }
    }
}
