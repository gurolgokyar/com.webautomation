package droppableTest;

import baseTest.Hooks;
import utils.BrowserUtils;
import utils.Pages;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RevertDraggablePositionTest extends Hooks {

    Pages pages = new Pages();

    @BeforeEach
    void navigateToRevertDraggablePosition(){
        pages.getHomePage().clickWebAutomation();
        pages.getWebautomationPage().clickOnDroppableLink();
        pages.getDroppablePage().clickOnRevertDraggablePositionLink();
    }

    @AfterEach
    void navigateToHomePage(){
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com/");
    }

    @Test
    void testDragFirstBoxInBigBox(){
        Point initialPosition = pages.getRevertDraggablePosition().getLocationOfFirstBox();

        pages.getRevertDraggablePosition().dragFirstBoxInBigBox();

        BrowserUtils.wait(1);

        Point finalPosition = pages.getRevertDraggablePosition().getLocationOfFirstBox();

        //There would be negligible difference between last position and initial position after the box reverted
        boolean isNegligibleDifference = pages.getRevertDraggablePosition().isNegligibleDifference(initialPosition,
                finalPosition);
        assertTrue(isNegligibleDifference, "First box should not move to in big box");
    }

    @Test
    void testDragFirstBoxButNotInBigBox(){
        Point initialPosition = pages.getRevertDraggablePosition().getLocationOfFirstBox();

        pages.getRevertDraggablePosition().dragFirstBoxButNotInBigBox(0, 20);

        BrowserUtils.wait(1);

        Point finalPosition = pages.getRevertDraggablePosition().getLocationOfFirstBox();

        assertTrue(initialPosition.getY() < finalPosition.getY(), "Attempted to move first box, but it did not moved");
    }

    @Test
    void testDragSecondBoxInBigBox(){
        Point initialPosition = pages.getRevertDraggablePosition().getLocationOfSecondBox();

        pages.getRevertDraggablePosition().dragSecondBoxInBigBox();

        BrowserUtils.wait(1);

        Point finalPosition = pages.getRevertDraggablePosition().getLocationOfSecondBox();

        assertTrue(initialPosition.getY() < finalPosition.getY(), "Attempted to move second box in big box, but it " +
                "did not moved");

    }

    @Test
    void testDragSecondBoxButNotInBigBox(){
        Point initialPosition = pages.getRevertDraggablePosition().getLocationOfSecondBox();

        pages.getRevertDraggablePosition().dragSecondBoxButNotInBigBox(0, 20);

        BrowserUtils.wait(1);

        Point finalPosition = pages.getRevertDraggablePosition().getLocationOfSecondBox();

        boolean isNegligibleDifference = pages.getRevertDraggablePosition().isNegligibleDifference(initialPosition,
                finalPosition);

        assertTrue(isNegligibleDifference, "Second box should not move but in big box!");


    }

    @Test
    void testDragSecondBoxAfterDraggedInBigBox(){
        pages.getRevertDraggablePosition().dragSecondBoxInBigBox();

        BrowserUtils.wait(1);

        Point initialPosition = pages.getRevertDraggablePosition().getLocationOfSecondBox();

        pages.getRevertDraggablePosition().dragSecondBoxButNotInBigBox(100, 100);

        BrowserUtils.wait(1);

        Point finalPosition = pages.getRevertDraggablePosition().getLocationOfSecondBox();

        boolean isNegligibleDifference = pages.getRevertDraggablePosition().isNegligibleDifference(initialPosition,
                finalPosition);

        assertTrue(isNegligibleDifference, "Second box should not move out of big box when it is located " +
                "there");


    }
}
