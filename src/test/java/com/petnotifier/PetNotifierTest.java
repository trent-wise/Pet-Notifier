package com.petnotifier;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PetNotifierTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PetNotifierPlugin.class);
		RuneLite.main(args);
	}
}