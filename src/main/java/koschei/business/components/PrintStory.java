/*
 * Copyright (C) Check24 Vergleichsportal Baufinanzierung GmbH - All Rights Reserved
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Created by Andrey Sorokin on 18.10.2020
 */

package koschei.business.components;

public interface PrintStory {

    PrintStory getNextStoryPart();
    String getText();

    default String printStory() {
        String result = getText();

        if (getNextStoryPart() != null) {
            result += ", " + getNextStoryPart().printStory();
        }

        return result;
    }
}
