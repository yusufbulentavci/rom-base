package com.bilgidoku.rom.base.ilk.util;

public interface RomEventListener <K> {
	public boolean romEvent(K k, int code, Object more);
}
