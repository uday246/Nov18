package Nov12;

public class GremlinLab {
	public static void main(String[] arguments) {
		int numGremlins = Integer.parseInt(arguments[0]);
		if (numGremlins > 0) {
			// FIXED : class name is Gremlins not Gremlin
			Gremlins[] gremlins = new Gremlins[numGremlins];
			for (int i = 0; i < numGremlins; i++) {
				// FIXED : class name is Gremlins not Gremlin
				gremlins[i] = new Gremlins();
			}
			System.out.println("There are " + Gremlins.getGremlinCount() + " gremlins.");
		}
	}
}
