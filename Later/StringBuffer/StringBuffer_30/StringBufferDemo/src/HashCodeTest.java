public class HashCodeTest
{

	public static void main(String[] args)
	{

		System.out.println("Hashcode test of String:");
		
		/*
		 * String is immutable(once created, can not be
		 * modified).
		 */
		String str = "Welcome";
		System.out.println("Before Concat,HashCode = "
				+ str.hashCode());
		str = str + "Peter";
		System.out.println("After Concat,HashCode  = "
				+ str.hashCode());

		System.out.println("---------------------------------");

		System.out.println("Hashcode test of StringBuffer:");

		/*
		 * StringBuffer is mutable (once created, can be
		 * modified.
		 */
		StringBuffer sb = new StringBuffer("Welcome");
		System.out.println("Before Concat,HashCode = "
				+ sb.hashCode());
		sb.append("Peter");
		System.out.println("After Concat,HashCode  = "
				+ sb.hashCode());

	}
}