
public class Ementa {
   private Prato prim = null;
   
   public void AddPrato(Prato novoP)//adicionar na ordem da lista, o primeiro é o primeiro
   {
	 if(prim == null)  
	 {
		 prim =  novoP ;
	 }
	 else {
		 Prato temp = prim;
		 while(temp.getProx()!=null)
		 {
			 temp = temp.getProx();
		 }
		 temp.setProx(novoP); 		 
	 }}
   
   public void insereInicio(Prato novoP)//o elemento selecionado é o 1º da lista
   {
	   novoP.setProx(prim);
	   prim = novoP;
   }
   
   public void imprimir()
   {
	   Prato temp = prim;
	   while(temp!=null)
	   {
		   System.out.println(temp.getNome() + ":"+ temp.getPreco() + " euros");
		   temp = temp.getProx();
	   }
   }//fim de imprimir
   
   public Prato delete(int pr)
   {
	   Prato temp = prim;
	   if(prim.getCod()==pr)
	   {
		   prim = prim.getProx();
		   temp = prim;
	   }
	   else
	   {
		   temp = prim.getProx();
		   Prato ant = prim;
		   while((temp != null) && (temp.getCod() != pr))
		   {
			 ant = temp;
			 temp = temp.getProx();
		   }
		   //if(temp!=null){ 
			   //  x-1       	   x+1
			   ant.setProx(temp.getProx());
		   //
		   }//fim do else
	   return temp;
   }
}
