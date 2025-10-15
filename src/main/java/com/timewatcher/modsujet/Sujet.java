package com.timewatcher.modsujet;

import net.minecraftforge.fml.common.Mod;
import com.timewatcher.modsujet.registry.ModItems;

@Mod(SwordMod.MOD_ID)
public class SwordMod {
    public static final String MOD_ID = "mod_sujet_phone";

    public SwordMod() {
        // Вызываем регистрацию нашего меча при запуске мода
        ModItems.register(); 
    }
}
