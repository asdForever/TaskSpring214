package koschei.business.components.impl;

import org.springframework.stereotype.Component;

import koschei.business.components.PrintStory;

@Component
public class Island implements PrintStory {

    private PrintStory wood;

    public Island(PrintStory wood) {
        this.wood = wood;
    }

    @Override
    public PrintStory getNextStoryPart() {
        return wood;
    }

    @Override
    public String getText() {
        return "на острове дерево";
    }
}
