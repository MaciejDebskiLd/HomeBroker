package com.example.homebroker.repositories;

import com.example.homebroker.models.AbstractModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractRepository <M extends AbstractModel> {

    final private Map<Integer, M> data = new HashMap<>();

    public List<M> getAll(){

        List<M> list = new ArrayList<>();
        data.forEach((integer, model) ->
            list.add(model));

        return list;
    }

    public M finfById(int id){
        checkIsModelExists(id);
        return data.get(id);
    }

    public M add(M addModel){
        if(data.containsKey(addModel.getId())){
            throw new IllegalArgumentException("Object id: " + addModel.getId() + " exisits in repository");
        }
        data.put(addModel.getId(), addModel);
        return addModel;
    }

    public void deleteById(int id){
        checkIsModelExists(id);
        data.remove(id);
    }

    public M updateById(int id, M updateModel){

        checkIsModelExists(id);
        data.remove(id);
        updateModel.setId(id);
        data.put(id, updateModel);

        return updateModel;
    }

    private void checkIsModelExists(int id){

        if(!data.containsKey(id)){
            throw new IllegalArgumentException("Can't find object id: " + id + " in repositoy");
        }
    }
}
