package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;



/**
 * Vote entity managed by Ebean
 */
@Entity 
public class Vote extends Model {

    private static final long serialVersionUID = 1L;

    @Id
    public Long id;
    
    @ManyToOne
    public User createdBy;
    
    /**
     * Generic query helper for entity Vote with id Long
     */
    public static Model.Finder<Long,Vote> find = new Model.Finder<Long,Vote>(Long.class, Vote.class);

}

