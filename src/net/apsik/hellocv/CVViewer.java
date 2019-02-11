package net.apsik.hellocv;

import net.apsik.hellocv.skills.Experience;
import net.apsik.hellocv.skills.Language;
import net.apsik.hellocv.skills.ProgramingLanguage;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CVViewer extends JFrame {
	public CVViewer(Person person){
		setLayout(new BorderLayout());

		JLabel name = new JLabel(person.getFullName());
		name.setFont(new Font(name.getFont().getName(), Font.PLAIN, 30));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBackground(Color.YELLOW);
		name.setOpaque(true);
		add(name, BorderLayout.NORTH);

		Calendar birthday = person.getBirthday();
		SimpleDateFormat form = new SimpleDateFormat("dd MMMMMMMMMM yyyy");
		form.setCalendar(birthday);
		JLabel birthdayLabel = new JLabel(form.format(birthday.getTime()));
		birthdayLabel.setPreferredSize(new Dimension(200, 100));
		birthdayLabel.setBackground(Color.YELLOW);
		birthdayLabel.setOpaque(true);

		JPanel leftSite = new JPanel();
		leftSite.setLayout(new BoxLayout(leftSite, BoxLayout.Y_AXIS));
		leftSite.setBackground(Color.CYAN);
		leftSite.add(birthdayLabel);
		add(leftSite, BorderLayout.WEST);






	}

	public static void main(String... args){
		Person person = new Person("Dariusz", "Madeja",
				new GregorianCalendar(1996, Calendar.JUNE, 26));

		//Schools
		School Sokol = new School(  "Zespół Szkół nr.1",
				"Władysław Orkan",
				"Nowy Targ",
				School.Type.TECHNICAL);
		Education technikum = new Education(new GregorianCalendar(2012, Calendar.SEPTEMBER, 1),
				new GregorianCalendar(2017, Calendar.MAY, 31),
				Sokol,
				Education.Direction.INFORMATIONS);

		School AGH = new School("Akademia górniczo-hutnicza",
				"Stanisław Staszic",
				"Kraków",
				School.Type.ACADEMY);
		Education studia = new Education(new GregorianCalendar(2017, Calendar.OCTOBER, 1),
				null,
				AGH,
				Education.Direction.INFORMATIONS);

		String opisPracyEuro =  "- doractwo w zakresie doboru urządeń do indywidualnych porzeb oraz możliwości finansowych klienta, \n" +
				"- sprzedaż produktów i ubezpieczeń \n" +
				"- dbanie o czystość i porządek na sklepie ";
		Job euro = new Job("Doradca Kilienta",
				"RTV euro AGD",
				new GregorianCalendar(2017, Calendar.NOVEMBER, 6),
				null,
				opisPracyEuro);

		// Language skills
		Language angielski = new Language(Language.ENGLISH,
				new Experience(Experience.Level.INTERMEDIATE, 59),
				new Experience(Experience.Level.BEGINNER, 61));

		// Programing skills
		ProgramingLanguage java = new ProgramingLanguage(ProgramingLanguage.JAVA,
				new Experience(Experience.Level.INTERMEDIATE, 82));
		java.addLibrary("Standard Libraries");
		java.addLibrary("JUnit");

		ProgramingLanguage cpp = new ProgramingLanguage(ProgramingLanguage.CPP,
				new Experience(Experience.Level.INTERMEDIATE, 5));
		cpp.addLibrary("Standard Libraries");
		cpp.addLibrary("Glut");

		ProgramingLanguage c = new ProgramingLanguage(ProgramingLanguage.C,
				new Experience(Experience.Level.INTERMEDIATE, 35));

		ProgramingLanguage html = new ProgramingLanguage(ProgramingLanguage.HTML,
				new Experience(Experience.Level.ADVANCED, 31));

		ProgramingLanguage css = new ProgramingLanguage(ProgramingLanguage.CSS,
				new Experience(Experience.Level.ADVANCED, 54));
		css.addLibrary("SCSS");

		ProgramingLanguage javascript = new ProgramingLanguage(ProgramingLanguage.JAVASCRIPT,
				new Experience(Experience.Level.INTERMEDIATE, 72));
		javascript.addLibrary("jQuery");

		ProgramingLanguage xml = new ProgramingLanguage(ProgramingLanguage.XML,
				new Experience(Experience.Level.ADVANCED, 2));

		person.addEducation(technikum);
		person.addEducation(studia);

		person.addJob(euro);

		person.addSkill(angielski);
		person.addSkill(java);
		person.addSkill(cpp);
		person.addSkill(c);
		person.addSkill(html);
		person.addSkill(css);
		person.addSkill(javascript);
		person.addSkill(xml);

		CVViewer viewer = new CVViewer(person);
		viewer.setTitle("Test CV");
		viewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//viewer.pack();
		viewer.setSize(707, 1000);
		viewer.setResizable(false);
		viewer.setVisible(true);
	}
}
