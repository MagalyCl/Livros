package com.clara.literatura.service;

import com.clara.literatura.dto.DadosLivro;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {
    @JsonProperty("results")
    List<DadosLivro> results;

    public ApiResponse() {
    }

    public ApiResponse(List<DadosLivro> results) {
        this.results = results;
    }

    public List<DadosLivro> getResults() {
        return results;
    }

    public void setResults(List<DadosLivro> results) {
        this.results = results;
    }
}
