package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.alerts.ShowConfirm_Page;
import pages.alerts.ShowPrompt_Page;
import pages.autocomplete.AccentFolding_Page;
import pages.controlgroup.Toolbar_Page;
import pages.datepicker.DisplayMultipleMonths_Page;
import pages.datepicker.SelectDateRange_Page;
import pages.dialog.ModalForm_Page;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovement_Page;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.Handles_Page;
import pages.droppable.Accept_Page;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.RevertDraggablePosition_Page;
import pages.iframe.NestedIframe_Page;
import pages.iframe.NormalIframe_Page;
import pages.menu.Icons_Page;
import pages.progressbar.DownloadDialog_Page;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.SynchronusResize_Page;
import pages.resizable.TextArea_Page;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.Serialize_Page;

public class Pages {

    private AccentFolding_Page accentFoldingPage;

    private AlertTypes_Page alertTypesPage;

    private Animate_Page animatePage;

    private AutoScrolling_Page autoScrollingPage;

    private Accept_Page acceptPage;

    private ConstrainMovement_Page constrainMovementPage;

    private DisplayMultipleMonths_Page displayMultipleMonthsPage;

    private DownloadDialog_Page downloadDialogPage;

    private Draggable_DefFunc_Page draggableDefFuncPage;

    private Droppable_DefFunc_Page droppableDefFuncPage;

    private HomePage homePage;

    private Handles_Page handlesPage;

    private Icons_Page iconsPage;

    private ModalForm_Page modalFormPage;

    private NestedIframe_Page nestedIframePage;

    private NormalIframe_Page normalIframePage;

    private Resizable_DefFunc_Page resizableDefFuncPage;

    private RevertDraggablePosition_Page revertDraggablePositionPage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private SelectDateRange_Page selectDateRangePage;

    private Serialize_Page serializePage;

    private ShowConfirm_Page showConfirmPage;

    private ShowPrompt_Page showPromptPage;

    private SynchronusResize_Page synchronusResizePage;

    private TextArea_Page textAreaPage;

    private Toolbar_Page toolbarPage;

    private WebAutomationPage webAutomationPage;

    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new NestedIframe_Page();
        alertTypesPage = new AlertTypes_Page();
        animatePage = new Animate_Page();
        constrainMovementPage = new ConstrainMovement_Page();
        handlesPage = new Handles_Page();
        acceptPage = new Accept_Page();
        revertDraggablePositionPage = new RevertDraggablePosition_Page();
        synchronusResizePage = new SynchronusResize_Page();
        textAreaPage = new TextArea_Page();
        showConfirmPage = new ShowConfirm_Page();
        showPromptPage = new ShowPrompt_Page();
        normalIframePage = new NormalIframe_Page();
        serializePage = new Serialize_Page();
        accentFoldingPage = new AccentFolding_Page();
        iconsPage = new Icons_Page();
        downloadDialogPage = new DownloadDialog_Page();
        displayMultipleMonthsPage = new DisplayMultipleMonths_Page();
        selectDateRangePage = new SelectDateRange_Page();
        toolbarPage = new Toolbar_Page();
        modalFormPage = new ModalForm_Page();
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }

    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }

    public Resizable_DefFunc_Page getResizableDefFuncPage() {
        return resizableDefFuncPage;
    }

    public Selectable_DefFunc_Page getSelectableDefFuncPage() {
        return selectableDefFuncPage;
    }

    public NestedIframe_Page getNestedIframePage() {
        return nestedIframePage;
    }

    public AlertTypes_Page getAlertTypesPage() {
        return alertTypesPage;
    }

    public Animate_Page getAnimatePage() {
        return animatePage;
    }

    public ConstrainMovement_Page getConstrainMovementPage() {
        return constrainMovementPage;
    }

    public Handles_Page getHandlesPage() {
        return handlesPage;
    }

    public Accept_Page getAcceptPage() {
        return acceptPage;
    }

    public RevertDraggablePosition_Page getRevertDraggablePositionPage() {
        return revertDraggablePositionPage;
    }

    public SynchronusResize_Page getSynchronusResizePage() {
        return synchronusResizePage;
    }

    public TextArea_Page getTextAreaPage() {
        return textAreaPage;
    }

    public ShowConfirm_Page getShowConfirmPage() {
        return showConfirmPage;
    }

    public ShowPrompt_Page getShowPromptPage() {
        return showPromptPage;
    }

    public NormalIframe_Page getNormalIframePage() {
        return normalIframePage;
    }

    public Serialize_Page getSerializePage() {
        return serializePage;
    }

    public AccentFolding_Page getAccentFoldingPage() {
        return accentFoldingPage;
    }

    public Icons_Page getIconsPage() {
        return iconsPage;
    }

    public DownloadDialog_Page getDownloadDialogPage() {
        return downloadDialogPage;
    }

    public DisplayMultipleMonths_Page getDisplayMultipleMonthsPage() {
        return displayMultipleMonthsPage;
    }

    public SelectDateRange_Page getSelectDateRangePage() {
        return selectDateRangePage;
    }

    public Toolbar_Page getToolbarPage() {
        return toolbarPage;
    }

    public ModalForm_Page getModalFormPage() {
        return modalFormPage;
    }
}