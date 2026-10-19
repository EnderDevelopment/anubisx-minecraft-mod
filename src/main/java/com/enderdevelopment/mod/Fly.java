package com.enderdevelopment.mod;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class Fly {
    private static final KeyBinding FLY_KEY = new KeyBinding("key.fly", 74, "category.enderdevelopment");
    private static boolean isFlying = false;

    public static void registerKeyBinding() {
        MinecraftClient.getInstance().options.addKeyBinding(FLY_KEY);
    }

    public static void onKeyPress() {
        if (FLY_KEY.wasPressed()) {
            toggleFly();
        }
    }

    private static void toggleFly() {
        MinecraftClient client = MinecraftClient.getInstance();
        ClientPlayerEntity player = client.player;
        if (player != null) {
            isFlying = !isFlying;
            player.getAbilities().flying = isFlying;
            player.sendAbilitiesUpdate();
            player.sendMessage(Text.literal("Fly " + (isFlying ? "enabled" : "disabled")).formatted(isFlying ? Formatting.GREEN : Formatting.RED), true);
        }
    }
}