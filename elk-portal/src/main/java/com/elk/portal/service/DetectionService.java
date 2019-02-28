package com.elk.portal.service;

import java.util.Map;


import com.elk.common.model.*;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


//进行访问
@FeignClient("eureka-elk-business")
public interface DetectionService {

	/**
	 * 查询cpu分页信息
	 * 
	 * @param paramMap
	 * @return
	 */
	@RequestMapping("/queryDetectionPageQuery")
	Page<Cpu> queryDetectionPageQuery(@RequestBody Map<String, Object> paramMap);

	// ============================================================
	/**
	 * 查询memory分页信息
	 * 
	 * @param paramMap
	 * @return
	 */
	@RequestMapping("/queryDetectionPageQueryByMemory")
	Page<Memory> queryDetectionPageQueryByMemory(@RequestBody Map<String, Object> paramMap);

	/**
	 * 修改Memory状态
	 * 
	 * @param paramMap
	 * @return
	 */
	/*
	 * @RequestMapping("/updateMemoryStatusBySerNum") void
	 * updateMemoryStatusBySerNum(@RequestBody Memory memory);
	 */

	// ================================================================
	/**
	 * 查询cfcard分页
	 * 
	 * @param paramMap
	 * @return
	 */
	@RequestMapping("/queryDetectionPageQueryByCfCard")
	Page<CfCard> queryDetectionPageQueryByCfCard(@RequestBody Map<String, Object> paramMap);

	/**
	 * 修改CfCard状态
	 * 
	 * @param paramMap
	 * @return
	 */
	/*
	 * @RequestMapping("/updateCfCardStatusBySerNum") void
	 * updateCfCardStatusBySerNum(@RequestBody CfCard cfCard);
	 */
	// ======================================================================

	/**
	 * 查询硬盘信息
	 * 
	 * @param paramMap
	 * @return
	 */
	@RequestMapping("/queryDetectionPageQueryByHdd")
	Page<HddMessage> queryDetectionPageQueryByHdd(@RequestBody Map<String, Object> paramMap);

	/**
	 * 修改硬盘状态
	 * 
	 * @param hddMessage
	 */
	/*
	 * @RequestMapping("/updateHddStatusBySerNum") void
	 * updateHddStatusBySerNum(@RequestBody HddMessage hddMessage);
	 */

	// =================================查询详细信息
	@RequestMapping("/queryCpuById/{id}")
	public Cpu queryCpuById(@PathVariable("id") Integer id);

	@RequestMapping("/queryMemoryById/{id}")
	Memory queryMemoryById(@PathVariable("id") Integer id);

	@RequestMapping("/queryCfCardById/{id}")
	CfCard queryCfCardById(@PathVariable("id") Integer id);

	@RequestMapping("/queryHddById/{id}")
	HddMessage queryHddById(@PathVariable("id") Integer id);
}
