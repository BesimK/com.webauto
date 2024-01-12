package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class Events_Page_Test extends Hooks {

    @Test
    void eventsTest() {
        //1.Open Url
        pages.getHomePage().clickOnWebAutomationLink();

        //2.Navigate to events tab
        pages.getEventsPage().clickEventsLink();

        //3.Test Draggable WebElement
        ArrayList<String> result = pages.getEventsPage().controlEleventhDraggable(100,100);

        //Control Before Drag
        for (int i = 0; i < 3; i++) {
            Assertions.assertEquals("0",result.get(i));
        }

        //Control after drag and drop
        Assertions.assertEquals("1",result.get(3));
        int dragCounter =Integer.parseInt(result.get(4));
        assertThat(dragCounter).isGreaterThan(0);
        Assertions.assertEquals("1",result.get(5));

        //Control after drag backwards
        Assertions.assertEquals("2",result.get(6));
        assertThat(Integer.parseInt(result.get(7))).isGreaterThan(dragCounter);
        Assertions.assertEquals("2",result.get(8));

        //Couldn't manage taking data while holding
        //Control after click and hold
        Assertions.assertEquals("3",result.get(9));
        assertThat(Integer.parseInt(result.get(10))).isGreaterThan(Integer.parseInt(result.get(7)));
        Assertions.assertEquals("3",result.get(11));

    }
}
