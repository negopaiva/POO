package CartaoWeb;

public class DiadosNamorados extends CartaoWeb{
	
	

	public DiadosNamorados() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DiadosNamorados(String destinatario) {
		super(destinatario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ShowMessage() {
		System.out.println("Feliz dia dos namorados! \t" + getDestinatario() + " S2\n");
		
		
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public String toString() {
		return "DiadosNamorados [getDestinatario()=" + getDestinatario() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
