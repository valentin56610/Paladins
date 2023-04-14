package net.paladins.fabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.paladins.PaladinsMod;
import net.paladins.item.armor.Armors;
import net.paladins.item.Group;

public class FabricMod implements ModInitializer {
    @Override
    public void onInitialize() {
        preInit();
        PaladinsMod.init();
//        SoundHelper.registerSounds();
//        subscribeEvents();
    }

    private void preInit() {
        Group.PALADINS = FabricItemGroupBuilder.build(
                new Identifier(PaladinsMod.ID, "general"),
                () -> new ItemStack(Armors.paladinArmorSet_t2.chest));
    }

    private void subscribeEvents() {
//        ServerLifecycleEvents.SERVER_STARTING.register(PaladinWorldGen::init);
//        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
//            LootHelper.configure(id, tableBuilder, PaladinsMod.lootConfig.value);
//        });
    }

}