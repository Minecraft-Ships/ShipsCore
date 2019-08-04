package org.core.world.boss;

import org.core.entity.living.human.player.LivePlayer;
import org.core.text.Text;
import org.core.world.boss.colour.BossColour;

import java.util.Set;

public interface ServerBossBar {

    Text getMessage();
    ServerBossBar setMessage(Text text);

    BossColour getColour();
    ServerBossBar setColour(BossColour colour);

    int getValue();
    ServerBossBar setValue(int value);

    Set<LivePlayer> getPlayers();
    ServerBossBar register(LivePlayer... players);
    ServerBossBar deregister(LivePlayer... players);

    default ServerBossBar setValue(int min, int value, int max){
        return setValue(value - min, value - max);
    }

    default ServerBossBar setValue(int value, int max){
        return setValue((int)(value * 100.0f) / max);
    }

    default ServerBossBar deregisterPlayers(){
        return deregister(getPlayers().toArray(new LivePlayer[1]));
    }
}
