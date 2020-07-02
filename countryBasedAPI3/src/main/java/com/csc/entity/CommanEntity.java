package com.csc.entity;
import java.io.Serializable;

public class CommanEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer comman_id;
    private Integer cmn;
    

    public CommanEntity() {
    }

    public CommanEntity(Integer comman_id,Integer cmn) {
        
        this.comman_id = comman_id;
        this.cmn = cmn;
        
    }

    public Integer getComman_id() {
        return comman_id;
    }

    public void setComman_id(Integer comman_id) {
        this.comman_id = comman_id;
    }

	public Integer getCmn() {
		return cmn;
	}

	public void setCmn(Integer cmn) {
		this.cmn = cmn;
	}
    
    
}