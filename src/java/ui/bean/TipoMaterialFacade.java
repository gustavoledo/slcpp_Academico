/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui.bean;

import entiti.TipoMaterial;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrador
 * @author Wellington Duarte
 */
@Stateless
public class TipoMaterialFacade extends AbstractFacade<TipoMaterial> {
    @PersistenceContext(unitName = "slcpp_AcademicoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoMaterialFacade() {
        super(TipoMaterial.class);
    }

}
