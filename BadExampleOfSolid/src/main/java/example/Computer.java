package example;

public class Computer extends Plotter implements Report{
	
	
	@Override
	public void twoDGraph() {
		System.out.println("This is two dimensional graph by Computer.");
		
	}

	@Override
	public void threeDGraph() {
		System.out.println("This is Three dimensional graph by Computer.");
		
	}

	@Override
	public void createPdfReport() {
		System.out.println("Pdf report Created");
		
	}

	@Override
	public void createPaperReport() {
		System.out.println("Paper report created.");
		
	}

	@Override
	public void emailSubmission() {
		System.out.println("Submitted through email.");
		
	}

	@Override
	public void physicalSubmission() {
		System.out.println("Submitted physically.");
		
	}
	
}
