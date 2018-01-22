/* Simulates a physical device that performs 2's complement on a 32-bit input.
 *
 * Author: TODO
 */

public class Sim1_2sComplement
{
	public void execute()
	{
		for(int i=0; i<in.length; i++){
			notArray[i].in = in[i];
			notArray[i].execute();
			negated[i] = notArray[i].out;
		}
		add.a = negated;
		add.b = one;
		add.execute();
		out = add.sum;
		// TODO: fill this in!
		//
		// REMEMBER: You may call execute() on sub-objects here, and
		//           copy values around - but you MUST NOT create
		//           objects while inside this function.
	}



	// you shouldn't change these standard variables...
	public RussWire[] in; //change back to in
	public RussWire[] out;
	public RussWire[] one;
	public RussWire[] negated;
	public Sim1_NOT[] notArray;
	public Sim1_ADD add;


	// TODO: add some more variables here.  You must create them
	//       during the constructor below.  REMEMBER: You're not
	//       allowed to create any object inside the execute()
	//       method above!


	public Sim1_2sComplement()
	{
		in = new RussWire[32];
		negated = new RussWire[32];
		one = new RussWire[32];
		notArray = new Sim1_NOT[32];
		add = new Sim1_ADD();
		
		for (int i=0; i<32; i++)
		{
			in [i] = new RussWire(); 
			negated[i] = new RussWire();
			notArray[i] = new Sim1_NOT();
			one[i] = new RussWire();
			if(i == 0){
				one[i].set(true);
			}
			else{
				one[i].set(false);
			}
			
		}
	}
}

