package com.chyld.entities;

import com.chyld.enums.GenderEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "profiles")
public class Profile  {
    private int id;
    private int version;
    private GenderEnum gender;
    private int age;
    private int height;
    private int weight;
    private User user;
    private Date created;
    private Date modified;


    @Id
    @GeneratedValue
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    @Version
    public int getVersion() {return version;}
    public void setVersion(int version) {this.version = version;}

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('M', 'F')")
    public GenderEnum getGender() {return gender;}
    public void setGender(GenderEnum gender) {this.gender = gender;}

    @Column(nullable = false)
    public int getAge() {return age; }
    public void setAge(int age) {this.age = age; }

    @Column(nullable = false)
    public int getHeight() { return height;   }
    public void setHeight(int height) { this.height = height;   }

    @Column(nullable = false)
    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn( name = "user_id")
    @JsonIgnore
    public User getUser() {return user; }
    public void setUser(User user) {this.user = user; }

    @CreationTimestamp
    public Date getCreated() {return created;}
    public void setCreated(Date created) {this.created = created;}

    @UpdateTimestamp
    public Date getModified() {return modified;}
    public void setModified(Date modified) {this.modified = modified;}




}
