package br.com.challengerbackendhitclean.application.gateway;

import java.util.List;

public interface Gateway <Object> {
    Object save(Object object);
    Object update(Object object);
    void delete(Object object);
    Object getId(int objectId);
    List<Object> getAll();
    Object getByName(String name);
}
