/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.artesanias.ejbs;

import co.edu.uniandes.csw.artesanias.persistence.feriaArtesanalPersistence;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author f.velasquez11
 */
@Stateless
public class PabellonLogic 
{
    @Inject private feriaArtesanalPersistence persistence;
    
}