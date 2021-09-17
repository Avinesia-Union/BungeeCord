package net.md_5.bungee.connection;

import java.net.Proxy;
import java.util.UUID;

import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;

public class AuthServiceSingleton {
	public static YggdrasilAuthenticationService authService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, UUID.randomUUID().toString());
	public static MinecraftSessionService sessionService = authService.createMinecraftSessionService();
}
