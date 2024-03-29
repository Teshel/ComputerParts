package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;
import play.*;

@Entity
public class GPU extends Model {
	@ManyToOne
	public Build build;
	
	public String name;
	public String brand;
    public String requires;
    public int vram;
    
    public GPU(String name) {
    	this.name = name;
	}
}