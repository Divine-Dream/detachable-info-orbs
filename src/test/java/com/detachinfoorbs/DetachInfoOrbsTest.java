package com.detachinfoorbs;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class DetachInfoOrbsTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(DetachInfoOrbsPlugin.class);
		RuneLite.main(args);
	}
}