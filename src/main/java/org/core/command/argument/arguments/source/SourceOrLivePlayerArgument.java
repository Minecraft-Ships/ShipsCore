package org.core.command.argument.arguments.source;

import org.core.command.argument.arguments.operation.OptionalArgument;
import org.core.entity.living.human.player.LivePlayer;

public class SourceOrLivePlayerArgument extends OptionalArgument<LivePlayer> {

    public SourceOrLivePlayerArgument(String id, LivePlayer def) {
        super(new LivePlayerArgument(id), (context, argument) -> {
            if (context.getSource() instanceof LivePlayer){
                return (LivePlayer)context.getSource();
            }
            return def;
        });
    }
}
