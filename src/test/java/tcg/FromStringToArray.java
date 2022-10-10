package tcg;

import org.junit.jupiter.params.converter.SimpleArgumentConverter;

public class FromStringToArray extends SimpleArgumentConverter {
		
	@Override
	protected Object convert(Object source, Class<?> targetType) {
		String strSource = ((String)source);
		strSource = strSource.substring(1, strSource.length()-1);
		String[] strArray = strSource.split(",");
		int[] array = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			array[i] = Integer.valueOf(strArray[i]);
		}
		return array;
	}
}
