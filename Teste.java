
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Prato pr = new Prato(1,"Hamburguer", 7.8);
      Ementa lista = new Ementa();
      lista.AddPrato(pr);
      pr = new Prato(2,"Ovos de codorna", 10);
      lista.insereInicio(pr);
      pr = new Prato(3,"Macarrons", 5); 
      lista.AddPrato(pr);
      
      System.out.println("Pratos da ementa");
      
      lista.imprimir();
      System.out.println();
      lista.delete(2);
      lista.imprimir();
      
      
	}

}
