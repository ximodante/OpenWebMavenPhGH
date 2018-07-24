package openadmin.model.control;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.envers.Audited;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import openadmin.annotations.Default;
import openadmin.model.Audit;
import openadmin.model.Base;

@SuppressWarnings("serial")
@Entity
@ToString @NoArgsConstructor
@Table(name = "rolegroup", schema = "control")
@Audited
public class RoleGroup extends Audit implements Base, java.io.Serializable {

	//private static final long serialVersionUID = 22061801L;
	
	/** attribute that contains the identifier*/
	@Getter @Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Default(visible=true)
	private Long id;
	
	/** attribute that contains the program name (description), unique value*/
	@Getter
	@Size(min =3, max = 25)
	@NotNull
	@Column(name = "descripcio", unique=true)
	private String description;
	
	/**
	 * Constructor of the class Program.
	 * @param pDescription, is the description, (unique value), of the Program
	 */
	public RoleGroup(String pDescription) {
		
		setDescription(pDescription);
		
	}

	/** Getters and setters*/
	public void setDescription(String pDescription) {

		this.description = pDescription.toLowerCase();
	
	}	
}
