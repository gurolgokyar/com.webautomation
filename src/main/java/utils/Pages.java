package utils;

import pages.HomePage;
import pages.WebautomationPage;
import pages.alert.AlertPage;
import pages.alert.AlertTypesPage;
import pages.autocomplate.AccentFoldingPage;
import pages.autocomplate.AutocompletePage;
import pages.controlGroup.ControlGroupPage;
import pages.controlGroup.ToolbarPage;
import pages.dialog.DialogPage;
import pages.dialog.ModelFormPage;
import pages.draggable.*;
import pages.droppable.AcceptPage;
import pages.droppable.DroppablePage;
import pages.droppable.RevertDraggablePosition;
import pages.iframe.IframePage;
import pages.iframe.NormalIframePage;
import pages.menu.IconsPage;
import pages.menu.MenuPage;
import pages.progressBar.DownLoadDialogPage;
import pages.progressBar.ProgressbarPage;
import pages.resizeable.ResizeablePage;
import pages.resizeable.SynchronusResizePage;
import pages.resizeable.TextAreaPage;
import pages.selectable.SelectablePage;
import pages.selectable.SerializePage;
import pages.slider.SliderPage;
import pages.slider.SnapToIncrementPage;
import pages.spinner.SpinnerOverFlowPage;
import pages.spinner.SpinnerPage;

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

	public SliderPage sliderPage;

	public SnapToIncrementPage snapToIncrementPage;

	public SpinnerOverFlowPage spinnerOverFlowPage;

	public SpinnerPage spinnerPage;

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
		sliderPage = new SliderPage();
		snapToIncrementPage = new SnapToIncrementPage();
		spinnerOverFlowPage = new SpinnerOverFlowPage();
		spinnerPage = new SpinnerPage();

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

	public IconsPage getIconsPage() {
		return new IconsPage();
	}

	public MenuPage getMenuPage() {
		return new MenuPage();
	}

	public DialogPage getDialogPage() {
		return new DialogPage();
	}

	public ModelFormPage getModelFormPage() {
		return new ModelFormPage();
	}

	public ControlGroupPage getControlGroupPage() {
		return new ControlGroupPage();
	}

	public ToolbarPage getToolbarPage() {
		return new ToolbarPage();
	}

	public ProgressbarPage getProgressbarPage() {
		return new ProgressbarPage();
	}

	public DownLoadDialogPage getDownLoadDialogPage() {
		return new DownLoadDialogPage();
	}

	public SliderPage getSliderPage(){
		return sliderPage;
	}

	public SnapToIncrementPage getSnapToIncrementPage(){
		return snapToIncrementPage;
	}

	public SpinnerPage getSpinnerPage(){
		return spinnerPage;
	}

	public SpinnerOverFlowPage getSpinnerOverFlowPage(){
		return spinnerOverFlowPage;
	}


}
