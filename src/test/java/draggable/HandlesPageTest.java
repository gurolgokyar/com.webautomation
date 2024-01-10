package draggable;

import baseTest.Hooks;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HandlesPageTest extends Hooks {
    int initialXOfDraggable;
    int initialYOfDraggable;

    int finalXOfDraggable;
    int finalYOfDraggable;

    @BeforeEach
    void navigateToWebOrderPage(){
        pages.getWebautomationPage().clickOnDraggableButton();
        pages.getDraggablePage().clickOnTheHandlesButton();
        pages.getHomePage().clickWebAutomation();
    }
    @Test
    void testDraggable1WithDraggableArea() throws InterruptedException {
        initialXOfDraggable = pages.getHandlesPage().getLocalOfDraggableX(pages.getHandlesPage().getDraggable1());
        initialYOfDraggable = pages.getHandlesPage().getLocalOfDraggableY(pages.getHandlesPage().getDraggable1());

        //Drag first draggable with draggable area
        pages.getHandlesPage().dragAndDropFirstDraggableWithDraggableArea(30, 30);

        finalXOfDraggable = pages.getHandlesPage().getLocalOfDraggableX(pages.getHandlesPage().getDraggable1());
        finalYOfDraggable = pages.getHandlesPage().getLocalOfDraggableY(pages.getHandlesPage().getDraggable1());

        assertTrue(initialXOfDraggable < finalXOfDraggable, "Attempted draggable1 to drag by draggable area and " +
                "draggable did not remove");
        assertTrue(initialYOfDraggable < finalYOfDraggable, "Attempted draggable1 to drag by draggable area and " +
                "draggable did not remove");

    }

    @Test
    void testDraggable1WithUnDraggableArea() throws InterruptedException {
        initialXOfDraggable = pages.getHandlesPage().getLocalOfDraggableX(pages.getHandlesPage().getDraggable1());
        initialYOfDraggable = pages.getHandlesPage().getLocalOfDraggableY(pages.getHandlesPage().getDraggable1());

        //Drag first draggable with unDraggable area
        pages.getHandlesPage().dragAndDropFirstDraggableWithUnDraggableArea(30, 30);

        //For draggable1
        finalXOfDraggable = pages.getHandlesPage().getLocalOfDraggableX(pages.getHandlesPage().getDraggable1());
        finalYOfDraggable = pages.getHandlesPage().getLocalOfDraggableY(pages.getHandlesPage().getDraggable1());

        assertEquals(initialXOfDraggable, finalXOfDraggable, "Attempted draggable1 to drag by undraggable area and " +
                "draggable removed");
        assertEquals(initialYOfDraggable, finalYOfDraggable, "Attempted draggable1 to drag by undraggable area and " +
                "draggable removed");
    }

    @Test
    void testDraggable2WithDraggableArea() throws InterruptedException {
        initialXOfDraggable = pages.getHandlesPage().getLocalOfDraggableX(pages.getHandlesPage().getDraggable2());
        initialYOfDraggable = pages.getHandlesPage().getLocalOfDraggableY(pages.getHandlesPage().getDraggable2());

        //Drag second draggable with draggable area
        pages.getHandlesPage().dragAndDropSecondDraggableWithDraggableArea(30, 30);

        finalXOfDraggable = pages.getHandlesPage().getLocalOfDraggableX(pages.getHandlesPage().getDraggable2());
        finalYOfDraggable = pages.getHandlesPage().getLocalOfDraggableY(pages.getHandlesPage().getDraggable2());

        assertTrue(initialXOfDraggable < finalXOfDraggable, "Attempted draggable2 to drag by draggable area and " +
                "draggable did not remove");
        assertTrue(initialYOfDraggable < finalYOfDraggable, "Attempted draggable2 to drag by draggable area and " +
                "draggable did not remove");

    }

    @Test
    void testDraggable2WithUnDraggableArea() {
        initialXOfDraggable = pages.getHandlesPage().getLocalOfDraggableX(pages.getHandlesPage().getDraggable2());
        initialYOfDraggable = pages.getHandlesPage().getLocalOfDraggableY(pages.getHandlesPage().getDraggable2());

        //Drag second draggable with unDraggable area
        pages.getHandlesPage().dragAndDropSecondDraggableWithUnDraggableArea(30, 30);

        finalXOfDraggable = pages.getHandlesPage().getLocalOfDraggableX(pages.getHandlesPage().getDraggable2());
        finalYOfDraggable = pages.getHandlesPage().getLocalOfDraggableY(pages.getHandlesPage().getDraggable2());

        assertEquals(initialXOfDraggable, finalXOfDraggable, "Attempted draggable2 to drag by undraggable area and " +
                "draggable removed");
        assertEquals(initialYOfDraggable, finalYOfDraggable, "Attempted draggable2 to drag by undraggable area and " +
                "draggable removed");
    }
}
