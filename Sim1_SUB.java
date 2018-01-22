/* Simulates a physical device that performs (signed) subtraction on
 * a 32-bit input.
 *
 * Author: TODO
 */

public class Sim1_SUB
{
	public void execute()
	{
		twoComp.in = b;
		twoComp.execute();
		b = twoComp.out;
		add.a = a;
		add.b = b;
		add.execute();
		sum = add.sum;
		// TODO: fill this in!
		//
		// REMEMBER: You may call execute() on sub-objects here, and
		//           copy values around - but you MUST NOT create
		//           objects while inside this function.
	}



	// --------------------
	// Don't change the following standard variables...
	// --------------------

	// inputs
	public RussWire[] a,b;

	// outputs
	public RussWire[] sum;
	public RussWire   overflow;
	
	public Sim1_2sComplement twoComp;
	public Sim1_ADD add;

	// --------------------
	// But you should add some *MORE* variables here.
	// --------------------
	// TODO: fill this in



	public Sim1_SUB()
	{
		a = new RussWire[32];
		b = new RussWire[32];
		sum = new RussWire[32];
		twoComp = new Sim1_2sComplement();
		add = new Sim1_ADD();
		
		for (int i=0; i<32; i++)
		{
			a  [i] = new RussWire();
			b  [i] = new RussWire();
			sum[i] = new RussWire();
		}
	}
}