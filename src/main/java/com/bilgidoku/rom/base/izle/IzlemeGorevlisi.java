package com.bilgidoku.rom.base.izle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.bilgidoku.rom.base.gunluk.GunlukGorevlisi;
import com.bilgidoku.rom.base.java.min.gorevli.GorevliDir;
import com.bilgidoku.rom.base.java.min.json.JSONObject;
import com.bilgidoku.rom.base.min.err.KnownError;
import com.bilgidoku.rom.base.min.gorevli.EnvItem;
import com.bilgidoku.rom.base.min.gorevli.Gorevli;
import com.bilgidoku.rom.base.min.gorevli.MC;
import com.bilgidoku.rom.base.run.KosuGorevlisi;
import com.bilgidoku.rom.base.run.timer.EveryMinute;

// private ThreadLocal<Will> will=new ThreadLocal<Will>();

// private static ThreadLocal<Active> thrActive = new ThreadLocal<Active>();
// private static ThreadLocal<String> thrConn = new ThreadLocal<String>();

// private final MonitorFilter filter=new MonitorFilter();

public class IzlemeGorevlisi extends GorevliDir implements EveryMinute {
	public static final int NO = 1;
	private EnvItem host;

	@Override
	protected EnvItem[] prepEnvItems() {
		host = EnvItem.create().setEnvName("ROM_DB_SERVER").setDefaultValue("localhost")
				.setNullable(false).setDescription("Postgresql server hostname or ip to connect");
		return new EnvItem[] { host };
	}

	private static IzlemeGorevlisi tek;

	@Override
	protected void bindDependency() {
		this.kg=KosuGorevlisi.bind(this);
		this.gg=GunlukGorevlisi.bind(this);
	}

	public static IzlemeGorevlisi bind(Gorevli binder) {
		if (tek == null) {
			synchronized (IzlemeGorevlisi.class) {
				if (tek == null) {
					tek = new IzlemeGorevlisi();
				}
			}
		}
		tek.binder(binder);
		return tek;
	}

	private IzlemeGorevlisi() {
		super("Izleme", NO);
	}

	@Override
	protected void kur() throws KnownError {
		kg.waitMin(this);
	}

	@Override
	protected void bitir(boolean dostca) {
		kg.waitMinRemove(this);
	}
	private GunlukGorevlisi gg;
	private KosuGorevlisi kg;

//	private final List<MC> modules = new LinkedList<MC>();

	private final Map<String, Set<String>> monitorSets = new HashMap<>();


	

	@Override
	public void everyMinute(int year, int month, int day, int hour, int minute) {

//		try {
//			JSONObject jo = logToJson();
//			if (jo.length() > 0)
//				GunlukGorevlisi.tek().log(LogCmds.stat, true, 0, "cntrs", jo);
//		} catch (JSONException e) {
//			Sistem.printStackTrace(e, "Monitor service everyMinute failed");
//		}
	}

	private JSONObject logToJson() throws KnownError {
		JSONObject jo = new JSONObject();
//		for (MC it : modules) {
//			JSONObject r = it.report();
//			if (r != null)
//				jo.put(it.getCode(), r);
//		}
		return jo;
	}

	@Override
	public void selfDescribe(JSONObject jo) {
//		jo.safePut("modulecount", modules.size());
//		jo.safePut("Eye", Eye.selfDescribe());
	}

	public void eyeOnReset() {
		boolean match = false;
//		for (MC mc : modules) {
//			String code = mc.getCode();
//			for (String pack : Eye.eyeOnPackage) {
//				if (code.startsWith(code)) {
//					match = true;
//					break;
//				}
//			}
//
//			mc.eyeOn(match);
//		}

	}

	public boolean hasErrors() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean assertEqual(String sname, int longtime) {
		// TODO Auto-generated method stub
		return false;
	}

	public void logStates() {
//		try {
//			JSONObject jo = logToJson();
//			System.out.println(jo.toString());
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}

	}

	public void addToSet(String name, String value) {
		Set<String> set = monitorSets.get(name);
		if (set == null) {
			set = new HashSet<String>();
			monitorSets.put(name, set);
		}
		if (set.contains(value))
			return;
		if (set.size() > 200) {
			set.clear();
		}
		set.add(value);
		gg.addToSet(name, value);
	}

}
