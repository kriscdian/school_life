package com.even.myo2o.service;

import com.even.myo2o.dto.UserShopMapExecution;
import com.even.myo2o.entity.UserShopMap;

public interface UserShopMapService {

	UserShopMapExecution listUserShopMap(UserShopMap userShopMapCondition,
			int pageIndex, int pageSize);

}
