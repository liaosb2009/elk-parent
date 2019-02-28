package com.elk.common.service;

import com.elk.common.model.Datas;
import com.elk.common.model.Page;
import com.elk.common.model.TopsecUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;


//进行访问
@FeignClient(value = "eureka-elk-business")
public interface TopsecUserService {

	/**
	 * 添加用户信息
	 * 
	 * @param topsecUser
	 * @return
	 */
	@RequestMapping("/addTopsecUser")
	Integer addTopsecUser(@RequestBody TopsecUser topsecUser);

	/**
	 * 查询用户信息
	 * 
	 * @param topsecUser
	 * @return
	 */
	@RequestMapping("/queryTopsecUser")
	TopsecUser queryTopsecUser(@RequestBody TopsecUser topsecUser);

	/**
	 * 查询用户分页信息，在用户管理中
	 * 
	 * @param paramMap
	 * @return
	 */
	@RequestMapping("/queryUserPage")
	Page<TopsecUser> queryUserPage(@RequestBody Map<String, Object> paramMap);

	/**
	 * 修改用户信息
	 * 
	 * @param topsecUser
	 * @return
	 */
	@RequestMapping("/updateTopsecUser")
	Integer updateTopsecUser(@RequestBody TopsecUser topsecUser);

	/**
	 * 根据id进行用户信息的查询
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/queryTopsecUserById/{id}")
	TopsecUser queryTopsecUserById(@PathVariable("id") Integer id);

	/**
	 * 删除用户信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/deleteTopsecUserById/{id}")
	int deleteTopsecUserById(@PathVariable("id") Integer id);

	/**
	 * 删除所选中的用户信息
	 * 
	 * @param ds
	 * @return
	 */
	@RequestMapping("/deleteTopsecUsers")
	int deleteTopsecUsers(@RequestBody Datas ds);

	/**
	 * 查询当前用户已经分配的数据
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/queryAssignRole/{id}")
	List<Integer> queryAssignRole(@PathVariable("id") Integer id);

	/**
	 * 插入权限
	 * 
	 * @param userid
	 * @param ds
	 * @return
	 */
	@RequestMapping("/insertUserRoles/{userid}")
	int insertUserRoles(@PathVariable("userid") Integer userid, @RequestBody Datas ds);

	/**
	 * 删除付给用户的权限
	 * 
	 * @param userid
	 * @param ds
	 * @return
	 */
	@RequestMapping("/deleteTopsecUserRoles/{userid}")
	int deleteTopsecUserRoles(@PathVariable("userid") Integer userid, @RequestBody Datas ds);

}
