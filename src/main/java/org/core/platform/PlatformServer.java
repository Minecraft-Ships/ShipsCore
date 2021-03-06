package org.core.platform;

import org.core.entity.living.human.player.LivePlayer;
import org.core.entity.living.human.player.User;
import org.core.platform.tps.TPSExecutor;
import org.core.world.WorldExtent;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface PlatformServer {

    Set<WorldExtent> getWorlds();

    Optional<WorldExtent> getWorldByPlatformSpecific(String name);

    Collection<LivePlayer> getOnlinePlayers();

    Optional<User> getOfflineUser(UUID uuid);

    Optional<User> getOfflineUser(String lastName);

    Collection<User> getOfflineUsers();

    TPSExecutor getTPSExecutor();

    default Optional<WorldExtent> getWorld(String name, boolean justName) {
        if (justName) {
            return getWorlds().stream().filter(w -> w.getName().equals(name)).findAny();
        }
        return getWorldByPlatformSpecific(name);
    }

    default Optional<WorldExtent> getWorld(UUID uuid) {
        return getWorlds().stream().filter(w -> w.getUniqueId().equals(uuid)).findAny();
    }

    default double getTPS() {
        return getTPSExecutor().getTPS();
    }

    default double getTPS(int ticks) {
        return getTPSExecutor().getTPS(ticks);
    }
}
