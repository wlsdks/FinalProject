package com.project.finalProject.model;

public class TransactionVO {

	private int tranNo;
	private String tranPayment;
	private String tranWay;
	private int postNo;
	private int sellerNo;
	public int getTranNo() {
		return tranNo;
	}
	public void setTranNo(int tranNo) {
		this.tranNo = tranNo;
	}
	public String getTranPayment() {
		return tranPayment;
	}
	public void setTranPayment(String tranPayment) {
		this.tranPayment = tranPayment;
	}
	public String getTranWay() {
		return tranWay;
	}
	public void setTranWay(String tranWay) {
		this.tranWay = tranWay;
	}
	public int getPostNo() {
		return postNo;
	}
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}
	public int getSellerNo() {
		return sellerNo;
	}
	public void setSellerNo(int sellerNo) {
		this.sellerNo = sellerNo;
	}
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	private int memNo;
	
}
