package com.csc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comman")
public class Comman implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer comman_id;
    private Integer cmn;
    private City city;
    private State state;

    public Comman() {
    }

    public Comman(City city,Integer cmn,State state) {
        this.city = city;
        this.cmn = cmn;
        this.state = state;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "comman_id", unique = true, nullable = false)
    public Integer getComman_id() {
        return this.comman_id;
    }

    public void setComman_id(Integer comman_id) {
        this.comman_id = comman_id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cityId", nullable = false)
    public City getCity() {
        return this.city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "State", nullable = false)
    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    
    
    @Column(name = "cmn", nullable = false, length = 250)
    public Integer getCmn() {
        return this.cmn;
    }

    public void setCmn(Integer cmn) {
        this.cmn = cmn;
    }

}