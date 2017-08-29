/**
 * UploadFileService.java
 * Created at 2017年8月25日
 * Created by zhaojiong
 * Copyright (C) 2017 SHANGHAI VOLKSWAGEN, All rights reserved.
 */
package com.zhao.service;

import java.io.File;

/**
 * <p>ClassName: UploadFileService</p>
 * <p>Description: TODO</p>
 * <p>Author: zhaojiong</p>
 * <p>Date: 2017年8月25日</p>
 */
public class UploadFileService {
	
	public Boolean execute(){
	String savePath = "/WEB-INF/upload";
	File file = new File(savePath);
	
	return true;
}
}