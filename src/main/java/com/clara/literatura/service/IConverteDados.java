package com.clara.literatura.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
