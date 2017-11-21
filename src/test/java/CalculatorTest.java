import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());
	Calculator calculator = new Calculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testAddSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddZeros() {
		// testing 0 + 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber + secondNumber;

		LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		for (int i = 0; i < 200; i++) {

			// testing 0 + random
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

			// testing random + 0
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = 0;
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -(100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -(100)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testAddLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			result = firstNumber + secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.add(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSubtractSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSubtractMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSubtractLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSubtractZeros() {
				
			// testing 0 - 0
			double firstNumber = 0;
			double secondNumber = 0;
			double result = firstNumber - secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

			for (int i = 0; i < 200; i++) {

				// testing 0 - random
				firstNumber = 0;
				secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
				result = firstNumber - secondNumber;

				LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
				assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

				// testing random - 0
				firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
				secondNumber = 0;
				result = firstNumber - secondNumber;

				LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
				assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);


		}
	}

	@Test
	public void testSubtractSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSubtractMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -(100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -(100)));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testSubtractLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			result = firstNumber - secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.subtract(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiplySmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiplyMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiplyLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiplyZeros() {
		// testing 0 * 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber * secondNumber;

		LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		for (int i = 0; i < 200; i++) {

		// testing 0 * random
		firstNumber = 0;
		secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
		result = firstNumber * secondNumber;

		LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		// testing random * 0
		firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
		secondNumber = 0;
		result = firstNumber * secondNumber;

		LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiplySmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiplyMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -(100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -(100)));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testMultiplyLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			result = firstNumber * secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.multiply(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testDivideSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 10));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testDivideMediumSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 100));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testDivideLargeSizedPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testDivideZeros() {
		// testing 0 / 0
		double firstNumber = 0;
		double secondNumber = 0;
		double result = firstNumber / secondNumber;

		LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
		assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		for (int i = 0; i < 200; i++) {

			// testing 0 / random
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

			// testing random / 0
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = 0;
			result = firstNumber / secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testDivideSmallSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-10)));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testDivideMediumSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * -(100)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * -(100)));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}

	@Test
	public void testDivideLargeSizedNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 200; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			secondNumber = Double.valueOf(df.format(random.nextDouble() * (-1000)));
			result = firstNumber / secondNumber;

			LOG.info("Testing the method with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(calculator.divide(firstNumber, secondNumber)), Math.round(result), 1);

		}
	}
}
