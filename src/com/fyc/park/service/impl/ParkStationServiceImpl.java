package com.fyc.park.service.impl;

import java.util.Map;

import com.fyc.park.bean.MapliceandpositionMapper;
import com.fyc.park.service.ParkStationService;

public class ParkStationServiceImpl extends BaseServiceImpl implements
		ParkStationService {

	MapliceandpositionMapper mapliceandpositionMapper;
	public Map<?,?> getSlotInfo(String carLicense, int queryPlace){
		return mapliceandpositionMapper.getSlotInfo(carLicense, queryPlace);
	}
	
	public void setMapliceandpositionMapper(
			MapliceandpositionMapper mapliceandpositionMapper) {
		this.mapliceandpositionMapper = mapliceandpositionMapper;
	}
}
