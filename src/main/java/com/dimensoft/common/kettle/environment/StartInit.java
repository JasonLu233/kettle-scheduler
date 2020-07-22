package com.dimensoft.common.kettle.environment;

import org.springframework.beans.factory.InitializingBean;

public class StartInit implements InitializingBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		//初始化环境***
//		com.dimensoft.common.kettle.environment.KettleInit.init();
		com.dimensoft.common.kettle.environment.KettleInit.environmentInit();
		org.pentaho.di.core.KettleEnvironment.init();
	}

}
