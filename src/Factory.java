import java.util.Random;

public class Factory 
{
	private static int seed;
	private static Random gen;
	
	public Factory(int seed)
	{
		Factory.seed = seed;
		gen = new Random(seed);
	}
	public static Biomorph createRandomBiomorph()
	{
		//complexity 2-5
		//max depth 5-15
		//probOfNewLimb 3-5 (whatever gets passed in, there is a 1 in n chance of it happening)
		int complexity = (gen.nextInt(4)+2);
		int maxDepth = (gen.nextInt(9) +5);
		int probOfNewLimb = (gen.nextInt(3)+3);
		Biomorph b = new Biomorph(seed, complexity, maxDepth, probOfNewLimb);
		return b;
	}
	
	public static Biomorph createSetBiomorph(int complexity, int maxDepth, int probNewLimb)
	{
		//complexity 2-5
		//max depth 5-15
		//probOfNewLimb 3-5 (whatever gets passed in, there is a 1 in n chance of it happening)
		Biomorph b = new Biomorph(seed, complexity, maxDepth, probNewLimb);
		return b;
	}
	
	public static Biomorph mutateGivenBiomorph(Biomorph parent)
	{
		
	}
	
	public static Limb createLimb(int[] genes)
	{
		//genes given are genes of the last limb
		//create new limb, then mutate it
		//return mutated limb, discard temp limb
		
	}
	
	public static int getSeed()
	{
		return seed;
	}
}
