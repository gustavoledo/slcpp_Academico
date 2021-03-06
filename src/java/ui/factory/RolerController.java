package ui.factory;

import entiti.Roler;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "rolerController")
@ViewScoped
public class RolerController extends AbstractController<Roler> {

    @Inject
    private UsuarioRolerController UsuarioRolerListController;

    public RolerController() {
        // Inform the Abstract parent controller of the concrete Roler?cap_first Entity
        super(Roler.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
    }

    /**
     * Sets the "items" attribute with a List of Usuario entities that are
     * retrieved from Roler?cap_first and returns the navigation outcome.
     *
     * @return navigation outcome for Usuario page
     *
    public String navigateUsuarioList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Usuario_items", this.getSelected().getUsuarioList());
        }
        return "/entiti/usuario/index";
    }
    */
    
    public String navigateUsuarioRolerList(){
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("UsuarioRoler_items", this.getSelected().getUsuarioRolerList());
        }
        return "/entiti/usuarioroler/index";
    }

}
