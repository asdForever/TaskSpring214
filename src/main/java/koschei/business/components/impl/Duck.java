package koschei.business.components.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import koschei.business.components.PrintStory;

@Component
public class Duck implements PrintStory {

    private final PrintStory egg;

    @Autowired
    public Duck(PrintStory egg) {
        this.egg = egg;
    }

    @Override
    public PrintStory getNextStoryPart() {
        return egg;
    }

    @Override
    public String getText() {
        return "в утке яйцо";
    }
}
