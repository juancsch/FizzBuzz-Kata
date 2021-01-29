package es.juanc.katas.fizzbuzz;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
public class FBNumber {
	public final Integer value;
	@Override
	public String toString() {
		return value.toString();
	}
}
