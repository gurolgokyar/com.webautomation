package org.inar.utils;

import org.inar.pages.HomePage;
import org.inar.pages.WebautomationPage;
import org.inar.pages.draggable.*;
import org.inar.pages.droppable.AcceptPage;
import org.inar.pages.droppable.DroppablePage;
import org.inar.pages.droppable.RevertDraggablePosition;

public class Pages {

    private HomePage homePage;

    private WebautomationPage webautomationPage;

    private DefaultFunctionalityPage defaultFunctionalityPage;

    private DraggablePage draggablePage;

    private AutoScrollingPage autoScrollingPage;

    private ConstantMovementPage constantMovementPage;

    private HandlesPage handlesPage;

    public DroppablePage droppablePage;

    public AcceptPage acceptPage;

    public RevertDraggablePosition revertDraggablePosition;
    public Pages(){
        homePage = new HomePage();
        webautomationPage = new WebautomationPage();
        defaultFunctionalityPage = new DefaultFunctionalityPage();
        draggablePage = new DraggablePage();
        autoScrollingPage = new AutoScrollingPage();
        constantMovementPage = new ConstantMovementPage();
        handlesPage = new HandlesPage();
        droppablePage = new DroppablePage();
        acceptPage = new AcceptPage();
        revertDraggablePosition = new RevertDraggablePosition();
    }

    public HomePage getHomePage(){
        return homePage;
    }

    public DefaultFunctionalityPage getDefaultFunctionalityPage(){
        return defaultFunctionalityPage;
    }

    public WebautomationPage getWebautomationPage(){
        return webautomationPage;
    }

    public DraggablePage getDraggablePage(){
        return draggablePage;
    }

    public AutoScrollingPage getAutoScrollingPage(){
        return autoScrollingPage;
    }

    public ConstantMovementPage getConstantMovementPage(){
        return constantMovementPage;
    }

    public HandlesPage getHandlesPage() {
        return handlesPage;
    }

    public DroppablePage getDroppablePage() {
        return droppablePage;
    }

    public AcceptPage getAcceptPage() {
        return acceptPage;
    }

    public RevertDraggablePosition getRevertDraggablePosition(){
        return revertDraggablePosition;
    }


}
