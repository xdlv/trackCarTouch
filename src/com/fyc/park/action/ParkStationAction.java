package com.fyc.park.action;

import java.util.Map;

import com.fyc.park.bean.Mapliceandposition;
import com.fyc.park.bean.Mappositionandquerypic;
import com.fyc.park.service.ParkStationService;

public class ParkStationAction extends BaseAction {

	private Mapliceandposition mlp;
	private Mappositionandquerypic mpq;
	
	private Map<?, ?> slotInfoMap;
	
	private ParkStationService parkStationService;

	public String obtainSlotInfo() {
		slotInfoMap = parkStationService.getSlotInfo(mlp.getCarlicense(), mpq.getQueryplace());
		return SUCCESS;
	}
	
	public Mapliceandposition getMlp() {
		return mlp;
	}


	public void setMlp(Mapliceandposition mlp) {
		this.mlp = mlp;
	}


	public Mappositionandquerypic getMpq() {
		return mpq;
	}


	public void setMpq(Mappositionandquerypic mpq) {
		this.mpq = mpq;
	}

	public Map<?, ?> getSlotInfoMap() {
		return slotInfoMap;
	}

	public void setParkStationService(ParkStationService parkStationService) {
		this.parkStationService = parkStationService;
	}
}
