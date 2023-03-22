package com.bilgidoku.rom.base.ilk.util;

public interface EventSource<K> {
	
	void subscribe(RomEventListener<K> l);
	
	void unsubscribe(RomEventListener<K> l);

	void broadcast(K k, int code, Object... more);

}
