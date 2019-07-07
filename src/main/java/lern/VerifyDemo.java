package lern;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class VerifyDemo {

	public static void main(String[] args)
			throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<?> clazz = Class.forName("lern.Pupil");
		Method[] methods = clazz.getMethods();

		final Pupil pupil = new Pupil();
		
		//Arrays.stream(methods).forEach(new VerifyDemo()::invokeVerifyMethod); нужно убрать pupil из параметра метода
		Arrays.stream(methods).forEach((m) -> new VerifyDemo().invokeVerifyMethod(m,pupil));

	}

	public void invokeVerifyMethod(Method method,Pupil pupil) {
		
		Verify v = method.getAnnotation(lern.Verify.class);
		if (v != null) {
			Object result;
			try {
				result = method.invoke(pupil); // выполнение метода, чтоб его вызвать нужен екземпляр, который мы и передаем.
				verifyResult(result, method); // проверка результат выполнения, бизнесс-логика
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void verifyResult(Object result, Method method) {
		if ((Boolean) result == true) { //знаем что методы возвращают boolean result
			System.out.println(method.getName() + " passed.");
		} else {
			System.out.println(method.getName() + " faild.");
		}
	}

}
