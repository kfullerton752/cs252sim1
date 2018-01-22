/* Simulates a physical device that performs (signed) addition on
 * a 32-bit input.
 *
 * Author: TODO
 */

public class Sim1_ADD
{
	public void execute()
	{
		boolean carry = false;
		for(int i = 0; i < a.length; i++){
			if(a[i].get() == false && b[i].get() == false){//both zero
				if(carry){
					sum[i].set(true);
					carry = false;
				}
				else{
					sum[i].set(false);
				}
			}
			
			else if (a[i].get() == true && b[i].get() == true){ //both one
				if(carry){
					sum[i].set(true);
				}
				else{
					sum[i].set(false);
					carry = true;
					
				}
			}
			
			else{
				if(carry){
					sum[i].set(false);
				}
				else{
					sum[i].set(true);
				}
				
			}
		}
		
		if((a[31].get() == b[31].get()) && (sum[31].get() != a[31].get())){
			overflow.set(true);
		}
		else{
			overflow.set(false);
		}
		carryOut.set(carry);	
	}

	// ------ DON'T CHANGE ANYTHING BELOW THIS LINE ------

	// inputs
	public RussWire[] a,b;
	public Sim1_AND and;

	// outputs
	public RussWire[] sum;
	public RussWire   carryOut, overflow;

	public Sim1_ADD()
	{
		/* Instructor's Note:
		 *
		 * In Java, to allocate an array of objects, you need two
		 * steps: you first allocate the array (which is full of null
		 * references), and then a loop which allocates a whole bunch
		 * of individual objects (one at a time), and stores those
		 * objects into the slots of the array.
		 */

		a   = new RussWire[32];
		b   = new RussWire[32];
		sum = new RussWire[32];
		and = new Sim1_AND();
		carryOut = new RussWire();
		overflow = new RussWire();
		
		

		for (int i=0; i<32; i++)
		{
			a  [i] = new RussWire();
			b  [i] = new RussWire();
			sum[i] = new RussWire();
		}
	}
}
