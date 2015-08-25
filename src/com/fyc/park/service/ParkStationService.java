package com.fyc.park.service;

import java.util.Map;


public interface ParkStationService extends BaseService{

	public Map<?,?> getSlotInfo(String carLicense, int queryPlace);
}
