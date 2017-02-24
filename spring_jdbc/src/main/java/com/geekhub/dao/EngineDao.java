package com.geekhub.dao;

import com.geekhub.model.Engine;

import java.util.List;

public interface EngineDao {
    void saveEngine(Engine engine);
    void updateEngine(Engine engine);
    void deleteEngine(int engineId);
    Engine findEngineById(int engineId);
    List<Engine> getAllEngine();
}
