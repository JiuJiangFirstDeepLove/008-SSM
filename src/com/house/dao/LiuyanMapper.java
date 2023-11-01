package com.house.dao;

import com.house.entity.Liuyan;

import java.util.List;
import java.util.Map;

public interface LiuyanMapper {

    public int save(Liuyan obj);

    public int update(Liuyan obj);

    public int delete(int id);

    public List<Liuyan> findAll(Map map);

    public Liuyan findID(int id);

}
