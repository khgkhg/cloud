package com.common;

/**
 *
 * 提供分页的对象的数据封装
 * */
public class PageInfo {
	private int pageNo = 1;
	
	private int pageSize = 10;
	
	private long totalCount;

	public PageInfo() {
	}
	
	public PageInfo(int pageNo ){
		this.pageNo = pageNo;
	}
	
	public PageInfo(int pageNo ,int pageSize){
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}
	
	public PageInfo(int pageNo ,int pageSize, long totalCount){
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
	}
	
	/**
	 * 获取本页第一条记录的序号
	 * @return
	 */
	public long getStart(){
		return pageSize * (pageNo-1) + 1;
	}
	
	/**
	 * 获取本页最后一条记录的序号
	 * @return
	 */
	public long getEnd(){
		return pageSize * pageNo;
	}
	
	/**
	 * 获取总页数
	 * @return
	 */
	public long getTotalPageCount(){
		if(pageSize==0)
		{
			return 0;
		}
		return (totalCount + pageSize - 1) / pageSize;
	}
	
	/**
	 * 该页是否有下一页
	 * @return boolean
	 */
	public boolean hasNextPage(){
		return pageNo < this.getTotalPageCount() ;
	}
	
	
	/**
	 * 该页是否有上一页
	 * @return boolean
	 */
	public boolean hasPreviousPage(){
		return pageNo > 1 ;
	}



	public int getPageSize() {
		return pageSize;
	}



	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}



	public int getPageNo() {
		return pageNo;
	}



	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}



	public long getTotalCount() {
		return totalCount;
	}



	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	
	
	
}
