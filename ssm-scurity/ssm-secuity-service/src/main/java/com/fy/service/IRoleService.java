package com.fy.service;

import com.fy.domain.Permission;
import com.fy.domain.Role;

import java.util.List;

/**
 * @author java
 * @desc
 * @ClassName
 **/
public interface IRoleService {

    List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws Exception;

    List<Permission> findOtherPermissions(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds);

    void deleteRoleById(String roleId);
}
