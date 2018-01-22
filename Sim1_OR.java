/* Simulates a physical OR gate.
 *
 * Author: TODO
 */

public class Sim1_OR
{
	public void execute()
	{
		if(a.get() == true){
			out.set(true);
		}
		else if(b.get() == true){
			out.set(true);
		}
		else{
			out.set(false);
		}
	}



	public RussWire a,b;   // inputs
	public RussWire out;   // output

	public Sim1_OR()
	{
		a = new RussWire();
		b = new RussWire();
		out = new RussWire();
	}
}
