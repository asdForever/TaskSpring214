package koschei.business.components.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import koschei.business.components.PrintStory;

@Component
public class Ocean implements PrintStory {

    @Autowired
    private PrintStory island;

    @Override
    public PrintStory getNextStoryPart() {
        return island;
    }

    @Override
    public String getText() {
        return "на океане остров";
    }
}
