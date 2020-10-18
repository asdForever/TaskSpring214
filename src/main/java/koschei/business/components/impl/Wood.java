package koschei.business.components.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import koschei.business.components.PrintStory;

@Component
public class Wood implements PrintStory {

    private final PrintStory rabbit;

    @Autowired
    public Wood(PrintStory rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public PrintStory getNextStoryPart() {
        return rabbit;
    }

    @Override
    public String getText() {
        return "на дереве заяц";
    }
}
