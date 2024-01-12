package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.draggable.*;
import pages.droppable.Droppable_DefFunc_Page;
import pages.iframe.NestedIframe_Page;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.selectable.Selectable_DefFunc_Page;

public class Pages {

    private AlertTypes_Page alertTypesPage;

    private Animate_Page animatePage;

    private AutoScrolling_Page autoScrollingPage;
    private Cursor_Style_Page cursorStylePage;

    private Draggable_DefFunc_Page draggableDefFuncPage;

    private Droppable_DefFunc_Page droppableDefFuncPage;
    private Events_Page eventsPagePage;

    private HomePage homePage;

    private NestedIframe_Page nestedIframePage;

    private Resizable_DefFunc_Page resizableDefFuncPage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private WebAutomationPage webAutomationPage;
    private Constrain_Movements_Page constrainMovementPage;
    private Handles_Page handlesPage;
    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        constrainMovementPage = new Constrain_Movements_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new NestedIframe_Page();
        alertTypesPage = new AlertTypes_Page();
        animatePage = new Animate_Page();
        cursorStylePage = new Cursor_Style_Page();
        eventsPagePage = new Events_Page();
        handlesPage = new Handles_Page();

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
    public Handles_Page getHandlesPage(){
        return handlesPage;
    }
    public Constrain_Movements_Page getConstrainMovementPage(){ return constrainMovementPage;}
    public Cursor_Style_Page getCursorStylePage(){return cursorStylePage;}

    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }
    public Events_Page getEventsPage(){
        return eventsPagePage;
    }

    public Resizable_DefFunc_Page getResizableDefFuncPage(){
        return resizableDefFuncPage;
    }

    public Selectable_DefFunc_Page getSelectableDefFuncPage(){
        return selectableDefFuncPage;
    }

    public NestedIframe_Page getNestedIframePage(){
        return nestedIframePage;
    }

    public AlertTypes_Page getAlertTypesPage(){
        return alertTypesPage;
    }

    public Animate_Page getAnimatePage(){
        return animatePage;
    }

}
