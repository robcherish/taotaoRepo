package com.taotao.common.pojo;

import java.util.List;

public class EasyUIDataGridResult {
	private long total;
	//?代表啥类型都行,T是类型确定是T
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
