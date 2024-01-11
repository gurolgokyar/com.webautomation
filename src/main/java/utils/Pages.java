package utils;

import pages.HomePage;
import pages.WebautomationPage;
import pages.draggable.*;
import pages.droppable.AcceptPage;
import pages.droppable.DroppablePage;
import pages.droppable.RevertDraggablePosition;
import pages.resizeable.ResizeablePage;
import pages.resizeable.SynchronusResizePage;
import pages.resizeable.TextAreaPage;

import java.awt.*;

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

    public SynchronusResizePage synchronusResizePage;

    public ResizeablePage resizeablePage;

    public TextAreaPage textAreaPage;
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
        resizeablePage = new ResizeablePage();
        synchronusResizePage = new SynchronusResizePage();
        textAreaPage = new TextAreaPage();
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

    public ResizeablePage getResizeablePage() {
        return resizeablePage;
    }

    public TextAreaPage getTextAreaPage(){
        return textAreaPage;
    }

    public SynchronusResizePage getSynchronusResizePage() {
        return synchronusResizePage;
    }
}
