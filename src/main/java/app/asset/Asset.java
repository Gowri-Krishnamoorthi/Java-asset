package app.asset;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Asset {
	@Id
    int asset_id;
    String asset_type;
    @OneToOne
    Employee emp;
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Asset(int asset_id, String asset_type, Employee emp) {
		super();
		this.asset_id = asset_id;
		this.asset_type = asset_type;
		this.emp = emp;
	}
	
    
    
}
