package ui.factory;

import entiti.GrupoEmbalagem;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "grupoEmbalagemController")
@ViewScoped
public class GrupoEmbalagemController extends AbstractController<GrupoEmbalagem> {

    @Inject
    private EmbalagemController embalagemListController;

    public GrupoEmbalagemController() {
        // Inform the Abstract parent controller of the concrete GrupoEmbalagem?cap_first Entity
        super(GrupoEmbalagem.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
    }

    /**
     * Sets the "items" attribute with a List of Embalagem entities that
     * are retrieved from GrupoEmbalagem?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Embalagem page
     */
    public String navigateEmbalagemList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Embalagem_items", this.getSelected());
        }
        return "/entiti/embalagem/index";
    }

}
