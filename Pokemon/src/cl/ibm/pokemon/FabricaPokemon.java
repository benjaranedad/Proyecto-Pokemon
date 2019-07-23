package cl.ibm.pokemon;

public class FabricaPokemon{
		  private static Pokemon caterpie;
		  private Pokemon squirtle;
		  private static Pokemon charmander;
		  private Tipo hoja;
		  private Tipo fuego;
		  private Tipo agua;

		public void FabricarPokemon(){
			
			
			
		   caterpie = new Pokemon();
		   squirtle = new Pokemon();
		   charmander = new Pokemon();
		   
		   
		 }
		
		public void FabricarTipo() {
			
			hoja = new Tipo();
			fuego = new Tipo();
			agua = new Tipo();
		}
		
		
		

		
	
		}


