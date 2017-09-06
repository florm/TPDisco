//TP 1 - Disco
//Casuscelli, Alejandra y Martin, Florencia

package ar.edu.unlam.pb2;

public class Disco {

	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroExterior;
	private Double perimetroInterior;
	private Double superficie;
	
	//constructor clase Disco
		public Disco (Double radioInterior, Double radioExterior){
			
			this.radioInterior=radioInterior;
			this.radioExterior=radioExterior;
			this.perimetroInterior= actualizarPerimetroInterior();
			this.perimetroExterior= actualizarPerimetroExterior();
			//para calcular la superficie del disco se resta del area total del disco, el area del circulo interno,
			//ya que un disco tiene en el centro un area vacia
			this.superficie= actualizarSuperficie();	
		}
	
	//metodos get
		public Double getRadioInterior() {
			return radioInterior;
		}
		
		public Double getRadioExterior() {
			return radioExterior;
		}
		
		public Double getPerimetroExterior() {
			return perimetroExterior;
		}
		
		public Double getPerimetroInterior() {
			return perimetroInterior;
		}
		
		public Double getSuperficie() {
			return superficie;
		}
	
	//metodos set
		public void cambiarRadioInterior(Double radioInterior) {
			this.radioInterior = radioInterior;
			this.perimetroInterior=actualizarPerimetroInterior();
			this.superficie=actualizarSuperficie();	
		}
		
		public void cambiarRadioExterior(Double radioExterior) {
			this.radioExterior = radioExterior;
			this.perimetroInterior=actualizarPerimetroExterior();
			this.superficie=actualizarSuperficie();
		}
		
		public Double actualizarPerimetroInterior(){
			perimetroInterior=2 * Math.PI * this.radioInterior;
			return perimetroInterior;
		}
		
		public Double actualizarPerimetroExterior(){
			perimetroExterior=2 * Math.PI * this.radioExterior;
			return perimetroExterior;
		}
		
		public Double actualizarSuperficie(){
			this.superficie= Math.PI * Math.pow(this.radioExterior, 2)-Math.PI * Math.pow(this.radioInterior, 2);
			return superficie;
		}
	
}
