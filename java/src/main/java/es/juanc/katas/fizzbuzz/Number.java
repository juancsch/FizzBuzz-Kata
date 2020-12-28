package es.juanc.katas.fizzbuzz;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
public class Number {
	public final Integer value;
	@Override
	public String toString() {
		return value.toString();
	}
}
