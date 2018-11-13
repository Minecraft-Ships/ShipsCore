package org.core.configuration.parser.parsers;

import org.core.CorePlugin;
import org.core.configuration.parser.StringParser;
import org.core.world.WorldExtent;

import java.util.Optional;

public class StringToWorldParser implements StringParser<WorldExtent> {
    @Override
    public Optional<WorldExtent> parse(String original) {
        return CorePlugin.getServer().getWorldByPlatformSpecific(original);
    }

    @Override
    public String unparse(WorldExtent value) {
        return value.getPlatformUniquieId();
    }
}