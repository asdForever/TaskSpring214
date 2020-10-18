package koschei.business.components.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import koschei.business.components.PrintStory;

@Component
public class KoscheiTheDeathless implements PrintStory {

    private PrintStory ocean;

    @Autowired
    public void setOcean(PrintStory ocean) {
        this.ocean = ocean;
    }

    @Override
    public String getText() {
        return "На свете есть океан";
    }

    @Override
    public PrintStory getNextStoryPart() {
        return ocean;
    }
}
