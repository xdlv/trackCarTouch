package com.fyc.park.action;

import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public final static String FINISH = "finish", LOGIN = "login";
	private static Pattern SPLITE_PATTERN = Pattern.compile(",");
	
	public final static String USER_NAME = "";
	protected Logger log = Logger.getLogger(getClass());
	
	protected int start = 0;
	protected int limit = 0;
	
	protected int total = 0;
	protected int page = 0;
	protected long _dc;
	
	protected boolean success = true;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getTotal() {
		return total;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void set_dc(long _dc) {
		this._dc = _dc;
	}
	
	/*public int currentUserId(){
		return (Integer)ServletActionContext.getRequest().getSession().getAttribute("userId");
	}*/
	
	public boolean isSuccess() {
		return success;
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	protected int[] parseStatus(String st){
		String[] status = SPLITE_PATTERN.split(st, 0);
		int[] ret = new int[status.length];
		for (int i = 0; i < status.length; i++) {
			ret[i] = Integer.parseInt(status[i]);
		}
		return ret;
	}
}