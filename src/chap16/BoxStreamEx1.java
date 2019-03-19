package chap16;

import java.util.Arrays;

/*
 *asLongStream()   : IntStream->LongStream
 *asDoubleStream() : IntStream->DoubleStream
 *boxed()          : IntStream->Stream<Integer>
 */
public class BoxStreamEx1 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		System.out.println("IntStream->DoubleStream");
		Arrays.stream(arr).asDoubleStream().forEach(d->System.out.println(d));
		System.out.println("IntStream->LongStream");
		Arrays.stream(arr).asLongStream().forEach(l->System.out.println(l));
		System.out.println("IntStream->Stream<Integer>");
		Arrays.stream(arr).boxed().forEach(i->System.out.println(i.hashCode()));
	}
}
