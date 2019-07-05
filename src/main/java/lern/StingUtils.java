package lern;

public class StingUtils {
	
	public static String chopOff2StarsAtHead (String str) {
		if(str.length()<=2)
			return str.replaceAll(" ", "");
		String head = str.substring(0, 2);
		String tail = str.substring(2);
		
		return head.replaceAll(" ", "") + tail;
		
	}
	
	public static boolean are2CharsAtHeadAndTailEquel(String str) {
		if (str.length() <=1)
			return false;
		if (str.length() == 2)
			return true;
		String head = str.substring(0, 2);
		String tail = str.substring(str.length()-2);
		return head.equals(tail);
		
	}
	
	public static void upUserAge(User user) {
		user.setAge(user.getAge()+1);
	}
	
	
	
	

}
