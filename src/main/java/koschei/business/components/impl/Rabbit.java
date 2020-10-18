package koschei.business.components.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import koschei.business.components.PrintStory;

@Component
public class Rabbit implements PrintStory {

    @Autowired
    PrintStory duck;

    @Override
    public PrintStory getNextStoryPart() {
        return duck;
    }

    @Override
    public String getText() {
        return "в зайце утка";
    }
}
