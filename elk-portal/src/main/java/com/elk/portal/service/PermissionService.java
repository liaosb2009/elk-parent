package com.elk.portal.service;

import java.util.List;


import com.elk.common.model.Permission;
import com.elk.common.model.TopsecUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



//进行访问
@FeignClient("eureka-elk-business")
public interface PermissionService {

	/**
	 * 查询所有菜单
	 * 
	 * @return
	 */
	@RequestMapping("/queryAll")
	List<Permission> queryAll();

	/**
	 * 插入权限许可表数据
	 * 
	 * @param permission
	 * @return
	 */
	@RequestMapping("/insertPermission")
	int insertPermission(@RequestBody Permission permission);

	/**
	 * 查询所有权限
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/queryPermissionById/{id}")
	Permission queryPermissionById(@PathVariable("id") Integer id);

	/**
	 * 修改权限
	 * 
	 * @param permission
	 * @return
	 */
	@RequestMapping("/updatePermissionById")
	int updatePermissionById(@RequestBody Permission permission);

	/**
	 * 删除权限
	 * 
	 * @param permission
	 * @return
	 */
	@RequestMapping("/deletePermission")
	int deletePermission(@RequestBody Permission permission);

	/**
	 * 查询用户权限
	 * 
	 * @param roleid
	 * @return
	 */
	@RequestMapping("/queryAssignPermissions/{roleid}")
	List<Integer> queryAssignPermissions(@PathVariable("roleid") Integer roleid);

	/**
	 * 通过用户权限查询左侧用户菜单树
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/queryUserPermissions")
	List<Permission> queryUserPermissions(@RequestBody TopsecUser user);

}
