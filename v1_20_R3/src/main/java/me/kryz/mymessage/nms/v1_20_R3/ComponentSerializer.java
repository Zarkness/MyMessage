package me.kryz.mymessage.nms.v1_20_R3;

import me.kryz.mymessage.common.processor.ComponentProcessor;
import net.kyori.adventure.text.Component;
import net.minecraft.network.chat.IChatBaseComponent;

public final class ComponentSerializer extends ComponentProcessor {

    public static IChatBaseComponent asLegacy(Component adventureComponent) {
        String json = GSON_COMPONENT_SERIALIZER.serialize(adventureComponent);
        return IChatBaseComponent.ChatSerializer.a(json);
    }

    public static IChatBaseComponent asLegacy(String adventureFormat) {
        var component = asMiniMessage(adventureFormat);
        String json = GSON_COMPONENT_SERIALIZER.serialize(component);
        return IChatBaseComponent.ChatSerializer.a(json);
    }

    public static String asJson(IChatBaseComponent adventureFormat) {
        return IChatBaseComponent.ChatSerializer.a(adventureFormat);
    }

    public static String asJson(net.kyori.adventure.text.Component component){
        return GSON_COMPONENT_SERIALIZER.serialize(component);
    }
}
