package edu.pku.sei.boparser;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class JavaParserTest {

	private void test(String expr, int tokenNum) {
		List<Token> list = JavaParser.parseExpression(expr);
		assertEquals(list.size(), tokenNum);
		JavaParser.dump();
	}
	
	@Test
	public void testParseExpression() {
		test("a || b", 3);
		test("x.foo(y)", 6);
		test("a + aaa + b", 5);
		test("x instanceof Integer", 3);
	}
}
