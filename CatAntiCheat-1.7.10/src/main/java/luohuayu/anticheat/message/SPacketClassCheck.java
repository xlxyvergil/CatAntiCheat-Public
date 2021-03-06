package luohuayu.anticheat.message;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.List;

public class SPacketClassCheck implements IMessage {
    public List<String> classList;

    @Override
    public void fromBytes(ByteBuf buf) {
        int size = buf.readShort();
        classList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            classList.add(ByteBufUtils.readUTF8String(buf));
        }
    }

    @Override
    public void toBytes(ByteBuf buf) { }
}
