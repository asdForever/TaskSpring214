package koschei.business.components.impl;

import org.springframework.stereotype.Component;

import koschei.business.components.PrintStory;

@Component
public class Death implements PrintStory {

    @Override
    public PrintStory getNextStoryPart() {
        return null;
    }

    @Override
    public String getText() {
        return "смерть Кощея на игле :(";
    }
}
