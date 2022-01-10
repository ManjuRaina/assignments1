package com.te.hibernate4;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Girl {
	@Id
	private int gid;
	private String name;
	
	@OneToMany(mappedBy = "girl")
	private List<Boy> Boys;
	

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Boy> getBoys() {
		return Boys;
	}

	public void setBoys(List<Boy> boys) {
		Boys = boys;
	}

	@Override
	public String toString() {
		return "Girl [gid=" + gid + ", " + (name != null ? "name=" + name + ", " : "")
				+ (Boys != null ? "Boys=" + Boys : "") + "]";
	}

	

}
