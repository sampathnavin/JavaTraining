package Abstract;

public class VotingCheck extends VotingRules{

	@Override
	public void age() {
		System.out.println("Age should be greater than 18");
		
	}

	@Override
	public void aadhar() {
		System.out.println("should have valid aadhar card");
		
	}

	@Override
	public void photovalidation() {
		System.out.println("should have valid Photo ID");
		
		
	}

}
