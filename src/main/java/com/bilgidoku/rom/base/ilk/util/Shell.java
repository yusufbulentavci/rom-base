package com.bilgidoku.rom.base.ilk.util;

public class Shell {

//	
//	public static String safeExec(String... params){
//		ProcessBuilder pb = new ProcessBuilder(params);
//		String output;
//		try {
//			Process p = pb.start();
//			p.waitFor();
//			output = IOUtils.toString(pb.start().getInputStream(), Charset.defaultCharset());
//			return output;
//		} catch (IOException | InterruptedException e) {
//			return "error";
//		}
//	}
//	
//	public static String execIgnoreExitCode(String... params) throws KnownError {
//		ProcessBuilder pb = new ProcessBuilder(params);
//		String output;
//		try {
//			Process p = pb.start();
//			p.waitFor();
//			output = IOUtils.toString(pb.start().getInputStream(), Charset.defaultCharset());
//			return output;
//		} catch (IOException | InterruptedException e) {
//			throw new KnownError("Process exec failed:" + StringUtils.join(params, " "), e);
//
//		}
//	}
//	
//	public static String exec(String... params) throws KnownError {
//		ProcessBuilder pb = new ProcessBuilder(params);
//		String output;
//		try {
//			Process p = pb.start();
//			p.waitFor(10, TimeUnit.SECONDS);
//			output = IOUtils.toString(p.getInputStream(), Charset.defaultCharset());
//			if (p.exitValue() == 0) {
//				return output;
//			}
//			if(output==null  || output.length()==0){
//				output=IOUtils.toString(p.getErrorStream(), Charset.defaultCharset());
//			}
//			throw new KnownError("Process exec failed:" + StringUtils.join(params, " ") + " Output:" + output);
//
//		} catch (IOException | InterruptedException e) {
//			throw new KnownError("Process exec failed:" + StringUtils.join(params, " "), e);
//
//		}
//	}
//	
//	public static void main(String[] args) throws KnownError {
//		System.out.println(Shell.exec("ls -sk"));
////		Shell.exec("ls");
//	}
}
