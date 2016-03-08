/*
 * Copyright 2016 inpwtepydjuf@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mmarquee.automation.controls;

import mmarquee.automation.AutomationElement;
import mmarquee.automation.controls.AutomationBase;
import mmarquee.automation.pattern.PatternNotFoundException;
import mmarquee.automation.pattern.SelectionItem;
import mmarquee.automation.uiautomation.*;

/**
 * Created by inpwt on 09/02/2016.
 */
public class AutomationListItem extends AutomationBase {

    private SelectionItem selectItemPattern;

    public AutomationListItem(AutomationElement element, IUIAutomation uiAuto) {
        super(element, uiAuto);

        try {
            this.selectItemPattern = this.getSelectItemPattern();
        } catch (PatternNotFoundException ex) {
            // Handle this nicely somehow
        }
    }

    public void select() {
        this.selectItemPattern.select();
    }

}