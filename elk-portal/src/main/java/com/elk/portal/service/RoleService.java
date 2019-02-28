package com.elk.portal.service;

import java.util.List;
import java.util.Map;

import com.elk.common.model.Datas;

import com.elk.common.model.Page;
import com.elk.common.model.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 权限
 */
@FeignClient("eureka-elk-business")
public interface RoleService {
	/**
	 * 查询分页
	 * 
	 * @param paramMap
	 * @return
	 */
	@RequestMapping("/queryRolePage")
	Page<Role> queryRolePage(@RequestBody Map<String, Object> paramMap);

	/**
	 * 根据角色名称查询角色
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping("/queryRoleByName")
	Role queryRoleByName(@RequestBody Role role);

	/**
	 * 添加角色
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping("/addTopsecRole")
	Integer addTopsecRole(@RequestBody Role role);

	/**
	 * 删除角色信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteRoleById/{id}")
	int deleteRoleById(@PathVariable("id") Integer id);

	/**
	 * 批量删除
	 * 
	 * @param ds
	 * @return
	 */
	@RequestMapping("/deleteTopsecRoles")
	int deleteTopsecRoles(@RequestBody Datas ds);

	/**
	 * 查询所有角色
	 * 
	 * @return
	 */
	@RequestMapping("/queryRoleAll")
	List<Role> queryRoleAll();

	/**
	 * 根据id查询角色信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/queryRoleById/{id}")
	Role queryRoleById(@PathVariable("id") Integer id);

	/**
	 *
	 * @param role
	 * @return
	 */
	@RequestMapping("/updateRoleById")
	int updateRoleById(@RequestBody Role role);

	/**
	 * 
	 * @param roleid
	 * @param ds
	 * @return
	 */
	@RequestMapping("/insertRolePermissions/{roleid}")
	int insertRolePermissions(@PathVariable("roleid") Integer roleid, @RequestBody Datas ds);

}
