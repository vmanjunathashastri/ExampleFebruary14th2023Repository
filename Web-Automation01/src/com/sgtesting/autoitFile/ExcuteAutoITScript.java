package com.sgtesting.autoitFile;

public class ExcuteAutoITScript {

	public static void main(String[] args) {
		excuteScripts();


	}
	private static void excuteScripts()
	{
		try
		{
		Runtime runtime=Runtime.getRuntime();
		runtime.exec("F:\\autoIt\\autuitTest.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
