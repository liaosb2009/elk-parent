package com.elk.portal.service;

import java.util.Map;

import com.elk.common.model.BoardCount;
import com.elk.common.model.DiskInformation;
import com.elk.common.model.Page;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value="eureka-elk-business" )
public interface DiskInforamtionService {
	/**
	 * 查询分页信息主板
	 * @param hashMap
	 * @return
	 */
	@RequestMapping(value="queryBaseBoardPage")
	Page<BoardCount> queryBaseBoardPage(@RequestBody Map<String, Object> hashMap);
	
	
	@RequestMapping(value="/queryBaseBoardById/{id}")
	DiskInformation queryBaseBoardById(@PathVariable("id") Integer id);

}
