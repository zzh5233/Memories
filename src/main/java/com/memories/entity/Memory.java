package com.memories.entity;

import java.io.Serializable;
import java.util.Date;

public class Memory implements Serializable {
	private String picture;		//图片
	private String description;	//描述
	private Mood mood;	//心情 
	private String weather;	//天气
	private Date moment;	//产生时刻
	private String location;	//位置
	
	
	
}
