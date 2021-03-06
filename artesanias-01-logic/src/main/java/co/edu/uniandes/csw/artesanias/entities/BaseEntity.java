/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.artesanias.entities;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author da.cortes11
 */
@MappedSuperclass
class BaseEntity implements Serializable{
   @Id
   @GeneratedValue(strategy =GenerationType.IDENTITY)
   private Long id;

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }
   
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
   
    
   
}
