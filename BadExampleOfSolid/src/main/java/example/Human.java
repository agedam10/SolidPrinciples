package example;

public class Human extends Plotter implements Report{

	@Override
	public void twoDGraph() {
		
		System.out.println("This is two dimensional graph by Human.");
		
	}

	@Override
	public void threeDGraph() {
		System.out.println("This is Three dimensional graph by Human.");
		//Oh !!! wait. But human can't plot 3D graph.
		//So this cannot completely replace the base class
		
	}

	@Override
	public void createPdfReport() {
		//Oops! Human you cant do that
		System.out.println("Pdf report created. !!!!");
		
	}

	@Override
	public void createPaperReport() {
		System.out.println("Paper report created.");
		
	}

	@Override
	public void emailSubmission() {
		// Oops! Human cant do that.
		System.out.println("Submitted by email.");
		
	}

	@Override
	public void physicalSubmission() {
		System.out.println("Submitted Physically.");
		
	}
	
}
