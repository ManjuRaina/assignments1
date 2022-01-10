package com.te.hibernate2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Girl {
	@Id
	private int gid;
	private String name;
	
	@OneToOne
	private Boy boy;

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

	public Boy getBoy() {
		return boy;
	}

	public void setBoy(Boy boy) {
		this.boy = boy;
	}

	@Override
	public String toString() {
		return "Girl [gid=" + gid + ", " + (name != null ? "name=" + name + ", " : "")
				+ (boy != null ? "boy=" + boy : "") + "]";
	}
	
	

}
