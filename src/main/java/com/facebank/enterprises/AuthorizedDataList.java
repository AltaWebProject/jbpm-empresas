package com.facebank.enterprises;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class AuthorizedDataList implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(generator = "AUTHORIZEDDATALIST_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(sequenceName = "AUTHORIZEDDATALIST_ID_SEQ", name = "AUTHORIZEDDATALIST_ID_GENERATOR")
    private java.lang.Long id;

    public AuthorizedDataList() {
    }
    
    public AuthorizedDataList(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }




}