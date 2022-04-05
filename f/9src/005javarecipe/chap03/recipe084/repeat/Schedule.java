package jp.co.shoeisha.javarecipe.chapter03.recipe084.repeat;

import java.lang.annotation.Repeatable;

@Repeatable(Schedules.class)
public @interface Schedule {
	String dayOfMonth();
}
