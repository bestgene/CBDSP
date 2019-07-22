package com.cbdsp.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 对象
 * @author xkang
 *
 */
@NoArgsConstructor     //自动生成无参构造
@AllArgsConstructor    //自动生成有参构造
@Data                  //默认提供getter和setter以及toString方法
@Accessors(chain=true) //代表支持链式表达
public class DemoBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String orderid;
	private Date da;
	private String name;
	private String payType;
	private String productName;
	private double price;
	private int status;
}
