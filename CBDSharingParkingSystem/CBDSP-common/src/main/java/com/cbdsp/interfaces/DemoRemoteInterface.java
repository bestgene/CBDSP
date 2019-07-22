package com.cbdsp.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbdsp.bean.DemoBean;

/**
 * 
 * @author xktang
 *	name="服务器名称"
 *	fallbackFactory fallback()方法工厂类
 */
@FeignClient(name="serverName",fallbackFactory=RemoteHandlerFallbackFactoryTest.class)
public interface DemoRemoteInterface {
	@RequestMapping("/order/{userid}")
	public List<DemoBean> findAll(@PathVariable("userid") int userid);
}
