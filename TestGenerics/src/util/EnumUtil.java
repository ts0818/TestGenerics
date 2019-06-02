package util;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class EnumUtil {

	public static <T extends Enum<T>, U> Optional<T> of(Class<T> clazz, Function<T, U> get, U value) {
		return Stream.of(clazz.getEnumConstants())
				.filter(i -> get.apply(i).equals(value))
				.findFirst();
	}
}
