package com.bilgidoku.rom.base.ilk.util;

public class Pair<B,I> {
	private B bir;
	private I iki;
	
	public Pair(B bir, I iki) {
		super();
		this.bir = bir;
		this.iki = iki;
	}
	
	public B getBir() {
		return bir;
	}
	public void setBir(B bir) {
		this.bir = bir;
	}
	public I getIki() {
		return iki;
	}
	public void setIki(I iki) {
		this.iki = iki;
	}
}
