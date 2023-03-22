package com.bilgidoku;

import com.bilgidoku.rom.base.gunluk.GunlukGorevlisi;
import com.bilgidoku.rom.base.java.min.OrtamInit;
import com.bilgidoku.rom.base.java.min.json.JSONObject;
import com.bilgidoku.rom.base.min.err.KnownError;

public class Dene {

	public static void main(String[] args) throws KnownError {
		OrtamInit.prod();
		
		GunlukGorevlisi gg = GunlukGorevlisi.bind(null);
		
		OrtamInit.basla();
		gg.log("dnt", false, 0, new JSONObject());
		
	}

}
