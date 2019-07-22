package com.cbdsp.interfaces;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cbdsp.bean.DemoBean;

import feign.hystrix.FallbackFactory;

@Component //加上注解，扫描的时候才能扫描到当前类
public class RemoteHandlerFallbackFactoryTest implements FallbackFactory<DemoRemoteInterface>{

	@Override
	public DemoRemoteInterface create(Throwable arg0) {
		// TODO Auto-generated method stub
		return new DemoRemoteInterface(){

			@Override
			public List<DemoBean> findAll(int userid) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
	}

}