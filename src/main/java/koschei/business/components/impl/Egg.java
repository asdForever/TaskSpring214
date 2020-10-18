package koschei.business.components.impl;

import org.springframework.stereotype.Component;

import koschei.business.components.PrintStory;

@Component
public class Egg implements PrintStory {

    final PrintStory death;

    public Egg(PrintStory death) {
        this.death = death;
    }

    @Override
    public PrintStory getNextStoryPart() {
        return death;
    }

    @Override
    public String getText() {
        return "в яйце иголка";
    }
}
