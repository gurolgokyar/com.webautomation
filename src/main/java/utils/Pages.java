package utils;

import pages.HomePage;
import pages.WebautomationPage;
import pages.alertPage.AlertPage;
import pages.alertPage.AlertTypesPage;
import pages.autocomplate.AccentFoldingPage;
import pages.autocomplate.AutocompletePage;
import pages.draggable.*;
import pages.droppable.AcceptPage;
import pages.droppable.DroppablePage;
import pages.droppable.RevertDraggablePosition;
import pages.iframe.IframePage;
import pages.iframe.NormalIframePage;
import pages.resizeable.ResizeablePage;
import pages.resizeable.SynchronusResizePage;
import pages.resizeable.TextAreaPage;
import pages.selectable.SelectablePage;
import pages.selectable.SerializePage;

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

	public SelectablePage selectablePage;

	public SerializePage serializePage;

	public AlertPage alertPage;

	public AlertTypesPage alertTypesPage;

	public NormalIframePage normalIframePage;

	public IframePage iframePage;

	public Pages() {
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
		selectablePage = new SelectablePage();
		serializePage = new SerializePage();
		alertPage = new AlertPage();
		alertTypesPage = new AlertTypesPage();
		normalIframePage = new NormalIframePage();

	}

	public HomePage getHomePage() {
		return homePage;
	}

	public DefaultFunctionalityPage getDefaultFunctionalityPage() {
		return defaultFunctionalityPage;
	}

	public WebautomationPage getWebautomationPage() {
		return webautomationPage;
	}

	public DraggablePage getDraggablePage() {
		return draggablePage;
	}

	public AutoScrollingPage getAutoScrollingPage() {
		return autoScrollingPage;
	}

	public ConstantMovementPage getConstantMovementPage() {
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

	public RevertDraggablePosition getRevertDraggablePosition() {
		return revertDraggablePosition;
	}

	public ResizeablePage getResizeablePage() {
		return resizeablePage;
	}

	public TextAreaPage getTextAreaPage() {
		return textAreaPage;
	}

	public SynchronusResizePage getSynchronusResizePage() {
		return synchronusResizePage;
	}

	public SelectablePage getSelectablePage() {
		return selectablePage;
	}

	public SerializePage getSerializePage() {
		return serializePage;
	}

	public AlertPage getAlertPage() {
		return alertPage;
	}

	public AlertTypesPage getAlertTypesPage() {
		return alertTypesPage;
	}

	public NormalIframePage getNormalIframePage() {
		return normalIframePage;
	}

	public IframePage getIframePage() {
		return new IframePage();
	}

	public AutocompletePage getAutocompletePage() {
		return new AutocompletePage();
	}

	public AccentFoldingPage getAccentFoldingPage() {
		return new AccentFoldingPage();
	}

}
