package com.bilgidoku;

import java.util.HashSet;

import com.bilgidoku.rom.base.gunluk.GunlukGorevlisi;
import com.bilgidoku.rom.base.java.min.OrtamInit;
import com.bilgidoku.rom.base.java.min.json.JSONArray;
import com.bilgidoku.rom.base.java.min.json.JSONObject;
import com.bilgidoku.rom.base.min.err.KnownError;

public class Dene {

	public static void main(String[] args) throws KnownError {
//		OrtamInit.prod();
//		
//		GunlukGorevlisi gg = GunlukGorevlisi.bind(null);
//		
//		OrtamInit.basla();
//		gg.log("dnt", false, 0, new JSONObject());
		HashSet<String> k=new HashSet<>();
		k.add("bir");
		k.add("iki");
		JSONArray a=new JSONArray(k);
		System.out.println(a);

		JSONArray b=new JSONArray();
		System.out.println(b);

	
	}

}
