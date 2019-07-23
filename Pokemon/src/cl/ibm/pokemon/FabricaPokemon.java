package cl.ibm.pokemon;

public class FabricaPokemon{
		 
		  private Tipo hoja;
		  private Tipo fuego;
		  private Tipo agua;
		  private Habilidad placaje;
		  private Habilidad mordisco;
		  private Habilidad grunido;
		  private Habilidad furia;
		  

		public void FabricarPokemon(){
			
			Pokemon caterpie = new Pokemon (100,"caterpie", this.hoja );
			

		   
		   
		 }
		
		private void FabricarTipo() {
			
			this.hoja = new Tipo();
			this.fuego = new Tipo();
			this.agua = new Tipo();
		}

		private void FabricarHabilidad() {
			
			this.placaje = new Habilidad();
			this.mordisco = new Habilidad();
			this.grunido = new Habilidad();
			this.furia = new Habilidad();
		}
	
		}


