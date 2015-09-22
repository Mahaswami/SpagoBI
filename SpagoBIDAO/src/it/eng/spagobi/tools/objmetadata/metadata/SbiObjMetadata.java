/* SpagoBI, the Open Source Business Intelligence suite

 * Copyright (C) 2012 Engineering Ingegneria Informatica S.p.A. - SpagoBI Competency Center
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0, without the "Incompatible With Secondary Licenses" notice. 
 * If a copy of the MPL was not distributed with this file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package it.eng.spagobi.tools.objmetadata.metadata;
// Generated 18-nov-2009 17.58.49 by Hibernate Tools 3.1.0 beta3

import it.eng.spagobi.commons.metadata.SbiDomains;
import it.eng.spagobi.commons.metadata.SbiHibernateModel;

import java.util.Date;


/**
 * SbiObjMetadata generated by hbm2java
 */

public class SbiObjMetadata  extends SbiHibernateModel {


    // Fields    

     private Integer objMetaId;
     private String label;
     private String name;
     private String description;
     private SbiDomains dataType;
     private Date creationDate;


    // Constructors

    /** default constructor */
    public SbiObjMetadata() {
    }

	/** minimal constructor */
    public SbiObjMetadata(Integer objMetaId, String label, String name, SbiDomains dataType, Date creationDate) {
        this.objMetaId = objMetaId;
        this.label = label;
        this.name = name;
        this.dataType = dataType;
        this.creationDate = creationDate;
    }
    
    /** full constructor */
    public SbiObjMetadata(Integer objMetaId, String label, String name, String description, SbiDomains dataType, Date creationDate) {
        this.objMetaId = objMetaId;
        this.label = label;
        this.name = name;
        this.description = description;
        this.dataType = dataType;
        this.creationDate = creationDate;
    }
    

   
    // Property accessors

    public Integer getObjMetaId() {
        return this.objMetaId;
    }
    
    public void setObjMetaId(Integer objMetaId) {
        this.objMetaId = objMetaId;
    }

    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public SbiDomains getDataType() {
        return this.dataType;
    }
    
    public void setDataType(SbiDomains dataType) {
        this.dataType = dataType;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
   








}