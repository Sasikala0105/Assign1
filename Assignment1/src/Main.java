public class Main {
public static void main(String[]args) {
Participant p1 = new Participant("Sasikala", "Gauthaman", "23","01133905160","Indian", " 789G Jalan Sungai Dua");
Yoga y1 = new Yoga("StressRelief","Insomnia","Obesity","BackPain","BloodPressure");
StressRelief s1 = new StressRelief("sukhasana", "balasana");

System.out.println("\t");

System.out.println("Customer Personal Information");
System.out.println(" First Name: "+p1.getfirstname());
System.out.println(" Last Name: "+p1.getlastname());
System.out.println(" Age: "+p1.getage());
System.out.println(" Phone Number: "+p1.getphonenumber());
System.out.println(" Race : "+p1.getrace());
System.out.println(" Address :" + p1.getaddress());

System.out.println("\t");

y1.setPackages("Stress Relief", "Insomnia","Obesity","Back Pain","Blood Pressure");
System.out.println("Yoga Packages you can choose to join : ");
System.out.println(" 1. " +y1.getStressRelief());
System.out.println(" 2. " +y1.getInsomnia());
System.out.println(" 3. " +y1.getObesity());
System.out.println(" 4. " +y1.getBackPain());
System.out.println(" 5. " +y1.getBloodPressure());

System.out.println("\t");

s1.setPoses("Sukhasana", "Balasana");
System.out.println("Example of poses for stress relief package");
System.out.println(" 1. "+s1.getsukhasana());
System.out.println(" 2. "+s1.balasana);

}
}