package in.kibria.entities;

import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Table(name="crime")
@Entity
public class DataDAO implements Serializable {
    private static final long serialVersionUID =1L;

    @Id
    private int ID;
	private String Headline;
    private String Date;
    public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getHeadline() {
		return Headline;
	}
	public void setHeadline(String headline) {
		Headline = headline;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}

}