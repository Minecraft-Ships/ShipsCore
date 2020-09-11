package org.core.config;

import org.core.config.parser.Parser;
import org.core.config.parser.StringMapParser;
import org.core.config.parser.StringParser;

import java.util.Collection;
import java.util.Map;

public class ConfigurationNode {

    public abstract static class KnownParser<P, T> extends ConfigurationNode {

        public static class ChildKnown<T> extends KnownParser<Map<String, String>, T> {

            public ChildKnown(Parser<Map<String, String>, T> parser, String... path) {
                super(parser, path);
            }

            @Override
            public StringMapParser<T> getParser() {
                return (StringMapParser<T>) super.getParser();
            }
        }

        public static class CollectionKnown<T, K extends Collection<T>> extends KnownParser<String, T> {


            public CollectionKnown(Parser<String, T> parser, String... path) {
                super(parser, path);
            }

            @Override
            public StringParser<T> getParser() {
                return (StringParser<T>) super.getParser();
            }
        }

        public static class SingleKnown<T> extends KnownParser<String, T> {


            public SingleKnown(Parser<String, T> parser, String... path) {
                super(parser, path);
            }

            @Override
            public StringParser<T> getParser() {
                return (StringParser<T>) super.getParser();
            }
        }

        protected final Parser<P, T> parser;

        public KnownParser(Parser<P, T> parser, String... path) {
            super(path);
            this.parser = parser;
        }

        public Parser<P, T> getParser() {
            return this.parser;
        }
    }

    private final String[] path;

    public ConfigurationNode(String... path){
        if(path.length == 0){
            throw new IllegalArgumentException("Node must have a path specified");
        }
        this.path = path;
    }

    public String[] getPath(){
        return this.path;
    }

}
