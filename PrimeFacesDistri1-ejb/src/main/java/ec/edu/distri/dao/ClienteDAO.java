/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.distri.dao;

import ec.edu.distri.common.dao.DefaultGenericDAOImple;
import ec.edu.distri.modelo.Cliente;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author RAUL
 */
@LocalBean
@Stateless 
public class ClienteDAO extends DefaultGenericDAOImple<Cliente, Integer> {
    public ClienteDAO() {
        super(Cliente.class);
    }
}
