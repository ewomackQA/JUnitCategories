import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(SlowTests.class)
@SuiteClasses({A.class, B.class})
public class SlowTestSuite {
	// Will run A.b and B.c, but not A.a
}
// @RunWith(Categories.class)
// @IncludeCategory(SlowTests.class)
// @ExcludeCategory(FastTests.class)
// @SuiteClasses({A.class, B.class})
// public class SlowTestSuite {
// // Will run A.b, but not A.a or B.c
// }