package com.fy.service;

import com.fy.domain.Permission;

import java.util.List;

/**
 * @author java
 * @desc
 * @ClassName
 **/
public interface IPermissionService {
    List<Permission> findAll() throws Exception;

    void save(Permission p) throws Exception;

    void deleteById(String id) throws Exception;

    Permission findById(String id) throws Exception;
}
